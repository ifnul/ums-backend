package org.lnu.is.web.rest.controller.enrolment.foreign.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.foreign.type.EnrolmentForeignTypeResource;
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
 * EnrolmentForeign Type controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/enrolmentforeignes/types")
public class EnrolmentForeignTypeController extends BaseController implements PagedController<EnrolmentForeignTypeResource, EnrolmentForeignTypeResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentForeignTypeController.class);

	@Resource(name = "enrolmentForeignTypeFacade")
	private Facade<EnrolmentForeignTypeResource, EnrolmentForeignTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All EnrolmentForeign Type Resources")
	public PagedResultResource<EnrolmentForeignTypeResource> getPagedResource(final PagedRequest<EnrolmentForeignTypeResource> request) {
		LOG.info("Getting PagedResultResource for EnrolmentForeign Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get EnrolmentForeignTypeResource by id")
	public EnrolmentForeignTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting enrolmentforeign type resource:{}", id);
		return facade.getResource(id);
	}
}
