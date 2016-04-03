package org.lnu.is.converter.enrolment;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component("enrolmentRatingResourceConverter")
public class EnrolmentRatingResourceConverter extends AbstractConverter<EnrolmentRating, EnrolmentRatingResource> {

    @Override
    public EnrolmentRatingResource convert(EnrolmentRating source, EnrolmentRatingResource target) {

        if (source.getKb() != 0) {
            DecimalFormat df = new DecimalFormat("#.##");
            Double kb = Double.valueOf(df.format(source.getKb()));
            target.setKb(kb);
        }

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
