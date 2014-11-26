package org.lnu.is.web.controller.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.specoffer.subject.SpecOfferSubjectFacade;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for spec offer subjects.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers")
public class SpecOfferSubjectController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferSubjectController.class);
	
	@Resource(name = "specOfferSubjectFacade")
	private SpecOfferSubjectFacade specOfferSubjectFacade;
}
