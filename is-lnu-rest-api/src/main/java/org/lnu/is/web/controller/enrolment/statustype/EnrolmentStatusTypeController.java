package org.lnu.is.web.controller.enrolment.statustype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Enrolment Status Type Controller.
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/enrolments")
@Api(value = "Enrolment Status Types", description = "Controller for getting enrolment status types")
public class EnrolmentStatusTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentStatusTypeController.class);

	@Resource(name = "enrolmentStatusTypeFacade")
	private Facade<EnrolmentStatusTypeResource, Long> facade;

	/**
	 * Method for getting enrolment status types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/statustypes", method = RequestMethod.GET)
	@ApiOperation(value = "Get All Enrolment Status Types")
	public PagedResultResource<EnrolmentStatusTypeResource> getEnrolmentStatusTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit, 
			final EnrolmentStatusTypeResource resource) {
		LOG.info("Getting PagedResultResource for Enrolment Status Type with  offset: {}, limit: {}", offset, limit);
		PagedRequest<EnrolmentStatusTypeResource> request = new PagedRequest<EnrolmentStatusTypeResource>(resource, offset, limit);
		return facade.getResources(request);
	}

}
