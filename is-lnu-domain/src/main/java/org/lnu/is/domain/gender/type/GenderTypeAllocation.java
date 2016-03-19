package org.lnu.is.domain.gender.type;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.NativeQueryResultColumn;
import org.lnu.is.annotation.NativeQueryResultEntity;

import java.util.Objects;

@NativeQueryResultEntity
public class GenderTypeAllocation {

    @NativeQueryResultColumn(index = 0)
    private String name;

    @NativeQueryResultColumn(index = 1)
    private int menCount;

    @NativeQueryResultColumn(index = 2)
    private int womenCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenCount() {
        return menCount;
    }

    public void setMenCount(int menCount) {
        this.menCount = menCount;
    }

    public int getWomenCount() {
        return womenCount;
    }

    public void setWomenCount(int womenCount) {
        this.womenCount = womenCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenderTypeAllocation that = (GenderTypeAllocation) o;
        return menCount == that.menCount &&
                womenCount == that.womenCount &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, menCount, womenCount);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("menCount", menCount)
                .append("womenCount", womenCount)
                .toString();
    }
}
