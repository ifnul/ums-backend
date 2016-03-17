package org.lnu.is.facade.facade.enrolment;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.lnu.is.resource.enrolment.EnrolmentResource;

import java.util.List;

public interface EnrolmentFacade extends Facade<EnrolmentResource, EnrolmentResource, Long> {

    List<EnrolmentRatingResource> getRatingEnrolments(long specofferId);
}
