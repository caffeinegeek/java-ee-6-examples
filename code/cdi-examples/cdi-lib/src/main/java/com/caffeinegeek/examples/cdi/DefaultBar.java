package com.caffeinegeek.examples.cdi;

public class DefaultBar implements Bar {

    @Override
    public String bar() {
        throw new RuntimeException("No implementation exists");
    }
}
