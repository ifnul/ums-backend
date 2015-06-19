package org.lnu.is.web.rest.controller.subject;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.subject.SubjectResource;
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
 * Subject Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/subjects")
public class SubjectController extends BaseController implements PagedController<SubjectResource, SubjectResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SubjectController.class);
	
	@Resource(name = "subjectFacade")
	private Facade<SubjectResource, SubjectResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Subjects")
	public PagedResultResource<SubjectResource> getPagedResource(final PagedRequest<SubjectResource> request) {
		LOG.info("Getting PagedResultResource for Subjects with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get subject resource by id")
	public SubjectResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
