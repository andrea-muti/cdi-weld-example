package com.muti.cdi.weld.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * In a Java EE environment it is common to create loggers for every class.
 * The logging producer enables to inject a org.slf4j.Logger implementation into any class
 * we want without having to configure them every time.
 */
public class LoggingProducer {

    /**
     * The @Produces annotation lets us inject the Logger implementation into any CDI bean
     * The logger is configured by retrieving the class where it is injected via injectionPoint.
     * The @Log annotation is a qualifier that describes the injection
     *
     * @param injectionPoint
     * @return
     */
    @Produces @Log
    private Logger createLogger(InjectionPoint injectionPoint) {

        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
    }
}