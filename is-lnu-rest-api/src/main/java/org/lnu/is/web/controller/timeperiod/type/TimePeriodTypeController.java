package org.lnu.is.web.controller.timeperiod.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.type.TimePeriodTypeResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Time Period Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/timeperiods/types")
public class TimePeriodTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(TimePeriodTypeController.class);
	
	@Resource(name = "timePeriodTypeFacade")
	private Facade<TimePeriodTypeResource, Long> facade;
	
	/**
	 * Method for getting paged result of time period types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<TimePeriodTypeResource> getTimePeriodTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final TimePeriodTypeResource resource) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<TimePeriodTypeResource> request = new PagedRequest<TimePeriodTypeResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
