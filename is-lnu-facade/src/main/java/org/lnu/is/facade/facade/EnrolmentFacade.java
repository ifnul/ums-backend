package org.lnu.is.facade.facade;

import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.lnu.is.resource.enrolment.EnrolmentResource;
import org.lnu.is.service.EnrolmentService;

import java.util.List;

public class EnrolmentFacade extends DefaultFacade<Enrolment, EnrolmentResource, Enrolment, EnrolmentResource,
        EnrolmentService, Long> implements Facade<EnrolmentResource, EnrolmentResource, Long> {

    public List<EnrolmentRatingResource> getRatingEnrolments(long specofferId) {
        List<EnrolmentRating> enrolmentRatings = service.getRatingEnrolments(specofferId);
        return null;
    }
}
