package org.webflux.client.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class UseObjectMapperTest {

    @Test
    void jsonToObject() {
        UseObjectMapper useObjectMapper = new UseObjectMapper();

        useObjectMapper.jsonToObject();
    }

    @Test
    void ObjectToJson() throws JsonProcessingException {
        UseObjectMapper useObjectMapper = new UseObjectMapper();

        useObjectMapper.ObjectToJson();
    }
}