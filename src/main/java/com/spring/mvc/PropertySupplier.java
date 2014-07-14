package com.spring.mvc;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Properties;

@Component
public class PropertySupplier {
    @Resource(name="SpringMVCProperties")
    private Properties properties;

    public String getUserName() {
        return properties.getProperty("user.name");
    }

    public String getUserPassword() {
        return properties.getProperty("user.password");
    }
}
