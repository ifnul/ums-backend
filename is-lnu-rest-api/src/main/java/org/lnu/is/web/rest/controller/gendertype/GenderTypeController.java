package org.lnu.is.web.rest.controller.gendertype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.gendertype.GenderTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
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
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping(value = "/gendertypes")
@Api(value = "Gender Types", description = "Gender Types")
public class GenderTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(GenderTypeController.class);

	@Resource(name = "genderTypeFacade")
	private Facade<GenderTypeResource, Long> facade;

	/**
	 * Method for getting gender types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Gender Types")
	public PagedResultResource<GenderTypeResource> getGenderTypes(@Offset final Integer offset,
			@Limit final Integer limit, final GenderTypeResource resource) {
		LOG.info("Getting PagedResultResource for Gender Type with  offset: {}, limit: {}", offset, limit);
		PagedRequest<GenderTypeResource> request = new PagedRequest<GenderTypeResource>(resource, offset, limit);
		return facade.getResources(request);
	}

}
