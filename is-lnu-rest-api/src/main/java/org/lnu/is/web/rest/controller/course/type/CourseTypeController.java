package org.lnu.is.web.rest.controller.course.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.course.type.CourseTypeResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Course type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/courses/types")
public class CourseTypeController extends BaseController implements PagedController<CourseTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(CourseTypeController.class);

	@Resource(name = "courseTypeFacade")
	private Facade<CourseTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Course Type Resources")
	public PagedResultResource<CourseTypeResource> getPagedResource(final PagedRequest<CourseTypeResource> request) {
		LOG.info("Getting PagedResultResource for Course Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get CourseTypeResource by id")
	public CourseTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting course type resource:{}", id);
		return facade.getResource(id);
	}
}
