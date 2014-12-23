package org.lnu.is.web.rest.controller.timeperiod;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
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
 * Time Period Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/timeperiods")
@Api("Time Periods")
public class TimePeriodController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(TimePeriodController.class);
	
	@Resource(name = "timePeriodFacade")
	private Facade<TimePeriodResource, Long> facade;
	

	/**
	 * Method for creating new timePeriod.
	 * @param resource
	 * @return timePeriod with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Person")
	public TimePeriodResource createTimePeriod(@Valid @RequestBody final TimePeriodResource resource) {
		LOG.info("Creating timePeriod: {}", resource);
		return facade.createResource(resource);
	}

	/**
	 * Method for updating timePeriod.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update TimePeriod")
	public MessageResource updateTimePeriod(@PathVariable("id") final Long id,
			@RequestBody final TimePeriodResource resource) {
		LOG.info("Updating timePeriod with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "TimePeriod Updated");
	}

	/**
	 * Method for getting timePeriod by identifier.
	 * @param id
	 * @return timePeriod.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get TimePeriod by id")
	public TimePeriodResource getTimePeriod(@PathVariable("id") final Long id) {
		LOG.info("Retrieving timePeriod with id: {}", id);
		return facade.getResource(id);
	}

	/**
	 * Method for removing timePeriod.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete TimePeriod")
	public MessageResource removeTimePeriod(@PathVariable("id") final Long id) {
		LOG.info("Removing timePeriod with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "TimePeriod removed");
	}
	
	/**
	 * Method for getting paged result.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Time Periods")
	public PagedResultResource<TimePeriodResource> getEnrolmentSubjects(
			@Offset final Integer offset,
			@Limit(defaultValue = "38") final Integer limit,
			final TimePeriodResource resource) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", offset, limit);
		PagedRequest<TimePeriodResource> request = new PagedRequest<TimePeriodResource>(resource, offset, limit);
		return facade.getResources(request);
	}
	
}
