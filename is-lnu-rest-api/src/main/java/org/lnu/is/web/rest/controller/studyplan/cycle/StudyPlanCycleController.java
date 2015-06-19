package org.lnu.is.web.rest.controller.studyplan.cycle;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
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

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for StudyPlan Cycles.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/studyplans/cycles")
@Api("StudyPlan Cycle Controller")
public class StudyPlanCycleController extends BaseController implements PagedController<StudyPlanCycleResource, StudyPlanCycleResource> {
	private static final Logger LOG = LoggerFactory.getLogger(StudyPlanCycleController.class);

	@Resource(name = "studyPlanCycleFacade")
	private Facade<StudyPlanCycleResource, StudyPlanCycleResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All StudyPlan Cycles")
	public PagedResultResource<StudyPlanCycleResource> getPagedResource(final PagedRequest<StudyPlanCycleResource> request) {
		LOG.info("Getting PagedResultResource for StudyPlan Cycle with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get StudyPlan Cycle by id")
	public StudyPlanCycleResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
