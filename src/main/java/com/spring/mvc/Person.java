package com.spring.mvc;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by utsabban on 7/31/14.
 */
public class Person {
    @JsonProperty("Name")
    String name;
    @JsonProperty("City")
    String city;
    @JsonProperty("MobileNo")
    String mobileNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
