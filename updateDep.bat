@echo off
call mvnw clean versions:update-parent versions:use-latest-versions versions:commit clean
call mvnw clean