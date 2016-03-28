package org.lnu.is.converter.enrolment;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.springframework.stereotype.Component;

@Component("enrolmentRatingResourceConverter")
public class EnrolmentRatingResourceConverter extends AbstractConverter<EnrolmentRating, EnrolmentRatingResource> {

    @Override
    public EnrolmentRatingResource convert(EnrolmentRating source, EnrolmentRatingResource target) {

        target.setIsOriginal(source.getIsOriginal());
        target.setIsInterview(source.getIsInterview());
        target.setIsEducationState(source.getIsEducationState());
        target.setMarkScaleId(source.getMarkScaleId());
        target.setDepartmentId(source.getDepartmentId());
        target.setDocNum(source.getDocNum());
        target.setDocSeries(source.getDocSeries());
        target.setDocText(source.getDocText());
        target.setEnrolmentTypeId(source.getEnrolmentTypeId());
        target.setIsContract(source.getIsContract());
        target.setIsEducationState(source.getIsEducationState());
        target.setIsPrivilege(source.getIsPrivilege());
        target.setKb(source.getKb());
        target.setRatingPriority(source.getRatingPriority());
        target.setPersonId(source.getPersonId());
        target.setPersonPaperId(source.getPersonPaperId());
        target.setSpecOfferId(source.getSpecOfferId());
        target.setId(source.getId());

        return target;
    }

    @Override
    public EnrolmentRatingResource convert(EnrolmentRating source) {
        return convert(source, new EnrolmentRatingResource());
    }
}
