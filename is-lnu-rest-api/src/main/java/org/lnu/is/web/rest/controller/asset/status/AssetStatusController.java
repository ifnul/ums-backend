package org.lnu.is.web.rest.controller.asset.status;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.status.AssetStatusResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Asset Status Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/assets/statuses")
public class AssetStatusController extends BaseController implements PagedController<AssetStatusResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AssetStatusController.class);
	
	@Resource(name = "assetStatusFacade")
	private Facade<AssetStatusResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<AssetStatusResource> getPagedResource(final PagedRequest<AssetStatusResource> request) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Asset Status by id")
	public AssetStatusResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
