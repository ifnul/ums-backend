package org.lnu.is.service;

import com.google.common.collect.Lists;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.dao.dao.enrolment.EnrolmentDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferWaveDao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;

import java.util.List;

public class EnrolmentService extends DefaultService<Enrolment, Enrolment, Long, EnrolmentDao> implements Service<Enrolment, Enrolment, Long> {

    private Dao<SpecOffer, SpecOffer, Long> specOfferDao;
    private SpecOfferWaveDao specOfferWaveDao;

    public List<EnrolmentRating> getRatingEnrolments(long specofferId) {
        SpecOffer specOffer = specOfferDao.getEntityById(specofferId);
        SpecOfferWave specOfferWave = specOfferWaveDao.getLastSpecOfferWave(specOffer);

        // todo: count limit for цільовий вступ
        List<EnrolmentRating> destEnrolments = dao.getDestinationEntryEnrolments(specofferId);
        int destinationLimit = countLimit(destEnrolments, specOfferWave.getTargetCount());

        // todo: count limit for першочерговий вступ

        return dao.getRatingEnrolments(specofferId);
    }

    private int countLimit(List<EnrolmentRating> enrolments, Integer count) {
        int result;

        if (enrolments.size() <= count) {
            result = count;
        } else {
            List<EnrolmentRating> enrolmentRatings = Lists.reverse(enrolments.subList(0, count - 1));
            result = enrolmentRatings.size();

            for (int i = enrolmentRatings.size() - 1; i >= 0; i--) {
                if (i - 1 >= 0 && enrolmentRatings.get(i - 1).getKb() == enrolmentRatings.get(i).getKb()) {
                    result--;
                }
            }
        }

        return result;
    }

    public void setSpecOfferWaveDao(SpecOfferWaveDao specOfferWaveDao) {
        this.specOfferWaveDao = specOfferWaveDao;
    }

    public void setSpecOfferDao(Dao<SpecOffer, SpecOffer, Long> specOfferDao) {
        this.specOfferDao = specOfferDao;
    }
}
