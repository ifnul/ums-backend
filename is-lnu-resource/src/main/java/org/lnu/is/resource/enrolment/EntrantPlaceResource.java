package org.lnu.is.resource.enrolment;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class EntrantPlaceResource {

    private double entrantPlace;
    private String departmentName;
    private long departmentId;

    public double getEntrantPlace() {
        return entrantPlace;
    }

    public void setEntrantPlace(double entrantPlace) {
        this.entrantPlace = entrantPlace;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EntrantPlaceResource that = (EntrantPlaceResource) o;

        return new EqualsBuilder()
                .append(entrantPlace, that.entrantPlace)
                .append(departmentId, that.departmentId)
                .append(departmentName, that.departmentName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(entrantPlace)
                .append(departmentName)
                .append(departmentId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("entrantPlace", entrantPlace)
                .append("departmentName", departmentName)
                .append("departmentId", departmentId)
                .toString();
    }
}
