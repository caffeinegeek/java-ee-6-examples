package com.caffeinegeek.examples.cdi;

public interface Paths {

    String API_ROOT = "/api";
    String PING = "/ping";

    String PERSONALIA = "/personalia";
    String PERSONALIA_HENT_PERSONALIA = "/hentPersonalia/{fnr}";
    String PERSONALIA_FINN_PERSONER = "/finnPersoner";

    String FNR_PARAM = "fnr";
}
