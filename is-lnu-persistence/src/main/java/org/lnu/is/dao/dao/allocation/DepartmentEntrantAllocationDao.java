package org.lnu.is.dao.dao.allocation;

import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DepartmentEntrantAllocationDao {
    private static final String QUERY_SQL = "SELECT \n" +
            "COUNT(e.id) AS general_count,\n" +
            "COUNT(eb.id) AS benefit_count, \n" +
            "COUNT(la.person_id) AS award_count,\n" +
            "d.name,\n" +
            "d.id\n" +
            "FROM public.q_dc_enrolment e\n" +
            "LEFT OUTER JOIN q_ob_department d ON d.id = e.department_id\n" +
            "LEFT OUTER JOIN q_dt_enrolmentbenefit eb ON eb.enrolment_id = e.id\n" +
            "LEFT OUTER JOIN (\n" +
            "\tSELECT MAX(pa.id) AS lastAwardId, pa.person_id AS person_id FROM q_od_personaward pa GROUP BY pa.person_id\n" +
            ") la ON la.person_id = e.person_id \n" +
            "GROUP BY d.name,d.id";

    @PersistenceContext
    private EntityManager entityManager;

    public List<DepartmentEntrantAllocation> getDepartmentsAllocations() {
        Query query = entityManager.createNativeQuery(QUERY_SQL);
        List<Object[]> result = query.getResultList();
        return result.stream()
                .map(arr -> new DepartmentEntrantAllocation(arr[3].toString(),
                        Long.valueOf(arr[4].toString()),
                        Integer.valueOf(arr[0].toString()),
                        Integer.valueOf(arr[2].toString()),
                        Integer.valueOf(arr[1].toString())))
                .collect(Collectors.toList());
    }
}
