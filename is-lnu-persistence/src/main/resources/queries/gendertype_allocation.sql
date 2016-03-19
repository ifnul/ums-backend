SELECT
	sp.name,
	SUM(CASE WHEN gt.abbrname = 'чол.' THEN 1 ELSE 0 END) men_count,
	SUM(CASE WHEN gt.abbrname = 'жін.' THEN 1 ELSE 0 END) women_count
FROM q_dc_enrolment e
INNER JOIN q_ob_person p ON e.person_id = p.id
INNER JOIN q_rf_gendertype gt ON p.gendertype_id = gt.id
INNER JOIN q_ob_specoffer s ON e.specoffer_id = s.id
INNER JOIN q_ob_specialty sp ON s.specialty_id = sp.id
WHERE e.specoffer_id = $$SPECOFFER_ID$$
GROUP BY e.specoffer_id, sp.name
