package org.lnu.is.resource.specoffer;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class SpecofferDepartmentResource {

    private String name;
    private long specofferId;

    public SpecofferDepartmentResource(String name, long specofferId) {
        this.name = name;
        this.specofferId = specofferId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        SpecofferDepartmentResource that = (SpecofferDepartmentResource) o;
        return specofferId == that.specofferId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specofferId);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("specofferId", specofferId)
                .toString();
    }
}
