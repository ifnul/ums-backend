package org.lnu.is.web.specoffer;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
import org.lnu.is.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller, that handles all operations
 * with specoffers.
 * @author ivanursul
 *
 */
@Controller
@RequestMapping("/specoffers")
public class SpecOfferController extends BaseController {

	@Resource(name = "specOfferFacade")
	private SpecOfferFacade specOfferFacade;
	
}
