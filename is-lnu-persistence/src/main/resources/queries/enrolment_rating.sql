SELECT
    rating.enrolment_id,
    rating.kb,
    rating.priority,
    e.person_id,
    p.firstname,
    p.fathername,
    p.surname
FROM (
    SELECT
        mon.enrolment_id,
        mon.kb,
        mon.priority
    FROM v_enrolment_mon mon
    WHERE mon.specoffer_id = $$SPECOFFER_ID$$

    UNION

    SELECT
        eda.enrolment_id,
        eda.kb,
        eda.priority
    FROM (
        SELECT
            internal_eda.enrolment_id,
            internal_eda.kb,
            internal_eda.priority
        FROM v_enrolment_destination_admission internal_eda
        WHERE
        internal_eda.specoffer_id = $$SPECOFFER_ID$$
        AND internal_eda.enrolment_id NOT IN (
            SELECT
                mon.enrolment_id
            FROM v_enrolment_mon mon
            WHERE mon.specoffer_id = $$SPECOFFER_ID$$
            )
        LIMIT $$EDA_LIMIT$$
    ) AS eda

    UNION

    SELECT
        eoce.enrolment_id,
        eoce.kb,
        eoce.priority
    FROM (
        SELECT
            eoce.enrolment_id,
            eoce.kb,
            eoce.priority
        FROM v_enrolment_off_competition_entry eoce
        WHERE eoce.specoffer_id = $$SPECOFFER_ID$$
        AND eoce.enrolment_id NOT IN (

            SELECT
                mon.enrolment_id
            FROM v_enrolment_mon mon
            WHERE mon.specoffer_id = $$SPECOFFER_ID$$

            UNION

            SELECT eda.enrolment_id FROM (
                SELECT
                    internal_eda.enrolment_id
                FROM v_enrolment_destination_admission internal_eda
                WHERE internal_eda.specoffer_id = $$SPECOFFER_ID$$
                AND internal_eda.enrolment_id NOT IN (
                    SELECT
                        mon.enrolment_id
                    FROM v_enrolment_mon mon
                    WHERE mon.specoffer_id = $$SPECOFFER_ID$$
                )
                LIMIT $$EDA_LIMIT$$
            ) AS eda
        )
    LIMIT $$EOCE_LIMIT$$
    )  AS eoce

    UNION

    SELECT
        default_entry.enrolment_id,
        default_entry.kb,
        default_entry.priority
    FROM v_enrolment_default_entry default_entry
    WHERE default_entry.specoffer_id = $$SPECOFFER_ID$$
    AND default_entry.enrolment_id NOT IN (
        SELECT
            mon.enrolment_id
        FROM v_enrolment_mon mon
        WHERE mon.specoffer_id = $$SPECOFFER_ID$$

        UNION

        SELECT eda.enrolment_id
        FROM (
            SELECT
                eda.enrolment_id
            FROM v_enrolment_destination_admission eda
            WHERE eda.specoffer_id = $$SPECOFFER_ID$$
            AND eda.enrolment_id NOT IN (
                SELECT
                    mon.enrolment_id
                FROM v_enrolment_mon mon
                WHERE mon.specoffer_id = $$SPECOFFER_ID$$
                )
            LIMIT $$EDA_LIMIT$$
        ) as eda

        UNION

        SELECT
            eoce.enrolment_id
        FROM (
            SELECT
                eoce.enrolment_id
            FROM v_enrolment_off_competition_entry eoce
            WHERE eoce.specoffer_id = $$SPECOFFER_ID$$
            AND eoce.enrolment_id NOT IN (
                SELECT
                    mon.enrolment_id
                FROM v_enrolment_mon mon
                WHERE mon.specoffer_id = $$SPECOFFER_ID$$
                UNION
                SELECT
                    eda.enrolment_id
                FROM v_enrolment_destination_admission eda
                WHERE eda.specoffer_id = $$SPECOFFER_ID$$
                AND eda.enrolment_id NOT IN (
                    SELECT
                        mon.enrolment_id
                    FROM v_enrolment_mon mon
                    WHERE mon.specoffer_id = $$SPECOFFER_ID$$
                )
            )
        LIMIT $$EOCE_LIMIT$$
        ) AS eoce
    )
    ORDER BY priority DESC,kb
) AS rating
INNER JOIN q_dc_enrolment e ON e.id = rating.enrolment_id
INNER JOIN q_ob_person p ON e.person_id = p.id
