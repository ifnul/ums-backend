package org.lnu.is.domain.admin.unit;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @since 3/9/16
 */
public class AdminUnitEntrantAllocation {

    private String adminUnit;
    private long adminUnitId;
    private int entrantCount;

    public AdminUnitEntrantAllocation() {}

    public AdminUnitEntrantAllocation(String adminUnit, long adminUnitId, int entrantCount) {
        this.adminUnit = adminUnit;
        this.adminUnitId = adminUnitId;
        this.entrantCount = entrantCount;
    }

    public String getAdminUnit() {
        return adminUnit;
    }

    public void setAdminUnit(String adminUnit) {
        this.adminUnit = adminUnit;
    }

    public long getAdminUnitId() {
        return adminUnitId;
    }

    public void setAdminUnitId(long adminUnitId) {
        this.adminUnitId = adminUnitId;
    }

    public int getEntrantCount() {
        return entrantCount;
    }

    public void setEntrantCount(int entrantCount) {
        this.entrantCount = entrantCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AdminUnitEntrantAllocation that = (AdminUnitEntrantAllocation) o;

        return new EqualsBuilder()
                .append(adminUnitId, that.adminUnitId)
                .append(entrantCount, that.entrantCount)
                .append(adminUnit, that.adminUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(adminUnit)
                .append(adminUnitId)
                .append(entrantCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("adminUnit", adminUnit)
                .append("adminUnitId", adminUnitId)
                .append("entrantCount", entrantCount)
                .toString();
    }
}
