package org.lnu.is.web.rest.controller.enrolment.subject;

import javax.annotation.Resource;

import org.lnu.is.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.subject.EnrolmentSubjectResource;
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
 * Enrolment Subject controller.
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/enrolments/subjects")
@Api("Enrolment Subjects")
public class EnrolmentSubjectController extends BaseController implements PagedController<EnrolmentSubjectResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentSubjectController.class);

	@Resource(name = "enrolmentSubjectFacade")
	private Facade<EnrolmentSubjectResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment Subjects")
	public PagedResultResource<EnrolmentSubjectResource> getPagedResource(@Limit(defaultValue = "43") final PagedRequest<EnrolmentSubjectResource> request) {
		LOG.info("Getting Paged Result of  enrolment subject with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get enrolment subject by id")
	public EnrolmentSubjectResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
