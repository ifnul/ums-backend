package org.lnu.is.web.rest.controller.timeperiod;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
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
public class TimePeriodController extends BaseController implements CrudController<TimePeriodResource> {
	private static final Logger LOG = LoggerFactory.getLogger(TimePeriodController.class);
	
	@Resource(name = "timePeriodFacade")
	private Facade<TimePeriodResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Person")
	public TimePeriodResource createResource(@Valid @RequestBody final TimePeriodResource resource) {
		LOG.info("Creating timePeriod: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update TimePeriod")
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final TimePeriodResource resource) {
		LOG.info("Updating timePeriod with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "TimePeriod Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get TimePeriod by id")
	public TimePeriodResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving timePeriod with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete TimePeriod")
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing timePeriod with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "TimePeriod removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Time Periods")
	public PagedResultResource<TimePeriodResource> getPagedResource(@Limit(defaultValue = "38") final PagedRequest<TimePeriodResource> request) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	
}
