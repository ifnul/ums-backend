SELECT
    eoce.enrolment_id,
    eoce.kb,
    eoce.priority
FROM v_enrolment_off_competition_entry eoce
WHERE
eoce.specoffer_id = $$SPECOFFER_ID$$
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