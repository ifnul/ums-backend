SELECT
    eda.enrolment_id,
    eda.kb,
    eda.priority
FROM v_enrolment_destination_admission eda
WHERE
eda.specoffer_id = $$SPECOFFER_ID$$
AND eda.enrolment_id NOT IN (
    SELECT
        mon.enrolment_id
    FROM v_enrolment_mon mon
    WHERE mon.specoffer_id = $$SPECOFFER_ID$$
)