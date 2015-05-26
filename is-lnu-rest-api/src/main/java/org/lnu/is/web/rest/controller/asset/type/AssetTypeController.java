package org.lnu.is.web.rest.controller.asset.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.asset.type.AssetTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
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

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Asset type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/assets/types")
@Api("Asset Type Controller")
public class AssetTypeController extends BaseController implements PagedController<AssetTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AssetTypeController.class);

	@Resource(name = "assetTypeFacade")
	private Facade<AssetTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Asset Types")
	public PagedResultResource<AssetTypeResource> getPagedResource(final PagedRequest<AssetTypeResource> request) {
		LOG.info("Getting PagedResultResource for Asset Tyoe with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Asset Type by id")
	public AssetTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
