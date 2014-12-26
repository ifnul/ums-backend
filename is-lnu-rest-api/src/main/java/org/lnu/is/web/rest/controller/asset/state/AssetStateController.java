package org.lnu.is.web.rest.controller.asset.state;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.asset.state.AssetStateResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Asset State Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/assets/states")
public class AssetStateController extends BaseController implements PagedController<AssetStateResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AssetStateController.class);
	
	@Resource(name = "assetStateFacade")
	private Facade<AssetStateResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<AssetStateResource> getPagedResource(final PagedRequest<AssetStateResource> request) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Asset State by id")
	public AssetStateResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting asset state resource: {}", id);
		return facade.getResource(id);
	}

}
