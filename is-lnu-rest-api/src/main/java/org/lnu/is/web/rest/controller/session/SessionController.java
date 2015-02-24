package org.lnu.is.web.rest.controller.session;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.session.SessionFacade;
import org.lnu.is.resource.session.SessionResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller, that handles sesssion methods.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/sessions")
public class SessionController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SessionController.class);

	@Resource(name = "sessionFacade")
	private SessionFacade facade;
	
	/**
	 * Method for getting current session.
	 * @return session.
	 */
	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public SessionResource getSession() {
		LOG.info("Getting session info");
		return facade.getCurrentSession();
	}
	
}
