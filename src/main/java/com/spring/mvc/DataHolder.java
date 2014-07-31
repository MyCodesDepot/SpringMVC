package com.spring.mvc;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by utsabban on 7/31/14.
 */
@Repository
public class DataHolder {
    private Map<String, Person> map = new HashMap<>();
    public void storePerson(String key, Person person) {
        map.put(key, person);
    }

    public Person getPersonByName(String name) {
        return map.containsKey(name) ? map.get(name) : null;
    }


}
