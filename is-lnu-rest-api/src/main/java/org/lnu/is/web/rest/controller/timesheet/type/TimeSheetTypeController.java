package org.lnu.is.web.rest.controller.timesheet.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;
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
 * TimesheetType controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/timesheets/types")
public class TimeSheetTypeController extends BaseController implements PagedController<TimeSheetTypeResource, TimeSheetTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(TimeSheetTypeController.class);
	
	@Resource(name = "timeSheetTypeFacade")
	private Facade<TimeSheetTypeResource, TimeSheetTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All TimeSheetTypes")
	public PagedResultResource<TimeSheetTypeResource> getPagedResource(final PagedRequest<TimeSheetTypeResource> request) {
		LOG.info("Getting PagedResultResource for TimesheetTypes with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get reason resource by id")
	public TimeSheetTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
