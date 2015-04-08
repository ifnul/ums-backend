INSERT INTO q_rf_contacttype(abbrname, name, uid, utid, uapp, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES 
	('тел.', 'Телефон', 1, null, 'edbo/PersonContactTypesGet', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('моб.тел.', 'Мобільний', 2, null, 'edbo/PersonContactTypesGet', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('e-mail', 'e-mail', 3, null, 'edbo/PersonContactTypesGet', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('ISQ', 'ICQ', 4, null, 'edbo/PersonContactTypesGet', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('Skype', 'Skype', 5, null, 'edbo/PersonContactTypesGet', 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('дом.тел.', 'Домашній телефон', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('роб.тел.', 'Робочий телефон', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('веб-сайт', 'Веб-сайт', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('вікі', 'Вікі-сторінка', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now()), 
	('LDAP', 'Каталог облікових записів', null, null, null, 'ACTIVE', 1, null, 'illay', 'public', now(), now())
