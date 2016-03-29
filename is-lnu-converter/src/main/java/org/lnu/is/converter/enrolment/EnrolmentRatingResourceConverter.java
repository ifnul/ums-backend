package org.lnu.is.converter.enrolment;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.springframework.stereotype.Component;

@Component("enrolmentRatingResourceConverter")
public class EnrolmentRatingResourceConverter extends AbstractConverter<EnrolmentRating, EnrolmentRatingResource> {

    @Override
    public EnrolmentRatingResource convert(EnrolmentRating source, EnrolmentRatingResource target) {

        target.setKb(source.getKb());
        target.setRatingPriority(source.getRatingPriority());
        target.setPersonId(source.getPersonId());
        target.setEnrolmentId(source.getEnrolmentId());

        target.setFirstname(source.getFirstname());
        target.setFathername(source.getFathername());
        target.setSurname(source.getSurname());

        return target;
    }

    @Override
    public EnrolmentRatingResource convert(EnrolmentRating source) {
        return convert(source, new EnrolmentRatingResource());
    }
}
