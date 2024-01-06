package com.bezkoder.spring.jpa.h2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j1 {

    private static Logger logger = LoggerFactory.getLogger(TestLog4j1.class);

    public void testMethod() {
        logger.debug("msg de debogage");
        logger.info("msg d'information");
        logger.warn("msg d'avertissement");
        logger.error("msg d'erreur");
    }
}