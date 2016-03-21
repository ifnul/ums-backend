package org.lnu.is.facade.facade.department;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.department.DepartmentResource;
import org.lnu.is.resource.department.DepartmentSpecofferResource;

import java.util.List;

public interface DepartmentFacade extends Facade<DepartmentResource, DepartmentResource, Long> {

    List<DepartmentSpecofferResource> getDepartmentByTimePeriodGroupedByDepartment(long timePeriodId);
}
