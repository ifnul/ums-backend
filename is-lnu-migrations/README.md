1)Щоб запустити міграції, виконайте
	mvn liquibase:update

2)ВАЖЛИВО:
	Якщо створюєте нову табличку - вішайте обовязково на неї наступні тригери
	1)update_date - дивитись в v-0.9.0.1/2015-02-16--03-triggers.xml

2)Таблиці, дані до яких потрібно додати
	
	* q_rf_pensiontype
	
	* q_rf_familytype
	
	* q_rf_studyplancycle
	
	* q_rf_markscaletype
	
	* q_rf_enrolmentforeigntype