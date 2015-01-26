package org.lnu.is.web.rest.controller.asset;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.asset.AssetResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Asset Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/assets")
@Api(value = "Asset Controller")
public class AssetController extends BaseController implements CrudController<AssetResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AssetController.class);
	
	@Resource(name = "assetFacade")
	private Facade<AssetResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Asset")
	public AssetResource createResource(@Valid @RequestBody final AssetResource resource) {
		LOG.info("Creating asset: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Asset")
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final AssetResource resource) {
		LOG.info("Updated asset with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Asset Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Asset by id")
	public AssetResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving asset with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Asset by id")
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Asset removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Assets")
	public PagedResultResource<AssetResource> getPagedResource(final PagedRequest<AssetResource> request) {
		LOG.info("Retrieving PagedResultResource for Asset Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
