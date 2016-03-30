INSERT INTO q_rf_ordertype(abbrname, name, parent_id, uid, utid, uapp, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES 
	('ABITUR', 'Протоколи та накази на зарахування', null, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Протокол основний', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Протокол додатковий', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Протокол на поновлення', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Протокол - іноземці', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Наказ основний', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Наказ додатковий', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Наказ на поновлення', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	(null, 'Наказ  іноземці', 1, null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now())
