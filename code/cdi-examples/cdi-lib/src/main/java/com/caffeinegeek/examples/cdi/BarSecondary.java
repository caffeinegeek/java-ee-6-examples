package com.caffeinegeek.examples.cdi;


import com.caffeinegeek.examples.cdi.qualifiers.Secondary;

@Secondary
public class BarSecondary implements Bar {

    @Override
    public String bar() {
        return "Bar secondary!";
    }
}
