INSERT INTO q_rf_persontype(abbrname, name, uid, utid, uapp, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES 
	('A', 'абітурієнт', 1, null, 'edbo', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('S', 'студент', 2, null, 'edbo', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('R', 'науковець', 3, null, 'edbo', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('E', 'працівник', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('G', 'випускник', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('SA', 'студент/абітурієнт', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('EA', 'працівник/абітурієнт', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('ES', 'працівник/студент', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('P', 'аспірант', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('O', 'сторонній', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now())
