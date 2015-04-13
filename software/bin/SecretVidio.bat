@echo off
set JARS="./*.jar"
set LIBPATH=.

setlocal EnableDelayedExpansion
FOR %%i IN (%JARS%) DO SET CLASSPATH=!CLASSPATH!;%LIBPATH%/%%i
echo %CLASSPATH%
start javaw -cp AudioEncryptDecrypt.jar com.ws.project.dencrypt.gui.DencryptUI

endlocal