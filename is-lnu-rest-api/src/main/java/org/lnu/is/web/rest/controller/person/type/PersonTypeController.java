package org.lnu.is.web.rest.controller.person.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.person.type.PersonTypeResource;
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
 * Controller for person types.
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/persons/types")
@Api(value = "Person Types", description = "Person Types")
public class PersonTypeController extends BaseController implements PagedController<PersonTypeResource, PersonTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonTypeController.class);

	@Resource(name = "personTypeFacade")
	private Facade<PersonTypeResource, PersonTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Person Types")
	public PagedResultResource<PersonTypeResource> getPagedResource(final PagedRequest<PersonTypeResource> request) {
		LOG.info("Retrieving PagedResultResource for Person Types with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get person type by id")
	public PersonTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
