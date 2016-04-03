package org.lnu.is.resource.enrolment;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Objects;

/**
 * @since 4/3/16
 */
public class RatingResource {

    private Integer licCount;

    private Integer stateCount;

    private List<EnrolmentRatingResource> enrolments;

    public Integer getLicCount() {
        return licCount;
    }

    public void setLicCount(Integer licCount) {
        this.licCount = licCount;
    }

    public Integer getStateCount() {
        return stateCount;
    }

    public void setStateCount(Integer stateCount) {
        this.stateCount = stateCount;
    }

    public List<EnrolmentRatingResource> getEnrolments() {
        return enrolments;
    }

    public void setEnrolments(List<EnrolmentRatingResource> enrolments) {
        this.enrolments = enrolments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingResource that = (RatingResource) o;
        return Objects.equals(licCount, that.licCount) &&
                Objects.equals(stateCount, that.stateCount) &&
                Objects.equals(enrolments, that.enrolments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licCount, stateCount, enrolments);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("licCount", licCount)
                .append("stateCount", stateCount)
                .append("enrolments", enrolments)
                .toString();
    }
}
