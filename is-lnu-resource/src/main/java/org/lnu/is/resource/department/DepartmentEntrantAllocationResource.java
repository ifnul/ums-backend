package org.lnu.is.resource.department;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DepartmentEntrantAllocationResource {

    private String name;
    private long departmentId;
    private int generalCount;
    private int awardsCount;
    private int benefitCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public int getGeneralCount() {
        return generalCount;
    }

    public void setGeneralCount(int generalCount) {
        this.generalCount = generalCount;
    }

    public int getAwardsCount() {
        return awardsCount;
    }

    public void setAwardsCount(int awardsCount) {
        this.awardsCount = awardsCount;
    }

    public int getBenefitCount() {
        return benefitCount;
    }

    public void setBenefitCount(int benefitCount) {
        this.benefitCount = benefitCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntrantAllocationResource that = (DepartmentEntrantAllocationResource) o;

        return new EqualsBuilder()
                .append(departmentId, that.departmentId)
                .append(generalCount, that.generalCount)
                .append(awardsCount, that.awardsCount)
                .append(benefitCount, that.benefitCount)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(departmentId)
                .append(generalCount)
                .append(awardsCount)
                .append(benefitCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("departmentId", departmentId)
                .append("generalCount", generalCount)
                .append("awardsCount", awardsCount)
                .append("benefitCount", benefitCount)
                .toString();
    }
}
