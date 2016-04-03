package org.lnu.is.facade.facade.enrolment;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.EnrolmentResource;
import org.lnu.is.resource.enrolment.RatingResource;

public interface EnrolmentFacade extends Facade<EnrolmentResource, EnrolmentResource, Long> {

    RatingResource getRatingEnrolments(long specofferId);
}
