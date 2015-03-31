package org.lnu.is.web.rest.controller.edbo.person;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.lnu.is.facade.facade.edbo.person.EdboPersonFacade;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for edbo person entity.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/edbo/persons")
public class EdboPersonController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EdboPersonController.class);
	
	@Resource(name = "edboPersonFacade")
	private EdboPersonFacade facade;

	/**
	 * Method for finding applicants-persons via parameters.
	 * @param request
	 * @return list of person resources.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public List<EdboPersonResource> getPersons(@Valid final EdboPersonFindRequest request) {
		LOG.info("Retrieving information about persons in edbo: {}", request);
		return facade.findPersons(request);
	}
	
}
