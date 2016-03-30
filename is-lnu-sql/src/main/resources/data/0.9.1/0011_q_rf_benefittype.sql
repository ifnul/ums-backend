INSERT INTO q_rf_benefittype(abbrname, name, priority, parent_id, uid, utid, uapp, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES 
	('NULL', 'Пільга', 0, NULL, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()), 
	('NULL', 'Група пільг', 0, NULL, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()), 
	('NULL', 'Квота МОН', 4, NULL, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()),
	('NULL', 'Коди вступу', 0, NULL, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()), 
	('NULL', 'Цільовий вступ', 3, 1, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()), 
	('NULL', 'Позаконкурсний вступ', 2, 1, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now()),
	('NULL', 'Першочерговий вступ', 1, 1, NULL, 'NULL', 'NULL', 'ACTIVE', 1, 'NULL', 'NULL', 'public', now(), now())
