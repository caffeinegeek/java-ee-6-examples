package com.caffeinegeek.examples.cdi.controller;

import com.caffeinegeek.examples.cdi.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/foo")
@RequestScoped
public class FooController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FooController.class);

    @Inject
    private Foo foo;

    @GET
    @Path("/get")
    public String foo() {
        LOGGER.info("Foo!");
        if (foo == null) {
            LOGGER.warn("Foo er null");
            return "Foo er null";
        } else {
            return foo.foo();
        }
    }
}
