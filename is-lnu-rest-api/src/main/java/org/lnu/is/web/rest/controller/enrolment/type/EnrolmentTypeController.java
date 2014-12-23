package org.lnu.is.web.rest.controller.enrolment.type;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.type.EnrolmentTypeResource;
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

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Enrolment Type Controller.
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/enrolments")
@ApiModel("Enrolment Types")
public class EnrolmentTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentTypeController.class);

	@Resource(name = "enrolmentTypeFacade")
	private Facade<EnrolmentTypeResource, Long> facade;

	/**
	 * Method for getting enrolment types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/types", method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment Types")
	public PagedResultResource<EnrolmentTypeResource> getPersonTypes(@Offset final Integer offset,
			@Limit(defaultValue = "32") final Integer limit, final EnrolmentTypeResource resource) {
		LOG.info("Retrieving PagedResultResource for Enrolment Types with offset: {}, limit: {}", offset, limit);
		PagedRequest<EnrolmentTypeResource> pagedRequest = new PagedRequest<EnrolmentTypeResource>(resource, offset, limit);
		return facade.getResources(pagedRequest);
	}

}
