package org.lnu.is.domain.kb;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.NativeQueryResultColumn;
import org.lnu.is.annotation.NativeQueryResultEntity;

import java.math.BigDecimal;
import java.util.Objects;

@NativeQueryResultEntity
public class AverageKb {

    @NativeQueryResultColumn(index = 0)
    private long specofferId;

    @NativeQueryResultColumn(index = 1)
    private String name;

    @NativeQueryResultColumn(index = 2)
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
        AverageKb averageKb1 = (AverageKb) o;
        return specofferId == averageKb1.specofferId &&
                Objects.equals(name, averageKb1.name) &&
                Objects.equals(averageKb, averageKb1.averageKb);
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
