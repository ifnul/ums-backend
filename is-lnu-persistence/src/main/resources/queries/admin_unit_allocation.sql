SELECT
COUNT(enrolment.id) AS entrantCount,
au.name AS adminUnit,
au.id AS adminUnitId
FROM q_dc_enrolment enrolment
INNER JOIN q_ob_person person ON  person.id = enrolment.person_id
INNER JOIN q_od_personaddress person_address ON person_address.id =
(SELECT MAX(id) FROM q_od_personaddress pa WHERE pa.person_id = enrolment.person_id GROUP BY pa.person_id)
INNER JOIN (
  WITH RECURSIVE recursetree(id, parent_id, path, name) AS (
    SELECT
        id,
        parent_id,
        array[id] AS path,
        name
    FROM q_ob_adminunit WHERE parent_id = $$MAIN_ADMIN_UNIT_ID$$
  UNION ALL
    SELECT t.id, t.parent_id, rt.path || t.id, t.name
    FROM q_ob_adminunit t
    JOIN recursetree rt ON rt.id = t.parent_id
  )
  SELECT path[1] AS admin_unit_id, id, name FROM recursetree ORDER BY path
) AS admin_unit_root ON admin_unit_root.id = person_address.adminunit_id
INNER JOIN q_ob_adminunit au ON au.id = admin_unit_root.admin_unit_id
INNER JOIN q_ob_specoffer s ON s.id = enrolment.specoffer_id
WHERE s.timeperiod_id = $$TIME_PERIOD_ID$$
GROUP BY au.name, au.id