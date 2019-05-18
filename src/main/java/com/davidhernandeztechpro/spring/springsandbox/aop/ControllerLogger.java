package com.davidhernandeztechpro.spring.springsandbox.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControllerLogger {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void afterReturn(Object returnValue) throws Throwable {
        logger.info("value return was {}",  returnValue);
    }
}
