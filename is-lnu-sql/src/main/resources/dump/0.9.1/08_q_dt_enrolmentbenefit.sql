INSERT INTO q_dt_enrolmentbenefit(
            enrolment_id, benefit_id, personpaper_id, uid, utid, uapp,
            status, actual, note, crtuser, crtusergroup, update_date, create_date) VALUES
            -- Квота МОН
            (1, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (2, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (3, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (4, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (5, 103, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),

            -- Цільовий вступ
            (6, 104, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (7, 104, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),

            -- Поза конкурсний вступ
            (8, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (9, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now()),
            (10, 11, 1, 1, 'utid', 'uapp', 'ACTIVE', 1, 'note', 'crtuser', 'public', now(), now());