package org.lnu.is.web.controller.department;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.department.DepartmentFacade;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller, that handles all API with department entity.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);
	
	@Resource(name = "departmentFacade")
	private DepartmentFacade departmentFacade;
}
