SELECT
  COUNT(e.id) AS general_count,
  COUNT(eb.id) AS benefit_count,
  COUNT(la.person_id) AS award_count,
  d.name,
  d.id
FROM q_dc_enrolment e
LEFT OUTER JOIN q_ob_department d ON d.id = e.department_id
LEFT OUTER JOIN q_dt_enrolmentbenefit eb ON eb.enrolment_id = e.id
LEFT OUTER JOIN (
  SELECT
    MAX(pa.id) AS lastAwardId,
    pa.person_id AS person_id
  FROM q_od_personaward pa
  GROUP BY pa.person_id
) la ON la.person_id = e.person_id
INNER JOIN q_ob_specoffer s ON s.id = e.specoffer_id
WHERE s.timeperiod_id = $$TIME_PERIOD_ID$$
GROUP BY d.name,d.id