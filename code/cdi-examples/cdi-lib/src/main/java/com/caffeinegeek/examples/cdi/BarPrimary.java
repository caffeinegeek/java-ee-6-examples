package com.caffeinegeek.examples.cdi;

import com.caffeinegeek.examples.cdi.qualifiers.Primary;

@Primary
public class BarPrimary implements Bar {

    @Override
    public String bar() {
        return "Bar primary!";
    }
}
