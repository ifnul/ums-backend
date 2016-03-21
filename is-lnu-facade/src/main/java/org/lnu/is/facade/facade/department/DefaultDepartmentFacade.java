package org.lnu.is.facade.facade.department;

import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentSpecoffer;
import org.lnu.is.facade.facade.DefaultFacade;
import org.lnu.is.resource.department.DepartmentResource;
import org.lnu.is.resource.department.DepartmentSpecofferResource;
import org.lnu.is.resource.specoffer.SpecofferDepartmentResource;
import org.lnu.is.service.department.DepartmentService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class DefaultDepartmentFacade extends DefaultFacade<Department, DepartmentResource, Department, DepartmentResource,
        DepartmentService, Long> implements DepartmentFacade {
    @Override
    public List<DepartmentSpecofferResource> getDepartmentByTimePeriodGroupedByDepartment(long timePeriodId) {
        List<DepartmentSpecoffer> departments = service.getDepartmentByTimePeriodGroupedByDepartment(timePeriodId);

        Map<DepartmentSpecofferResource, List<SpecofferDepartmentResource>> departmentsResources = departments.stream()
                .collect(groupingBy(d -> new DepartmentSpecofferResource(d.getDepartmentId(), d.getDepartmentName()),
                        mapping(d -> new SpecofferDepartmentResource(d.getSpecialtyName(), d.getSpecofferId()), toList())));

        return departmentsResources.entrySet().stream()
                .map(e -> new DepartmentSpecofferResource(e.getKey().getDepartmentId(), e.getKey().getDepartmentName(),
                        e.getValue()))
                .collect(Collectors.toList());
    }
}
