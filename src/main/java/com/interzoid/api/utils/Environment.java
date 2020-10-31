package com.interzoid.api.utils;

public class Environment {

    private static final String BASE_ENV = "env";

    private Environment() {
        throw new IllegalStateException("Utility class");
    }

    public static String getEnv() {

        return (null == System.getProperty(BASE_ENV) || System.getProperty(BASE_ENV).equals("")) ?
                PropertiesReader.getValueFromConfig(BASE_ENV) :
                System.getProperty(BASE_ENV);

    }
}