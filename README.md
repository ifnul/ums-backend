##What is this repository for?

>Репозиторій містить ERP(*Enterprise Resource Planning*) - систему, яка створюється на базі ЛНУ ім.І.Франка з використанням Java технологій.

##How do I get set up?


---
- ###*JDK (Java Development Kit)*

>*JDK* - набір компонентів, які дозволяють створювати Java-аплікації. До його складу входять компілятор (*javac*), стандартні бібліотеки класів Java, *JRE (Java Runtime Envoirement)*, тощо. 

>*IDE (Integrated Development Envoirement)* до набору **не входить**

Перш за все, для роботи з проектом необхідно мати встановлений JDK. Завантажити його можна за [посиланням], вибравши версію, яка відповідає вашій ОС та архітектурі. 

---
- ###*STS (Spring Tools Suit) / Eclipse*

Наступним кроком є встановлення *IDE*. Будь-яке з вищезазначених середовищ підходить для роботи з проектом. Більш детальна інформація наведена нижче :

 [Eclipse]

 [Spring Tools Suite]

Для завантаження вибраного IDE перейдіть за посиланнями :

  [Download STS]

  [Download Eclipse]

---
- ###*PostgreSQL*

>Для роботи з базами даних використовується відкрита СУБД *PostgreSQL*. 
До її складу входять *PostgreSQL Server* , *pgAdminIII* - графічна утиліта для керування БД та *StackBuilder* - менеджер доповнень.

Завантажити її можна тут :

 [Download PostgreSQL]

---

##What's next?

Наступним кроком є імпортування проекту в *IDE*.

Це можна зробити двома способами :

>Відкрийте *Eclipse / Spring Tools Suite*

>*1)* ***Цей спосіб потребує завантаження проекту з репозиторію ***

>*Import -> Existing Maven Projects -> Root Directory - шлях до проекту  -> Select All -> Finish*

>*2) Import -> Checkout Maven Projects from SCM -> SCM URL - посилання на репозиторій -> Finish*

- ###Maven

>*Maven* - фреймворк для автоматизації збірки проектів. Однією з його особливостей є автоматичне завантаження відсутніх залежностей(*<dependancy>*) імпортованого проекту, які містяться в файлі *pom.xml*

>**Інколи бувають проблеми** зв'язані з некоректним завантаженням залежностей. У цьому випадку потрібно видалити проект та папку *С:\Users\username\\.m2*, після чого імпортувати його знову.  





[посиланням]:http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
[Eclipse]:http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Fguide%2Fint_eclipse.htm
[Spring Tools Suite]:http://spring.io/tools
[Download STS]:http://spring.io/tools/sts
[Download Eclipse]:https://www.eclipse.org/downloads/
[Download PostgreSQL]:http://www.postgresql.org/download/