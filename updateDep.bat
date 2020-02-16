@echo off
call mvn versions:update-parent versions:commit
call mvn versions:use-latest-versions 
call mvn clean