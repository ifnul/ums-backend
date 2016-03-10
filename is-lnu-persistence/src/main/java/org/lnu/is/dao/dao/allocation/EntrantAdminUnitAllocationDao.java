package org.lnu.is.dao.dao.allocation;

import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @since 3/10/16
 */
@Repository
public class EntrantAdminUnitAllocationDao {
    private static final String QUERY_SQL = "SELECT \n" +
            "COUNT(enrolment.id) AS entrantCount, \n" +
            "au.name AS adminUnit,\n" +
            "au.id AS adminUnitId\n" +
            "FROM q_dc_enrolment enrolment\n" +
            "INNER JOIN q_ob_person person ON  person.id = enrolment.person_id\n" +
            "INNER JOIN q_od_personaddress person_address ON person_address.id = \n" +
            "(SELECT MAX(id) FROM q_od_personaddress pa WHERE pa.person_id = enrolment.person_id GROUP BY pa.person_id)\n" +
            "INNER JOIN (\n" +
            "  WITH RECURSIVE recursetree(id, parent_id, path, name) AS (\n" +
            "    SELECT \n" +
            "        id, \n" +
            "        parent_id, \n" +
            "        array[id] AS path, \n" +
            "        name \n" +
            "    FROM q_ob_adminunit WHERE parent_id = %d \n" +
            "  UNION ALL\n" +
            "    SELECT t.id, t.parent_id, rt.path || t.id, t.name\n" +
            "    FROM q_ob_adminunit t\n" +
            "    JOIN recursetree rt ON rt.id = t.parent_id\n" +
            "  )\n" +
            "  SELECT path[1] AS admin_unit_id, id, name FROM recursetree ORDER BY path\n" +
            ") AS admin_unit_root ON admin_unit_root.id = person_address.adminunit_id\n" +
            "INNER JOIN q_ob_adminunit au ON au.id = admin_unit_root.admin_unit_id\n" +
            "GROUP BY au.name, au.id\n" +
            "\n";

    @PersistenceContext
    private EntityManager entityManager;

    public List<AdminUnitEntrantAllocation> getAdminUnitEntrantsAllocation(long mainAdminUnitId) {
        Query query = entityManager.createNativeQuery(String.format(QUERY_SQL, mainAdminUnitId));
        List<Object[]> resultList = query.getResultList();
        return resultList.stream()
                .map(arr -> new AdminUnitEntrantAllocation(String.valueOf(arr[1]), Long.valueOf(arr[2].toString()), Integer.valueOf(arr[0].toString())))
                .collect(toList());
    }
}
