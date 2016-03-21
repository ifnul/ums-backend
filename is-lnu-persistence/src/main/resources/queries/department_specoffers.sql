SELECT
	d.id AS department_id,
	d.name AS department_name,
	s.id AS specoffer_id,
	sp.name AS specoffer_name
FROM public.q_ob_specoffer s
INNER JOIN q_ob_specialty sp ON sp.id = s.specialty_id
INNER JOIN q_ob_department d ON s.department_id = d.id
WHERE s.timeperiod_id = $$TIME_PERIOD_ID$$