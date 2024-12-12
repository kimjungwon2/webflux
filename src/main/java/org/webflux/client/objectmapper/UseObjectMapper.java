package org.webflux.client.objectmapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class UseObjectMapper {
    public void jsonToObject(){
        String json = "{\"name\":\"John\", \"age\":30}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            User user = objectMapper.readValue(json, User.class);

            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public void ObjectToJson() throws JsonProcessingException {
        User user = new User("garden", 32);
        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
    }

    public void JsonToMap(){
        String json = "{\"name\":\"John\", \"age\":\"30\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = null;
        try {
            map = objectMapper.readValue(json, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Map: " + map);
    }
}
