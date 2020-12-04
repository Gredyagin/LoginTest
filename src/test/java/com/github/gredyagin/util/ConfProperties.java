package com.github.gredyagin.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfProperties {

    private Properties properties;

    public ConfProperties() {
        try (final InputStream in = this.getClass().getClassLoader().getResourceAsStream("conf.properties")) {
            properties = new Properties();
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
