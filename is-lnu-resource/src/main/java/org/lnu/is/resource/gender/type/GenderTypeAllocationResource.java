package org.lnu.is.resource.gender.type;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class GenderTypeAllocationResource {
    private String name;
    private int menCount;
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
        GenderTypeAllocationResource that = (GenderTypeAllocationResource) o;
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
