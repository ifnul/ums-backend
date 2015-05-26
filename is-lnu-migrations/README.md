1)Щоб запустити міграції, виконайте
	mvn liquibase:update

2)ВАЖЛИВО:
	Якщо створюєте нову табличку - вішайте обовязково на неї наступні тригери
	1)update_date - дивитись в v-0.9.0.1/2015-02-16--03-triggers.xml
	2)Якщо добавляєте/видаляєте нові поля в таблиці q_ob_person, тоді обновляйте зразу тригери
	process_person -> знайти базову версію ви можете в v-0.9.0.1/2015-02-16--03-triggers.xml
	3)Якщо ви добавляєте табличку, в якій є зовнішній ключ на q_ob_person, обовязково потрібно
	обновити тригер process_person() -> базова версія в v-0.9.0.1/2015-02-16--03-triggers.xml
	4)Називати мігрейшини потрібно ось так - 0.9.0.1.map_update_date_trigger_to_new_fields
		Назва починається з глобальної версії.
	

2)Таблиці, дані до яких потрібно додати
	* q_rf_pensiontype
	* q_rf_familytype
	* q_rf_studyplancycle
	* q_rf_markscaletype
	* q_rf_enrolmentforeigntype
	* q_rf_degreetype
	* q_rf_dutytype