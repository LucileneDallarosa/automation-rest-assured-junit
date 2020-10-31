package com.interzoid.api.utils;

public class License {

    private static final String BASE_LICENSE = "baseLicense";

    private License() {
        throw new IllegalStateException("Utility class");
    }

    public static String getLicense() {

        return (null == System.getProperty(BASE_LICENSE) || System.getProperty(BASE_LICENSE).equals("")) ?
                PropertiesReader.getValueFromUrlFile(BASE_LICENSE) :
                System.getProperty(BASE_LICENSE);

    }
}