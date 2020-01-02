@echo off
call mvnw clean package 
call mkdir %USERPROFILE%\desktop\maven 
call mkdir %USERPROFILE%\desktop\maven\exe 
call mkdir %USERPROFILE%\desktop\maven\lib 
call mkdir %USERPROFILE%\desktop\maven\all 
for /r . %%i in (*exec.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\maven\exe /y 
for /r . %%i in (*dev.jar) do  call xcopy /q /a %%i %USERPROFILE%\desktop\maven\lib /y 
for /r . %%i in (*dev*.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\maven\all /y 
call mvnw clean