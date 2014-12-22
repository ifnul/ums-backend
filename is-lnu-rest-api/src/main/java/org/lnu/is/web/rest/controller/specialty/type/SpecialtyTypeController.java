package org.lnu.is.web.rest.controller.specialty.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.type.SpecialtyTypeResource;
import org.lnu.is.web.rest.annotation.Limit;
import org.lnu.is.web.rest.annotation.Offset;
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
 * Controller for specialty types.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specialties/types")
@Api("Specialty Types")
public class SpecialtyTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecialtyTypeController.class);
	
	@Resource(name = "specialtyTypeFacade")
	private Facade<SpecialtyTypeResource, Long> facade;
	
	/**
	 * Method for getting paged result of married types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Specialty Types")
	public PagedResultResource<SpecialtyTypeResource> getSpecialtyTypes(@Offset final Integer offset,
			@Limit final Integer limit, final SpecialtyTypeResource resource) {
		LOG.info("Getting PagedResultResource for Specialty Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<SpecialtyTypeResource> request = new PagedRequest<SpecialtyTypeResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
