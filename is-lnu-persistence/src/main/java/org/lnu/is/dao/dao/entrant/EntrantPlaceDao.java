package org.lnu.is.dao.dao.entrant;

import org.lnu.is.domain.enrolment.EntrantPlace;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EntrantPlaceDao {
    private static final String QUERY_SQL = "SELECT \n" +
            "\tROUND((1.0 * COUNT(e.id)/s.statecount), 3) AS entrant_per_place, \n" +
            "\td.name AS name, \n" +
            "\td.id AS id \n" +
            "FROM q_dc_enrolment e\n" +
            "LEFT OUTER JOIN q_ob_specoffer s ON s.id = e.specoffer_id\n" +
            "LEFT OUTER JOIN q_ob_department d ON d.id = e.department_id\n" +
            "GROUP BY d.name, d.id, s.statecount\n" +
            "ORDER BY entrant_per_place DESC";

    @PersistenceContext
    private EntityManager entityManager;

    public List<EntrantPlace> getEntrantsPerPlace() {
        Query query = entityManager.createNativeQuery(QUERY_SQL);
        List<Object[]> result = query.getResultList();
        return result.stream()
                .map(arr -> new EntrantPlace(Double.parseDouble(arr[0].toString()), arr[1].toString(), Long.parseLong(arr[2].toString())))
                .collect(Collectors.toList());
    }
}
