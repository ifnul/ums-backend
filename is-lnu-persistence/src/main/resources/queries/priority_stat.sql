SELECT
	e.priority,
	COUNT(e.id)
FROM q_dc_enrolment e
INNER JOIN q_ob_specoffer s ON s.id = e.specoffer_id
WHERE s.timeperiod_id = $$TIME_PERIOD_ID$$
GROUP BY e.priority
