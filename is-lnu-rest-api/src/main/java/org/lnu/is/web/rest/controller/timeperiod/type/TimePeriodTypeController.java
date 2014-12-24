package org.lnu.is.web.rest.controller.timeperiod.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.type.TimePeriodTypeResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class TimePeriodTypeController extends BaseController implements PagedController<TimePeriodTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(TimePeriodTypeController.class);
	
	@Resource(name = "timePeriodTypeFacade")
	private Facade<TimePeriodTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<TimePeriodTypeResource> getPagedResource(final PagedRequest<TimePeriodTypeResource> request) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get time period type by id")
	public TimePeriodTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
