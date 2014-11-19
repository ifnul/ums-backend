package org.lnu.is.web.controller.person;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.person.PersonPaperFacade;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

/**
 * Controller, that handles all operations with person.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "Persons Papers", description = "Person Papers")
public class PersonPaperController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonPaperController.class);
	
	@Resource(name = "personPaperFacade")
	private PersonPaperFacade personPaperFacade;
	
}
