package org.lnu.is.resource.kb;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class AverageGlobalKbResource {

    private BigDecimal averageKb;
    private List<AverageKbResource> kbs;

    public BigDecimal getAverageKb() {
        return averageKb;
    }

    public void setAverageKb(BigDecimal averageKb) {
        this.averageKb = averageKb;
    }

    public List<AverageKbResource> getKbs() {
        return kbs;
    }

    public void setKbs(List<AverageKbResource> kbs) {
        this.kbs = kbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AverageGlobalKbResource that = (AverageGlobalKbResource) o;
        return Objects.equals(averageKb, that.averageKb) &&
                Objects.equals(kbs, that.kbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageKb, kbs);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("averageKb", averageKb)
                .append("kbs", kbs)
                .toString();
    }
}
