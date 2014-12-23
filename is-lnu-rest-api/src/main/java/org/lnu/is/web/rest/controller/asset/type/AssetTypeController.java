package org.lnu.is.web.rest.controller.asset.type;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.type.AssetTypeResource;
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
public class AssetTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(AssetTypeController.class);

	@Resource(name = "assetTypeFacade")
	private Facade<AssetTypeResource, Long> facade;

	/**
	 * Method for getting Asset Types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result 
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Asset Types")
	public PagedResultResource<AssetTypeResource> getAssetTypes(
			@Offset final Integer offset,
			@Limit final Integer limit, final AssetTypeResource resource) {
		LOG.info("Getting PagedResultResource for Asset Tyoe with offset: {}, limit: {}", offset, limit);
		PagedRequest<AssetTypeResource> request = new PagedRequest<AssetTypeResource>(resource, offset, limit);
		return facade.getResources(request);
	}
}
