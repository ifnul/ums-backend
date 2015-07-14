@echo off 
SETLOCAL

set BACKEND_PATH=%CD%

pushd ..\ums-tools\maven
set MVN_PATH=%CD%
popd

set COMMAND=%1

for /f "tokens=1*" %%a in ("%*") do (
    set ARGS=%%b
)

@echo on
@echo off goto %COMMAND%

:build
    %MVN_PATH%\bin\mvn clean install %ARGS%
    goto EOF

:migrate
    cd %BACKEND_PATH%\is-lnu-migrations
    %MVN_PATH%\bin\mvn liquibase:update %ARGS%
    goto EOF

:seed
    cd %BACKEND_PATH%\is-lnu-sql
    %MVN_PATH%\bin\mvn -Pdata clean install %ARGS%
    goto EOF

:run
    cd %BACKEND_PATH%\is-lnu-rest-api
    %MVN_PATH%\bin\mvn tomcat7:run %ARGS%
    goto EOF

:test
    cd %BACKEND_PATH%\is-lnu-integration
    %MVN_PATH%\bin\mvn clean test %ARGS%
    goto EOF

:EOF