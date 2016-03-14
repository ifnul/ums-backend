package org.lnu.is.domain.specoffer;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.timeperiod.TimePeriod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Entity, that describes specoffers table.
 *
 * @author ivanursul
 */
@OB
@Entity
@Table(name = "q_ob_specoffer")
public class SpecOffer extends InformationModel {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private SpecOffer parent;

    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "timeperiod_id")
    private TimePeriod timePeriod;

    @ManyToOne
    @JoinColumn(name = "timeperiodcourse_id")
    private TimePeriod timePeriodCourse;

    @ManyToOne
    @JoinColumn(name = "eduformtype_id")
    private EducationFormType educationFormType;

    @ManyToOne
    @JoinColumn(name = "specoffertype_id")
    private SpecOfferType specOfferType;

    @OneToMany(mappedBy = "specOffer")
    private List<SpecOfferBenefit> benefits;

    @OneToMany(mappedBy = "specOffer")
    private List<SpecOfferSubject> subjects;

    @OneToMany(mappedBy = "specOffer")
    private List<SpecOfferWave> waves;

    @Column(name = "docseries")
    private String docSeries;

    @Column(name = "docnum")
    private String docNum;

    @Column(name = "liccount")
    private Integer licCount;

    @Column(name = "statecount")
    private Integer stateCount;

    @Column(name = "weight_certification")
    private Double weightCertificate;

    @Column(name = "weight_award")
    private Double weightAward;

    @Column(name = "begdate")
    private Date begDate;

    @Column(name = "enddate")
    private Date endDate;

    @Column(name = "duration")
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(final String duration) {
        this.duration = duration;
    }

    public TimePeriod getTimePeriodCourse() {
        return timePeriodCourse;
    }

    public void setTimePeriodCourse(final TimePeriod timePeriodCourse) {
        this.timePeriodCourse = timePeriodCourse;
    }

    public SpecOffer getParent() {
        return parent;
    }

    public void setParent(final SpecOffer parent) {
        this.parent = parent;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(final Specialty specialty) {
        this.specialty = specialty;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(final Department department) {
        this.department = department;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(final TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public EducationFormType getEducationFormType() {
        return educationFormType;
    }

    public void setEducationFormType(final EducationFormType educationFormType) {
        this.educationFormType = educationFormType;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(final String docSeries) {
        this.docSeries = docSeries;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(final String docNum) {
        this.docNum = docNum;
    }

    public Integer getLicCount() {
        return licCount;
    }

    public void setLicCount(final Integer licCount) {
        this.licCount = licCount;
    }

    public Integer getStateCount() {
        return stateCount;
    }

    public void setStateCount(final Integer stateCount) {
        this.stateCount = stateCount;
    }

    public Date getBegDate() {
        return begDate;
    }

    public void setBegDate(final Date begDate) {
        this.begDate = begDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public SpecOfferType getSpecOfferType() {
        return specOfferType;
    }

    public void setSpecOfferType(final SpecOfferType specOfferType) {
        this.specOfferType = specOfferType;
    }

    public List<SpecOfferBenefit> getBenefits() {
        return benefits;
    }

    public void setBenefits(final List<SpecOfferBenefit> benefits) {
        this.benefits = benefits;
    }

    public List<SpecOfferSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<SpecOfferSubject> subjects) {
        this.subjects = subjects;
    }

    public List<SpecOfferWave> getWaves() {
        return waves;
    }

    public void setWaves(final List<SpecOfferWave> waves) {
        this.waves = waves;
    }

    public Double getWeightCertificate() {
        return weightCertificate;
    }

    public void setWeightCertificate(Double weightCertificate) {
        this.weightCertificate = weightCertificate;
    }

    public Double getWeightAward() {
        return weightAward;
    }

    public void setWeightAward(Double weightAward) {
        this.weightAward = weightAward;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecOffer specOffer = (SpecOffer) o;
        return Objects.equals(docSeries, specOffer.docSeries) &&
                Objects.equals(docNum, specOffer.docNum) &&
                Objects.equals(licCount, specOffer.licCount) &&
                Objects.equals(stateCount, specOffer.stateCount) &&
                Objects.equals(weightCertificate, specOffer.weightCertificate) &&
                Objects.equals(weightAward, specOffer.weightAward) &&
                Objects.equals(begDate, specOffer.begDate) &&
                Objects.equals(endDate, specOffer.endDate) &&
                Objects.equals(duration, specOffer.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), docSeries, docNum, licCount, stateCount, weightCertificate, weightAward, begDate, endDate, duration);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("duration", duration)
                .append("endDate", endDate)
                .append("begDate", begDate)
                .append("weightAward", weightAward)
                .append("weightCertificate", weightCertificate)
                .append("stateCount", stateCount)
                .append("licCount", licCount)
                .append("docNum", docNum)
                .append("docSeries", docSeries)
                .toString();
    }
}
