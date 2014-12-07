package org.lnu.is.web.controller.enrolment.subject;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.subject.EnrolmentSubjectResource;
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
 * Enrolment Subject controller.
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/enrolments")
@Api(value = "Enrolment Subjects", description = "Controller for getting enrolment subjects")
public class EnrolmentSubjectController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentSubjectController.class);

	@Resource(name = "enrolmentSubjectFacade")
	private Facade<EnrolmentSubjectResource, Long> facade;

	/**
	 * Method for getting enrolment subjects.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return Paged Result Resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/subjects", method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment Subjects")
	public PagedResultResource<EnrolmentSubjectResource> getEnrolmentSubjects(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "43") final Integer limit, 
			final EnrolmentSubjectResource resource) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", offset, limit);
		PagedRequest<EnrolmentSubjectResource> request = new PagedRequest<EnrolmentSubjectResource>(resource, offset, limit);
		return facade.getResources(request);
	}

}
