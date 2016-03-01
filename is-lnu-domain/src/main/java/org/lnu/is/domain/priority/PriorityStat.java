package org.lnu.is.domain.priority;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @since 3/1/16
 */
public class PriorityStat {

    private int priority;
    private long count;

    public PriorityStat(int priority, long count) {
        this.priority = priority;
        this.count = count;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PriorityStat that = (PriorityStat) o;

        return new EqualsBuilder()
                .append(priority, that.priority)
                .append(count, that.count)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(priority)
                .append(count)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("priority", priority)
                .append("count", count)
                .toString();
    }
}
