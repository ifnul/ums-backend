package org.lnu.is.web.rest.controller;

import javax.annotation.Resource;

import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * Basic Controller.
 * Remember to extend this controller, when you are writing new controller.
 * @author ivanursul
 *
 */
public abstract class BaseController {

	@Resource
	private Validator validator;

	/**
	 * Default init binder method.
	 * @param binder
	 */
	@InitBinder
	protected void initBinder(final WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
}
