package org.lnu.is.web.rest.controller.enrolment.type;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.type.EnrolmentTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
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

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Enrolment Type Controller.
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/enrolments/types")
@ApiModel("Enrolment Types")
public class EnrolmentTypeController extends BaseController implements PagedController<EnrolmentTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentTypeController.class);

	@Resource(name = "enrolmentTypeFacade")
	private Facade<EnrolmentTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Enrolment Types")
	public PagedResultResource<EnrolmentTypeResource> getPagedResource(@Limit(defaultValue = "32") final PagedRequest<EnrolmentTypeResource> request) {
		LOG.info("Retrieving PagedResultResource for Enrolment Types with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get enrolment type by id")
	public EnrolmentTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
