package com.interzoid.api.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesReader {

    private static final Logger LOGGER = LogManager.getLogger(PropertiesReader.class);

    private PropertiesReader() {
    }

    public static String getValueFromUrlFile(String property) {
        return getValue("environment" + System.getProperty("file.separator") + Environment.getEnv() + System.getProperty("file.separator") + "urls.properties", property);
    }

    public static String getValueFromConfig(String property) {
        return getValue("config.properties", property);
    }

    private static String getValue(String file, String property) {

        Properties properties;

        try {
            properties = new Properties();

            Path configPath = Paths.get(file);
            ClassLoader classloader = PropertiesReader.class.getClassLoader();
            properties.load(classloader.getResourceAsStream(configPath.toString()));

            return properties.getProperty(property);
        } catch (NullPointerException | IOException e) {
            LOGGER.error("Error on load properties: %s", property);
        }
        return null;
    }
}