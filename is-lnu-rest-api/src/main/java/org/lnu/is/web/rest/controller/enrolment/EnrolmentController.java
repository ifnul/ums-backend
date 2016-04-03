package org.lnu.is.web.rest.controller.enrolment;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import org.lnu.is.facade.facade.enrolment.EnrolmentFacade;
import org.lnu.is.resource.enrolment.EnrolmentResource;
import org.lnu.is.resource.enrolment.RatingResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Controller for enrolments.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/enrolments")
@Api(value = "Enrolments", description = "Enrolments", position = 2)
public class EnrolmentController extends BaseController implements CrudController<EnrolmentResource, EnrolmentResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentController.class);

	@Resource(name = "enrolmentFacade")
	private EnrolmentFacade facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Enrolment", position = 1)
	public EnrolmentResource createResource(@Valid @RequestBody final EnrolmentResource enrolmentResource) {
		LOG.info("Creating enrolment : {} ", enrolmentResource);
		return facade.createResource(enrolmentResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Enrolment", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id, 
			@Valid @RequestBody final EnrolmentResource resource) {
		LOG.info("Updating enrolment with id : {} , {} ", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Enrolment Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment", position = 3)
	public EnrolmentResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving enrolment with id : {} ", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Remove Enrolment", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing enrolment with id : {} ", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Enrolment Removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolments")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "offset", value = "Offset", required = false, defaultValue = "0", dataType = "long", paramType = "query"),
			@ApiImplicitParam(name = "limit", value = "limit", required = false, defaultValue = "20", dataType = "long", paramType = "query"),
			@ApiImplicitParam(name = "resource", value = "resource", required = false, dataType = "EnrolmentResource", paramType = "EnrolmentResource")
	})
	public PagedResultResource<EnrolmentResource> getPagedResource(final PagedRequest<EnrolmentResource> request) {
		LOG.info("Retrieving enrolments with offset {}, limit {} ", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@RequestMapping(value = "/{specofferId}/ratings")
	public RatingResource getEnrolmentsRatingResource(@PathVariable("specofferId") long specofferId) {
		LOG.info("Getting rating enrolment list for specofferId: {}", specofferId);
		return facade.getRatingEnrolments(specofferId);
	}

}
