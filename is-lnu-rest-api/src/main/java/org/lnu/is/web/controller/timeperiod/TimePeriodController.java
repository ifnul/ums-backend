package org.lnu.is.web.controller.timeperiod;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
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
 * Time Period Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/timeperiods")
@Api(value = "Time Periods", description = "Time Periods")
public class TimePeriodController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(TimePeriodController.class);
	
	@Resource(name = "timePeriodFacade")
	private Facade<TimePeriodResource, Long> facade;
	
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
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "38") final Integer limit,
			final TimePeriodResource resource) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", offset, limit);
		PagedRequest<TimePeriodResource> request = new PagedRequest<TimePeriodResource>(resource, offset, limit);
		return facade.getResources(request);
	}
	
}
