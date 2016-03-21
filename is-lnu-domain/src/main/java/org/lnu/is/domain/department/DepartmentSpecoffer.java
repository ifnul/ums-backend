package org.lnu.is.domain.department;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.NativeQueryResultColumn;
import org.lnu.is.annotation.NativeQueryResultEntity;

import java.util.Objects;

@NativeQueryResultEntity
public class DepartmentSpecoffer {

    @NativeQueryResultColumn(index = 0)
    private long departmentId;

    @NativeQueryResultColumn(index = 1)
    private String departmentName;

    @NativeQueryResultColumn(index = 2)
    private long specofferId;

    @NativeQueryResultColumn(index = 3)
    private String specialtyName;

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

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public long getSpecofferId() {
        return specofferId;
    }

    public void setSpecofferId(long specofferId) {
        this.specofferId = specofferId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentSpecoffer that = (DepartmentSpecoffer) o;
        return departmentId == that.departmentId &&
                specofferId == that.specofferId &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(specialtyName, that.specialtyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, departmentName, specialtyName, specofferId);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("departmentId", departmentId)
                .append("departmentName", departmentName)
                .append("specialtyName", specialtyName)
                .append("specofferId", specofferId)
                .toString();
    }
}
