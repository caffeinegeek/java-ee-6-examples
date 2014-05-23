package com.caffeinegeek.examples.service;

import com.caffeinegeek.examples.domain.TestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    public TestResponse getResponse() {
        LOGGER.info("Get response!");
        return new TestResponse("Get response!");
    }
}
