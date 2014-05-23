package com.caffeinegeek.examples.web.controller;

import com.caffeinegeek.examples.domain.TestResponse;
import com.caffeinegeek.examples.service.TestService;
import com.caffeinegeek.examples.web.Paths;
import com.caffeinegeek.examples.web.domain.TestObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(Paths.EXAMPLES)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Inject
    private TestService service;

    @GET
    @Path(Paths.STRING)
    public String string() {
        LOGGER.info("Get string!");
        return "Get string!";
    }

    @GET
    @Path(Paths.OBJECT)
    public TestObject object() {
        LOGGER.info("Get object!");
        return new TestObject("Get object!");
    }

    @GET
    @Path(Paths.SERVICE)
    public TestResponse service() {
        LOGGER.info("Get response!");
        return service.getResponse();
    }
}
