package org.lnu.is.service;

import org.lnu.is.dao.dao.enrolment.EnrolmentDao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;

import java.util.List;

public class EnrolmentService extends DefaultService<Enrolment, Enrolment, Long, EnrolmentDao> implements Service<Enrolment, Enrolment, Long> {

    public List<EnrolmentRating> getRatingEnrolments(long specofferId) {
        return dao.getRatingEnrolments(specofferId);
    }
}
