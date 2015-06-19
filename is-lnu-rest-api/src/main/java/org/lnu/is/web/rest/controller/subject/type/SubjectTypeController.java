package org.lnu.is.web.rest.controller.subject.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.subject.type.SubjectTypeResource;
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
 * SubjectType controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/subjects/types")
public class SubjectTypeController extends BaseController implements PagedController<SubjectTypeResource, SubjectTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SubjectTypeController.class);
	
	@Resource(name = "subjectTypeFacade")
	private Facade<SubjectTypeResource, SubjectTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All SubjectTypes")
	public PagedResultResource<SubjectTypeResource> getPagedResource(final PagedRequest<SubjectTypeResource> request) {
		LOG.info("Getting PagedResultResource for SubjectTypes with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get reason resource by id")
	public SubjectTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
