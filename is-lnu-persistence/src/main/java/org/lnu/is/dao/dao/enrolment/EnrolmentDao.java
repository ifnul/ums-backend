package org.lnu.is.dao.dao.enrolment;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @since 3/17/16
 */
public class EnrolmentDao extends DefaultDao<Enrolment, Enrolment, Long> {
    private static final String SPECOFFER_ID_PLACEHOLDER = "$$SPECOFFER_ID$$";

    private static final String QUERY_SQL = "SELECT * FROM (\n" +
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
                    
                    return enrolmentRating;
                })
                .collect(Collectors.toList());
    }


}
