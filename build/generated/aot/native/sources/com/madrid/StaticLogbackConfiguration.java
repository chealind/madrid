package com.madrid;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.Status;
import java.lang.String;
import java.lang.Throwable;
import net.logstash.logback.appender.LogstashTcpSocketAppender;
import net.logstash.logback.encoder.LogstashEncoder;

public class StaticLogbackConfiguration implements Configurator {
  private Context context;

  public Configurator.ExecutionStatus configure(LoggerContext loggerContext) {
    ConsoleAppender stdout = new ConsoleAppender();
    PatternLayoutEncoder encoder = new PatternLayoutEncoder();
    encoder.setPattern("%cyan(%d{HH:mm:ss.SSS}) %gray([%thread]) %highlight(%-5level) %magenta(%logger{36}) - %msg%n");
    encoder.setContext(context);
    encoder.start();
    stdout.setEncoder(encoder);
    stdout.setContext(context);
    stdout.start();
    LogstashTcpSocketAppender elastic = new LogstashTcpSocketAppender();
    elastic.addDestination("logstash:5044");
    LogstashEncoder encoder_3 = new LogstashEncoder();
    encoder_3.setCustomFields("{\"service_name\":\"${SERVICE_NAME}\"}");
    encoder_3.setContext(context);
    encoder_3.start();
    elastic.setEncoder(encoder_3);
    elastic.setContext(context);
    elastic.start();
    Logger _rootLogger = loggerContext.getLogger(Logger.ROOT_LOGGER_NAME);
    _rootLogger.setLevel(Level.INFO);
    _rootLogger.addAppender(stdout);
    _rootLogger.addAppender(elastic);
    return Configurator.ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public Context getContext() {
    return context;
  }

  public void addStatus(Status status) {
  }

  public void addInfo(String info) {
  }

  public void addInfo(String info, Throwable ex) {
  }

  public void addWarn(String warn) {
  }

  public void addWarn(String warn, Throwable ex) {
  }

  public void addError(String error) {
  }

  public void addError(String error, Throwable ex) {
  }
}
