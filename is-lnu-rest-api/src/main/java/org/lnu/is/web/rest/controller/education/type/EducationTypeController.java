package org.lnu.is.web.rest.controller.education.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.education.type.EducationTypeResource;
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
 * Edu Form Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/educations/types")
@Api("Education Types")
public class EducationTypeController extends BaseController implements PagedController<EducationTypeResource, EducationTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EducationTypeController.class);
	
	@Resource(name = "educationTypeFacade")
	private Facade<EducationTypeResource, EducationTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Education Types")
	public PagedResultResource<EducationTypeResource> getPagedResource(final PagedRequest<EducationTypeResource> request) {
		LOG.info("Getting Paged Result of  Education Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Education Type by id")
	public EducationTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}
}
