package org.lnu.is.dao.dao.enrolment;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.dao.utils.DaoUtils;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @since 3/17/16
 */
public class EnrolmentDao extends DefaultDao<Enrolment, Enrolment, Long> {
    private static final String SPECOFFER_ID_PLACEHOLDER = "$$SPECOFFER_ID$$";
    private static final String EDA_LIMIT_PLACEHOLDER = "$$EDA_LIMIT$$";
    private static final String EOCE_LIMIT_PLACEHOLDER = "$$EOCE_LIMIT$$";

    public List<EnrolmentRating> getRatingEnrolments(long specofferId, int destinationLimit, int offDestinationCount) {
        String sql = DaoUtils.getQuery("enrolment_rating.sql")
                .replace(SPECOFFER_ID_PLACEHOLDER, String.valueOf(specofferId))
                .replace(EDA_LIMIT_PLACEHOLDER, String.valueOf(destinationLimit))
                .replace(EOCE_LIMIT_PLACEHOLDER, String.valueOf(offDestinationCount));

        return getResultListFromNativeQuery(sql, EnrolmentRating.class);
    }


    public List<EnrolmentRating> getDestinationEntryEnrolments(long specofferId) {
        String sql = DaoUtils.getQuery("enrolment_destination_entry.sql").replace(SPECOFFER_ID_PLACEHOLDER, String.valueOf(specofferId));
        List<Object[]> destinationEntries = getPersistenceManager().executeNativeQuery(sql);

        return destinationEntries.stream()
                .map(arr -> {
                    EnrolmentRating enrolmentRating = new EnrolmentRating();
                    enrolmentRating.setEnrolmentId(Objects.nonNull(arr[0]) ? Long.parseLong(String.valueOf(arr[0])): null);
                    enrolmentRating.setKb((Double) arr[1]);

                    return enrolmentRating;
                }).collect(Collectors.toList());
    }

    public List<EnrolmentRating> getOffCompetitionEnrolments(long specofferId) {
        String sql = DaoUtils.getQuery("enrolment_off_competitions.sql").replace(SPECOFFER_ID_PLACEHOLDER, String.valueOf(specofferId));
        List<Object[]> destinationEntries = getPersistenceManager().executeNativeQuery(sql);

        return destinationEntries.stream()
                .map(arr -> {
                    EnrolmentRating enrolmentRating = new EnrolmentRating();
                    enrolmentRating.setEnrolmentId(Objects.nonNull(arr[0]) ? Long.parseLong(String.valueOf(arr[0])): null);
                    enrolmentRating.setKb((Double) arr[1]);

                    return enrolmentRating;
                }).collect(Collectors.toList());
    }
}
