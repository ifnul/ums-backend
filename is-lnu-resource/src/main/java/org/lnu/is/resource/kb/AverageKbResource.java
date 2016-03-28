package org.lnu.is.resource.kb;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @since 3/21/16
 */
public class AverageKbResource {

    private long specofferId;
    private String name;
    private BigDecimal averageKb;

    public long getSpecofferId() {
        return specofferId;
    }

    public void setSpecofferId(long specofferId) {
        this.specofferId = specofferId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAverageKb() {
        return averageKb;
    }

    public void setAverageKb(BigDecimal averageKb) {
        this.averageKb = averageKb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AverageKbResource that = (AverageKbResource) o;
        return specofferId == that.specofferId &&
                Objects.equals(name, that.name) &&
                Objects.equals(averageKb, that.averageKb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specofferId, name, averageKb);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("specofferId", specofferId)
                .append("name", name)
                .append("averageKb", averageKb)
                .toString();
    }
}
