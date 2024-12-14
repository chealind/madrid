@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  madrid startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and MADRID_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\madrid-0.1-jit.jar;%APP_HOME%\lib\context-propagation-1.1.2.jar;%APP_HOME%\lib\micronaut-validation-4.8.0.jar;%APP_HOME%\lib\micronaut-reactor-3.6.0.jar;%APP_HOME%\lib\micronaut-serde-jackson-2.12.0.jar;%APP_HOME%\lib\micronaut-serde-support-2.12.0.jar;%APP_HOME%\lib\micronaut-serde-api-2.12.0.jar;%APP_HOME%\lib\micronaut-websocket-4.7.6.jar;%APP_HOME%\lib\jakarta.validation-api-3.1.0.jar;%APP_HOME%\lib\logstash-logback-encoder-7.0.1.jar;%APP_HOME%\lib\micronaut-http-server-netty-4.7.6.jar;%APP_HOME%\lib\micronaut-http-server-4.7.6.jar;%APP_HOME%\lib\micronaut-http-netty-4.7.6.jar;%APP_HOME%\lib\micronaut-http-client-core-4.7.6.jar;%APP_HOME%\lib\micronaut-router-4.7.6.jar;%APP_HOME%\lib\micronaut-jackson-core-4.7.6.jar;%APP_HOME%\lib\micronaut-json-core-4.7.6.jar;%APP_HOME%\lib\micronaut-http-4.7.6.jar;%APP_HOME%\lib\micronaut-context-propagation-4.7.6.jar;%APP_HOME%\lib\micronaut-discovery-core-4.7.6.jar;%APP_HOME%\lib\micronaut-context-4.7.6.jar;%APP_HOME%\lib\micronaut-aop-4.7.6.jar;%APP_HOME%\lib\micronaut-buffer-netty-4.7.6.jar;%APP_HOME%\lib\micronaut-inject-4.7.6.jar;%APP_HOME%\lib\logback-classic-1.5.9.jar;%APP_HOME%\lib\snakeyaml-2.2.jar;%APP_HOME%\lib\jackson-annotations-2.17.2.jar;%APP_HOME%\lib\jackson-core-2.17.2.jar;%APP_HOME%\lib\jackson-databind-2.17.2.jar;%APP_HOME%\lib\jakarta.annotation-api-2.1.1.jar;%APP_HOME%\lib\netty-codec-http2-4.1.115.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.115.Final.jar;%APP_HOME%\lib\netty-handler-4.1.115.Final.jar;%APP_HOME%\lib\netty-codec-4.1.115.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.115.Final.jar;%APP_HOME%\lib\netty-transport-4.1.115.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.115.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.115.Final.jar;%APP_HOME%\lib\netty-common-4.1.115.Final.jar;%APP_HOME%\lib\reactor-core-3.6.10.jar;%APP_HOME%\lib\micronaut-core-reactive-4.7.6.jar;%APP_HOME%\lib\reactive-streams-1.0.4.jar;%APP_HOME%\lib\micronaut-core-4.7.6.jar;%APP_HOME%\lib\logback-core-1.5.9.jar;%APP_HOME%\lib\slf4j-api-2.0.16.jar;%APP_HOME%\lib\jakarta.inject-api-2.0.1.jar


@rem Execute madrid
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %MADRID_OPTS%  -classpath "%CLASSPATH%" com.madrid.Application %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable MADRID_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%MADRID_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
