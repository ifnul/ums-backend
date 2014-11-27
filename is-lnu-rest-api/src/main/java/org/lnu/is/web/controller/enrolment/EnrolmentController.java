package org.lnu.is.web.controller.enrolment;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.enrolment.statustype.EnrolmentStatusTypeFacade;
import org.lnu.is.facade.facade.enrolment.subject.EnrolmentSubjectFacade;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
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
 * Controller for enrolments.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/enrolments")
@Api(value = "Enrolments", description = "Enrolments")
public class EnrolmentController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentController.class);

	@Resource(name = "enrolmentStatusTypeFacade")
	private EnrolmentStatusTypeFacade enrolmentStatusTypeFacade;
	
	@Resource(name = "enrolmentSubjectFacade")
	private EnrolmentSubjectFacade enrolmentSubjectFacade;
	
	/**
	 * Method for getting enrolment status types.
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
			@RequestParam(value = "limit", defaultValue = "38") final Integer limit,
			final EnrolmentStatusTypeResource resource) {
		LOG.info("Getting PagedResultResource for Enrolment Status Type with  offset: {}, limit: {}", offset, limit);
		PagedRequest<EnrolmentStatusTypeResource> request = new PagedRequest<EnrolmentStatusTypeResource>(resource, offset, limit);
		return enrolmentStatusTypeFacade.getEntities(request);
	}
	
	/**
	 * Method for getting paged result for enrolment subjects.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/subjects", method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment Subjects")
	public PagedResultResource<EnrolmentSubjectResource> getEnrolmentSubjects(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "38") final Integer limit,
			final EnrolmentSubjectResource resource) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", offset, limit);
		PagedRequest<EnrolmentSubjectResource> request = new PagedRequest<EnrolmentSubjectResource>(resource, offset, limit);
		return enrolmentSubjectFacade.getEntities(request);
	}
}
