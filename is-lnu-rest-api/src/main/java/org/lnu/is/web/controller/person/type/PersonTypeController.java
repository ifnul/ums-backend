package org.lnu.is.web.controller.person.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.person.types.PersonTypeFacade;
import org.lnu.is.facade.resource.person.type.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "Person Types", description = "Person Types")
public class PersonTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonTypeController.class);

	@Resource(name = "personTypeFacade")
	private PersonTypeFacade personTypeFacade;

	/**
	 * Method for getting person types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/types", method = RequestMethod.GET)
	@ApiOperation(value = "Get Person Types")
	public PagedResultResource<PersonTypeResource> getPersonTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final PersonTypeResource resource) {
		LOG.info("Retrieving PagedResultResource for Person Types with offset: {}, limit: {}", offset, limit);
		PagedRequest<PersonTypeResource> pagedRequest = new PagedRequest<PersonTypeResource>(resource, offset, limit);
		return personTypeFacade.getPersonTypes(pagedRequest);
	}

}
