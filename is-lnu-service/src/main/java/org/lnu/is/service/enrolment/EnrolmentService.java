package org.lnu.is.service.enrolment;

import com.google.common.collect.Lists;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.dao.dao.enrolment.EnrolmentDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferWaveDao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.service.DefaultService;
import org.lnu.is.service.Service;

import java.util.List;

public class EnrolmentService extends DefaultService<Enrolment, Enrolment, Long, EnrolmentDao> implements Service<Enrolment, Enrolment, Long> {

    private Dao<SpecOffer, SpecOffer, Long> specOfferDao;
    private SpecOfferWaveDao specOfferWaveDao;

    public List<EnrolmentRating> getRatingEnrolments(long specofferId) {
        SpecOffer specOffer = specOfferDao.getEntityById(specofferId);
        SpecOfferWave specOfferWave = specOfferWaveDao.getLastSpecOfferWave(specOffer);

        List<EnrolmentRating> destEnrolments = dao.getDestinationEntryEnrolments(specofferId);
        List<EnrolmentRating> offCompetitionEnrolments = dao.getOffCompetitionEnrolments(specofferId);

        int destinationLimit = countLimit(destEnrolments, specOfferWave.getTargetCount());
        int offDestinationCount = countLimit(offCompetitionEnrolments, specOfferWave.getBenefitCount());

        return dao.getRatingEnrolments(specofferId, destinationLimit, offDestinationCount);
    }

    private int countLimit(List<EnrolmentRating> enrolments, int count) {
        int result;

        if (count == 0) {
          result  = enrolments.size();
        } else if (enrolments.size() < count) {
            result = count;
        } else {
            List<EnrolmentRating> enrolmentRatings = Lists.reverse(enrolments.subList(0, count));
            result = enrolmentRatings.size();
            EnrolmentRating rating = enrolmentRatings.stream().findFirst().get();

            long lastEqualKbCount = enrolmentRatings.stream()
                    .filter(rat -> rat.getKb() == rating.getKb())
                    .count();

            if (lastEqualKbCount > 1) {
                result -= lastEqualKbCount;
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
