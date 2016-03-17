package org.lnu.is.service;

import org.lnu.is.dao.dao.enrolment.EnrolmentDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferWaveDao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;

import java.util.List;

public class EnrolmentService extends DefaultService<Enrolment, Enrolment, Long, EnrolmentDao> implements Service<Enrolment, Enrolment, Long> {

    private SpecOfferWaveDao specOfferWaveDao;

    public List<EnrolmentRating> getRatingEnrolments(long specofferId) {
        // todo: count limit for цільовий вступ
        // todo: count limit for першочерговий вступ
        return dao.getRatingEnrolments(specofferId);
    }

    public void setSpecOfferWaveDao(SpecOfferWaveDao specOfferWaveDao) {
        this.specOfferWaveDao = specOfferWaveDao;
    }
}
