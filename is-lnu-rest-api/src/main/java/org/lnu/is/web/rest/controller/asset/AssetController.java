package org.lnu.is.web.rest.controller.asset;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.AssetResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
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
public class AssetController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(AssetController.class);
	
	@Resource(name = "assetFacade")
	private Facade<AssetResource, Long> facade;

	/**
	 * Method for creating new asset.
	 * @param resource
	 * @return asset with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Asset")
	public AssetResource createAsset(@RequestBody final AssetResource resource) {
		LOG.info("Creating asset: {}", resource);
		return facade.createResource(resource);
	}
	
	/**
	 * Method for updating department.
	 * @param id identifier
	 * @param resource 
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Asset")
	public MessageResource updateAsset(@PathVariable("id") final Long id,
			@RequestBody final AssetResource resource) {
		LOG.info("Updated asset with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Asset Updated");
	}
	
	/**
	 * Method for getting asset by it's id.
	 * @param id identifier.
	 * @return asset resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Asset by id")
	public AssetResource getAsset(@PathVariable("id") final Long id) {
		LOG.info("Retrieving asset with id: {}", id);
		return facade.getResource(id);
	}
	
	/**
	 * Method for removing asset.
	 * http://localhost:8080/is-lnu-rest-api/api/assets/1
	 * Http Method - DELETE.
	 * @param id identifier.
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Asset by id")
	public MessageResource removeAsset(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Asset removed");
	}
	
	/**
	 * Method for paged search.
	 * @param offset start position.If not specified, default value will be - 0.
	 * @param limit maximum results. If not specified, default value will be - 20.
	 * @param resource - all form parameters.
	 * @return Paged Result with generated entities.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Assets")
	public PagedResultResource<AssetResource> getSpecialties(@Offset final Integer offset,
			@Limit final Integer limit, final AssetResource resource) {
		LOG.info("Retrieving PagedResultResource for Asset Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<AssetResource> request = new PagedRequest<AssetResource>(resource, offset, limit);
		return facade.getResources(request);
	}	
}
