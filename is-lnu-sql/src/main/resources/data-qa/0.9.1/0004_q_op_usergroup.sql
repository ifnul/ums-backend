INSERT INTO q_op_usergroup(user_id, group_id, major, title, description, status, actual, note, crtuser, crtusergroup, create_date, update_date ) VALUES 
	(1, 1, true, 'admin->developers', 'Relation between admin and developers group', 'ACTIVE', 1, 'This is first role.', 'illay', 'public', now(), now()), 
	(1, 2, true, 'admin->public', 'Relation between admin and public group', 'ACTIVE', 1, 'This is default student role', 'illay', 'public', now(), now())
