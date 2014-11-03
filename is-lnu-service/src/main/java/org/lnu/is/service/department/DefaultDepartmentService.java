package org.lnu.is.service.department;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.springframework.stereotype.Service;

/**
 * Default implentation of Department Service.
 * @author ivanursul
 *
 */
@Service("departmentService")
public class DefaultDepartmentService implements DepartmentService {

	@Resource(name = "departmentDao")
	private DepartmentDao departmentDao;
}
