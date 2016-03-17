package org.lnu.is.dao.dao.enrolment;

import org.lnu.is.dao.dao.DefaultDao;
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

    private static final String QUERY_SQL = "SELECT " +
            "rating.enrolment_id,\n" +
            "rating.kb,\n" +
            "rating.priority, \n" +
            "e.person_id, \n" +
            "e.docseries, \n" +
            "e.docnum, \n" +
            "e.doctext, \n" +
            "e.isstate, \n" +
            "e.iscontract, \n" +
            "e.specoffer_id, \n" +
            "e.department_id, \n" +
            "e.personpaper_id, \n" +
            "e.mark, \n" +
            "e.isprivilege, \n" +
            "e.ishostel, \n" +
            "e.enrolmenttype_id, \n" +
            "e.uid, \n" +
            "e.utid, \n" +
            "e.uapp, \n" +
            "e.markscale_id, \n" +
            "e.isedustate, \n" +
            "e.isinterview, \n" +
            "e.isoriginal " +
            "FROM (\n" +
            "    SELECT \n" +
            "        mon.enrolment_id,\n" +
            "        mon.kb,\n" +
            "        mon.priority\n" +
            "    FROM v_enrolment_mon mon\n" +
            "    WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "    \n" +
            "    UNION\n" +
            "    \n" +
            "    SELECT \n" +
            "        eda.enrolment_id,\n" +
            "        eda.kb,\n" +
            "        eda.priority\n" +
            "    FROM v_enrolment_destination_admission eda\n" +
            "    WHERE \n" +
            "    eda.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "    AND eda.enrolment_id NOT IN (\n" +
            "        SELECT \n" +
            "            mon.enrolment_id \n" +
            "        FROM v_enrolment_mon mon\n" +
            "        WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "        )\n" +
            "    UNION\n" +
            "    SELECT \n" +
            "        eoce.enrolment_id,\n" +
            "        eoce.kb,\n" +
            "        eoce.priority\n" +
            "    FROM v_enrolment_off_competition_entry eoce\n" +
            "    WHERE\n" +
            "    eoce.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + " \n" +
            "    AND eoce.enrolment_id NOT IN (\n" +
            "\n" +
            "        SELECT \n" +
            "            mon.enrolment_id  \n" +
            "        FROM v_enrolment_mon mon\n" +
            "        WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "        UNION\n" +
            "        SELECT \n" +
            "            eda.enrolment_id \n" +
            "        FROM v_enrolment_destination_admission eda\n" +
            "        WHERE eda.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "        AND eda.enrolment_id NOT IN (\n" +
            "            SELECT \n" +
            "                mon.enrolment_id \n" +
            "            FROM v_enrolment_mon mon\n" +
            "            WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "        )\n" +
            "        \n" +
            "    )\n" +
            "    UNION\n" +
            "    SELECT \n" +
            "        default_entry.enrolment_id,\n" +
            "        default_entry.kb,\n" +
            "        default_entry.priority\n" +
            "    FROM v_enrolment_default_entry default_entry\n" +
            "    WHERE default_entry.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + " \n" +
            "    AND default_entry.enrolment_id NOT IN (\n" +
            "        SELECT \n" +
            "            mon.enrolment_id \n" +
            "        FROM v_enrolment_mon mon\n" +
            "        WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "        UNION\n" +
            "        SELECT \n" +
            "            eda.enrolment_id \n" +
            "        FROM v_enrolment_destination_admission eda\n" +
            "        WHERE eda.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + " \n" +
            "        AND eda.enrolment_id NOT IN (\n" +
            "            SELECT \n" +
            "                mon.enrolment_id \n" +
            "            FROM v_enrolment_mon mon\n" +
            "            WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "            )\n" +
            "        UNION\n" +
            "        SELECT \n" +
            "            eoce.enrolment_id \n" +
            "        FROM v_enrolment_off_competition_entry eoce\n" +
            "        WHERE eoce.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + " \n" +
            "        AND eoce.enrolment_id NOT IN (\n" +
            "            SELECT \n" +
            "                mon.enrolment_id  \n" +
            "            FROM v_enrolment_mon mon\n" +
            "            WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "            UNION\n" +
            "            SELECT \n" +
            "                eda.enrolment_id \n" +
            "            FROM v_enrolment_destination_admission eda\n" +
            "            WHERE eda.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + " \n" +
            "            AND eda.enrolment_id NOT IN (\n" +
            "                SELECT \n" +
            "                    mon.enrolment_id \n" +
            "                FROM v_enrolment_mon mon\n" +
            "                WHERE mon.specoffer_id = "  + SPECOFFER_ID_PLACEHOLDER + "\n" +
            "            )\n" +
            "            \n" +
            "        )\n" +
            "    )\n" +
            "    ORDER BY priority DESC,kb\n" +
            ") AS rating\n" +
            "INNER JOIN q_dc_enrolment e ON e.id = rating.enrolment_id\n";

    public List<EnrolmentRating> getRatingEnrolments(long specofferId) {
        String sql = QUERY_SQL.replace(SPECOFFER_ID_PLACEHOLDER, String.valueOf(specofferId));
        List<Object[]> enrolmentRatings = getPersistenceManager().executeNativeQuery(sql);

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
                    enrolmentRating.setMarkScaleId(Objects.nonNull(arr[3]) ? Long.parseLong(String.valueOf(arr[19])) : null);
                    enrolmentRating.setIsEducationState((Integer) arr[20]);
                    enrolmentRating.setIsInterview((Integer) arr[21]);
                    enrolmentRating.setIsOriginal((Integer) arr[22]);

                    return enrolmentRating;
                })
                .collect(Collectors.toList());
    }


}
