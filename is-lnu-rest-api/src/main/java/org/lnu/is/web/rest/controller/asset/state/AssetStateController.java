package org.lnu.is.web.rest.controller.asset.state;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.state.AssetStateResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
public class AssetStateController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(AssetStateController.class);
	
	@Resource(name = "assetStateFacade")
	private Facade<AssetStateResource, Long> facade;
	
	/**
	 * Method for getting paged result of married types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<AssetStateResource> getAssetStates(@Offset final Integer offset,
			@Limit final Integer limit, final AssetStateResource resource) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<AssetStateResource> request = new PagedRequest<AssetStateResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
