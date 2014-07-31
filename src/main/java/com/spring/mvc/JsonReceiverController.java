package com.spring.mvc;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by utsabban on 7/31/14.
 */
@Controller
@RequestMapping("/process")
public class JsonReceiverController {
    @Autowired
    DataHolder dataHolder;

    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public String storeData(@RequestBody String personJson, ModelMap modelMap) throws IOException {
        final Person person = objectMapper.readValue(personJson, Person.class);
        dataHolder.storePerson(person.getName(), person);
        modelMap.addAttribute("value", "Stored" + personJson);
        return "DisplayMessage";
    }

    @RequestMapping(value = "/fetch/{name}")
    public @ResponseBody String searchData(@PathVariable("name") String name, ModelMap modelMap) throws IOException {
        final Person person = dataHolder.getPersonByName(name);
        final String personJson = person != null ? objectMapper.writeValueAsString(person) : "Not Found";
        modelMap.addAttribute("value", personJson);
        return personJson;
    }


}
