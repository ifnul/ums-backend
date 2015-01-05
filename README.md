##Найближчі плани

* CRUD методи для всіх сутностей
* Валідація сутностей
* Інтеграційні тести
* Інтеграція з ЄДЄБО
* Початок роботи з фронтендом

##Досягення
* 11.12.2014
  220 комітів
  22 інтеграційних тести

* 27.12.2014 

  275 комітів

  41 інтеграційний тест
  135 API методи


##What is this repository for?

>Репозиторій містить ERP(*Enterprise Resource Planning*) - систему, яка створюється на базі ЛНУ ім.І.Франка з використанням Java технологій.

##How do I get set up?


---
- ###*JDK (Java Development Kit)*

>*JDK* - набір компонентів, які дозволяють створювати Java-аплікації. До його складу входять компілятор (*javac*), стандартні бібліотеки класів Java, *JRE (Java Runtime Envoirement)*, тощо. 

>*IDE (Integrated Development Envoirement)* до набору **не входить**

>*Version : 1.7*

Перш за все, для роботи з проектом необхідно мати встановлений JDK. Завантажити його можна за [посиланням], вибравши версію, яка відповідає вашій ОС та архітектурі. 

---
- ###*STS (Spring Tools Suit) / Eclipse*

Наступним кроком є встановлення *IDE*. Будь-яке з вищезазначених середовищ підходить для роботи з проектом. Більш детальна інформація наведена нижче :

 + [Eclipse]

 + [Spring Tools Suite]

Для завантаження вибраного *IDE* перейдіть за посиланнями :

  + [Download STS]

  + [Download Eclipse]

---
- ###*PostgreSQL*

>Для роботи з базами даних використовується відкрита СУБД *PostgreSQL*. 
До її складу входять *PostgreSQL Server* , *pgAdminIII* - графічна утиліта для керування БД та *StackBuilder* - менеджер доповнень.

>*Version : 9.3*

Завантажити її можна тут :

+ [Download PostgreSQL]

---

##What's next?

- ###Importing Maven project

>***Maven*** - фреймворк для автоматизації збірки проектів. Однією з його особливостей є автоматичне завантаження відсутніх залежностей(*<dependancy>*) імпортованого проекту, які містяться в файлі *pom.xml*

>*Version : 3.2.3*

Імпортувати проект в *IDE* можна двома способами :

>Відкрийте *Eclipse / Spring Tools Suite*

>*1)* ***Цей спосіб потребує завантаження проекту з репозиторію ***

>*Import -> Existing Maven Projects -> Root Directory - шлях до проекту  -> Select All -> Finish*

>*2) Import -> Checkout Maven Projects from SCM -> SCM URL - посилання на репозиторій -> Finish*

>**Інколи бувають проблеми** зв'язані з некоректним завантаженням залежностей. У цьому випадку потрібно видалити проект та папку *С:\Users\username\\.m2*, після чого імпортувати його знову.  

- ###Envoirement variables

Для зручної роботи з вищезгаданими елементами через термінал потрібно задати так звані *path variables* для *Maven,JDK* та *PostgreSQL*.  Інструкції як це зробити для вашої ОС можна найти за посиланнями:

 + [Java]

 + [Maven]

 + [PostgreSQL]

Для перевірки працездатності, відкрийте термінал та введіть такі команди :

>*mvn --version*

>*java --version*

>*psql --version*

Результатом виконання мають бути версії *Maven, Java* та *PostgreSQL*

- ###Creating a Database

Після імпортування проекту необхідно підняти базу даних. Для роботи з нею використовується *superuser* ***postgres***. Інформацію про назву БД та її налаштування можна отримати з файлу *pom.xml* . Для її створення запустіть термінал, та введіть такі команди :

>*psql -U postgres*

>*Введіть пароль*

>*CREATE DATABASE databasename;*

*psql* представляє собою  інтерфейс роботи з *PostgreSQL* через термінал. Детальну інформацію про роботу з ним можна найти за посиланням :

+ [psql]

Створена база даних є пустою, тому перейдемо до її заповнення

- ###Running migrations

Для запуску міграцій використовується *Maven*. Відкрийте термінал, зайдіть у папку папку модуля is-lnu-migrations та виконайте команду :

>*mvn liquibase:update*


Проте, *Maven* використовується нами і в інших цілях. Нижче буде наведено список корисних команд  та коментарі до них

>*mvn clean - очистити проект*

>*mvn compile - компіляція проекту*

>*mvn test -  запуск unit - тестів*

>*mvn verify - запуск інтеграційних тестів*

>*mvn install - встановлення пакету в локальний репозиторій*

Можливе виконання декількох команд в одному рядку, наприклад :

>*mvn clean install*


- ###Maven Build profiles

*Maven* надає можливість змінювати настройки проекту в залежності від оточення(*пр. production / development*). Профілі описуються в файлі *pom.xml* та спрацьовують під час побудови проекту.

Виглядає це так:

```xml
<profiles>
  <profile>
   <id>profilename</id>
   <modules>
    <module>modulename</module>
   </modules>   
  </profile>
 </profiles>  
</project>
```

Таким чином побудова проекту командою *mvn clean install* не буде включати модулі, що знаходяться у цьому профілі. Для їх включення використовується така команда :

>*mvn -Pprofilename*

Наприклад :

>*mvn clean install -Pprofilename

Ви можете включити виконання певних профілів за замовчуванням :

```xml
<profiles>
  <profile>
    <id>profilename</id>
    <activation>
      <activeByDefault>true</activeByDefault>
    </activation>
      ....
  </profile>
</profiles>
```
Існують і інші способи їх активації, з якими ви можете ознайомитись за посиланням :

[Maven Profiles]

- ###WAR files

>*WAR(Web Application Archive*) - містить веб-аплікацію, яку можна розгорнути на сервері

Модулі, які генерують *WAR - файли*, містять такий рядок у файлі *pom.xml* :
>*<packaging>war</packaging>*

Кожен *WAR* файл міститься у папці *target* відповідного модуля.

У якості сервера ми використовуємо *Apache Tomcat 7.0.55*.

Для того, аби розгорнути веб-аплікацію, потрібно перемістити *WAR* файл у папку *TOMCAT_HOME/Webapps* та запустити сервер.


- ###Git 

Для зручної та ефективної роботи з проектом варто використовувати *[Git]*. 

Нижче наведений список команд, які часто використовуються :

>*git clone ***HTTPS-link*** - клонує проект з веб-ресурсу у папку, у якій ви знаходитесь. Як альтернативу HTTPS-link'y можна використовувати SSH. Про його налаштування можна почитати [тут].*

>*git pull - команда має виконуватись із папки проекту та оновлює його відповідно до останніх змін.*

>*git status - відображає зміни між локальною та онлайн версіями проектів*

>*git add -A - використовується з метою додання зміннених та новостворених  файлів перед операцією commit*

>*git commit -m "Commit message" - готує файли та інформацію про зміни для подальшої загрузки у репозиторій з коментарем Сommit message*

>*git push - записує зміни у репозиторій*

>*git rev-list HEAD --count - Дістати кількість комітів за весь час*

[посиланням]:http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
[Eclipse]:http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Fguide%2Fint_eclipse.htm
[Spring Tools Suite]:http://spring.io/tools
[Download STS]:http://spring.io/tools/sts
[Download Eclipse]:https://www.eclipse.org/downloads/
[Download PostgreSQL]:http://www.postgresql.org/download/
[Java]:https://www.java.com/en/down
[Maven]:http://maven.apache.org/download.cgi
[PostgreSQL]:http://www.postgresql.org/docs/8.3/static/install-post.html
[psql]:http://www.postgresql.org/docs/9.3/static/app-psql.html
[Maven Profiles]:http://maven.apache.org/guides/introduction/introduction-to-profiles.html
[Git]:http://git-scm.com/downloads
[тут]:https://confluence.atlassian.com/display/BITBUCKET/Set+up+SSH+for+Git