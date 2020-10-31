package com.interzoid.api.utils;

public class Urls {

    private Urls() {
    }

    public static String get(String id) {
        return PropertiesReader.getValueFromUrlFile(id);
    }
}
