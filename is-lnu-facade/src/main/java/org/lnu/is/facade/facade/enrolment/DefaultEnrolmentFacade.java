package org.lnu.is.facade.facade.enrolment;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.facade.facade.DefaultFacade;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.lnu.is.resource.enrolment.EnrolmentResource;
import org.lnu.is.service.enrolment.EnrolmentService;

import java.util.List;

public class DefaultEnrolmentFacade extends DefaultFacade<Enrolment, EnrolmentResource, Enrolment, EnrolmentResource,
        EnrolmentService, Long> implements EnrolmentFacade {

    private Converter<EnrolmentRating, EnrolmentRatingResource> enrolmentRatingResourceConverter;

    @Override
    public List<EnrolmentRatingResource> getRatingEnrolments(long specofferId) {
        List<EnrolmentRating> enrolmentRatings = service.getRatingEnrolments(specofferId);
        return enrolmentRatingResourceConverter.convertAll(enrolmentRatings);
    }

    public void setEnrolmentRatingResourceConverter(Converter<EnrolmentRating, EnrolmentRatingResource> enrolmentRatingResourceConverter) {
        this.enrolmentRatingResourceConverter = enrolmentRatingResourceConverter;
    }
}
