package org.webflux.client.objectmapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
}
