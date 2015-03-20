INSERT INTO q_op_usergroup(user_id, group_id, major, title, description, id, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES
	(1, 1, true, 'admin->developers', 'Relation between admin and developers group', 1, 'ACTIVE', 1, 'This is first role.', 'illay', 'public', now(), now()),
	(1, 2, true, 'admin->public', 'Relation between admin and public group', 2, 'ACTIVE', 1, 'This is default student role', 'illay', 'public', now(), now())
