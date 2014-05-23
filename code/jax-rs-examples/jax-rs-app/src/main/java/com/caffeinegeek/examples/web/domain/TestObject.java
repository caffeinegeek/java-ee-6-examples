package com.caffeinegeek.examples.web.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestObject {

    private String message;

    public TestObject() {
    }

    public TestObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
