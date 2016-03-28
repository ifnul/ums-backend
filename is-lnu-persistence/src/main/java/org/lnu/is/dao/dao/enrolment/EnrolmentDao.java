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

        //List<Object[]> enrolmentRatings = getPersistenceManager().executeNativeQuery(sql);

        return getResultListFromNativeQuery(sql, EnrolmentRating.class);
        /*
        return enrolmentRatings.stream()
                .map(arr -> {
                    EnrolmentRating enrolmentRating = new EnrolmentRating();
                    enrolmentRating.setId(Objects.nonNull(arr[0]) ? Long.parseLong(String.valueOf(arr[0])): null);
                    enrolmentRating.setKb((Double) arr[1]);
                    enrolmentRating.setRatingPriority((Integer) arr[2]);
                    enrolmentRating.setPersonId(Objects.nonNull(arr[3]) ? Long.parseLong(String.valueOf(arr[3])) : null);
                    enrolmentRating.setDocSeries((String) arr[4]);
                    enrolmentRating.setDocNum((String) arr[5]);
                    enrolmentRating.setDocText((String) arr[6]);
                    enrolmentRating.setIsState((Integer) arr[7]);
                    enrolmentRating.setIsContract((Integer) arr[8]);
                    enrolmentRating.setSpecOfferId(Objects.nonNull(arr[9]) ? Long.parseLong(String.valueOf(arr[9])) : null);
                    enrolmentRating.setDepartmentId(Objects.nonNull(arr[10]) ? Long.parseLong(String.valueOf(arr[10])) : null);
                    enrolmentRating.setPersonPaperId(Objects.nonNull(arr[11]) ? Long.parseLong(String.valueOf(arr[11])) : null);
                    enrolmentRating.setMark((Double) arr[12]);
                    enrolmentRating.setIsPrivilege((Integer) arr[13]);
                    enrolmentRating.setIsHostel((Integer) arr[14]);
                    enrolmentRating.setEnrolmentTypeId(Objects.nonNull(arr[15]) ? Long.parseLong(String.valueOf(arr[15])) : null);
                    enrolmentRating.setUid(Objects.nonNull(arr[16]) ? Long.parseLong(String.valueOf(arr[16])) : null);
                    enrolmentRating.setUtid((String) arr[17]);
                    enrolmentRating.setUapp((String) arr[18]);
                    enrolmentRating.setMarkScaleId(Objects.nonNull(arr[19]) ? Long.parseLong(String.valueOf(arr[19])) : null);
                    enrolmentRating.setIsEducationState((Integer) arr[20]);
                    enrolmentRating.setIsInterview((Integer) arr[21]);
                    enrolmentRating.setIsOriginal((Integer) arr[22]);

                    return enrolmentRating;
                })
                .collect(Collectors.toList());*/
    }


    public List<EnrolmentRating> getDestinationEntryEnrolments(long specofferId) {
        String sql = DaoUtils.getQuery("enrolment_destination_entry.sql").replace(SPECOFFER_ID_PLACEHOLDER, String.valueOf(specofferId));
        List<Object[]> destinationEntries = getPersistenceManager().executeNativeQuery(sql);

        return destinationEntries.stream()
                .map(arr -> {
                    EnrolmentRating enrolmentRating = new EnrolmentRating();
                    enrolmentRating.setId(Objects.nonNull(arr[0]) ? Long.parseLong(String.valueOf(arr[0])): null);
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
                    enrolmentRating.setId(Objects.nonNull(arr[0]) ? Long.parseLong(String.valueOf(arr[0])): null);
                    enrolmentRating.setKb((Double) arr[1]);

                    return enrolmentRating;
                }).collect(Collectors.toList());
    }
}
