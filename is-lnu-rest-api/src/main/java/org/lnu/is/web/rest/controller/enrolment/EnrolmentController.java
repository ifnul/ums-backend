package org.lnu.is.web.rest.controller.enrolment;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.EnrolmentResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for enrolments.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/enrolments")
@Api(value = "Enrolments", description = "Enrolments", position = 2)
public class EnrolmentController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentController.class);

	@Resource(name = "enrolmentFacade")
	private Facade<EnrolmentResource, Long> facade;

	/**
	 * Method for creating Enrolment.
	 * 
	 * @param enrolmentResource
	 * @return enrolment resource
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Enrolment", position = 1)
	public EnrolmentResource createEnrolment(@RequestBody final EnrolmentResource enrolmentResource) {
		LOG.info("Creating enrolment : {} ", enrolmentResource);
		return facade.createResource(enrolmentResource);
	}
	/**
	 * Method for updating Enrolment.
	 * @param id
	 * @param enrolmentResource
	 * @return Message resource
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Enrolment", position = 2)
	public MessageResource updateEnrolment(@PathVariable("id") final Long id, 
			@RequestBody final EnrolmentResource enrolmentResource) {
		LOG.info("Updating enrolment with id : {} , {} ", id, enrolmentResource);
		facade.updateResource(id, enrolmentResource);
		return new MessageResource(MessageType.INFO, "Enrolment Updated");
	}

	/**
	 * Method for retrieving Enrolment.
	 * @param id
	 * @return Enrolment resource
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment", position = 3)
	public EnrolmentResource getEnrolment(@PathVariable("id") final Long id) {
		LOG.info("Retrieving enrolment with id : {} ", id);
		return facade.getResource(id);
	}
	/**
	 * Method for removing Enrolment.
	 * @param id
	 * @return Message resource
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Remove Enrolment", position = 4)
	public MessageResource removeEnrolment(@PathVariable("id") final Long id) {
		LOG.info("Removing enrolment with id : {} ", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Enrolment Removed");
	}
	/**
	 * Method for retrieving all Enrolments.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return Paged Result Resource
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolments", position = 5)
	public PagedResultResource<EnrolmentResource> getEnrolments(@Offset final Integer offset,
			@Limit final Integer limit, final EnrolmentResource resource) {
		LOG.info("Retrieving enrolments with offset {}, limit {} ", offset, limit);
		PagedRequest<EnrolmentResource> pagedRequest = new PagedRequest<EnrolmentResource>(resource, offset, limit);
		return facade.getResources(pagedRequest);
	}

}
