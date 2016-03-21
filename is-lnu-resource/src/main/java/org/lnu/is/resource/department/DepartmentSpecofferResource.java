package org.lnu.is.resource.department;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.resource.specoffer.SpecofferDepartmentResource;

import java.util.List;
import java.util.Objects;

public class DepartmentSpecofferResource {

    private long departmentId;
    private String departmentName;
    List<SpecofferDepartmentResource> specoffers;

    public DepartmentSpecofferResource(long departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public DepartmentSpecofferResource(long departmentId, String departmentName, List<SpecofferDepartmentResource> specoffers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.specoffers = specoffers;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<SpecofferDepartmentResource> getSpecoffers() {
        return specoffers;
    }

    public void setSpecoffers(List<SpecofferDepartmentResource> specoffers) {
        this.specoffers = specoffers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentSpecofferResource that = (DepartmentSpecofferResource) o;
        return departmentId == that.departmentId &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(specoffers, that.specoffers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, departmentName, specoffers);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("departmentId", departmentId)
                .append("departmentName", departmentName)
                .append("specoffers", specoffers)
                .toString();
    }
}
