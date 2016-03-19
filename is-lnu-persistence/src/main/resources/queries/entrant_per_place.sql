SELECT  
  COUNT(e.id) AS enrolments_count,
  s.statecount,
  d.name AS name,
  d.id AS id
FROM q_dc_enrolment e 
LEFT OUTER JOIN q_ob_specoffer s ON s.id = e.specoffer_id 
LEFT OUTER JOIN q_ob_department d ON d.id = e.department_id
WHERE s.timeperiod_id = $$TIME_PERIOD_ID$$
GROUP BY d.name, d.id, s.statecount 
ORDER BY enrolments_count DESC