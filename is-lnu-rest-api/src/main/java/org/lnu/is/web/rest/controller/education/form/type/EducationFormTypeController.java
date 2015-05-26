package org.lnu.is.web.rest.controller.education.form.type;

import javax.annotation.Resource;

import org.lnu.is.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;
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
@RequestMapping("/educations/forms/types")
@Api("Education Form Types")
public class EducationFormTypeController extends BaseController implements PagedController<EducationFormTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EducationFormTypeController.class);
	
	@Resource(name = "eduFormTypeFacade")
	private Facade<EducationFormTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Education Form Types")
	public PagedResultResource<EducationFormTypeResource> getPagedResource(@Limit(defaultValue = "38") final PagedRequest<EducationFormTypeResource> request) {
		LOG.info("Getting Paged Result of  Edu Form Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Edu Form Type by id")
	public EducationFormTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}
}
