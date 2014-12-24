package org.lnu.is.web.rest.controller.eduformtype;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/eduformtypes")
@Api("Education Form Types")
public class EduFormTypeController extends BaseController implements PagedController<EduFormTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EduFormTypeController.class);
	
	@Resource(name = "eduFormTypeFacade")
	private Facade<EduFormTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Education Form Types")
	public PagedResultResource<EduFormTypeResource> getPagedResource(@Limit(defaultValue = "38") final PagedRequest<EduFormTypeResource> request) {
		LOG.info("Getting Paged Result of  Edu Form Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
