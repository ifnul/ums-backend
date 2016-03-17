INSERT INTO q_dt_enrolmentbenefit(
            enrolment_id, benefit_id, personpaper_id, uid, utid, uapp,
            status, actual, note, crtuser, crtusergroup, update_date, create_date) VALUES
            -- Квота МОН
            (1, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (2, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (3, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (4, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (5, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),

            -- Цільовий вступ
            (6, 104, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (7, 104, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),

            -- Поза конкурсний вступ
            (8, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (9, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now()),
            (10, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'crtusergroup', now(), now());