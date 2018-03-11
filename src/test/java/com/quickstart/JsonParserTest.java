package com.quickstart;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quickstart.dao.Item;

import junit.framework.TestCase;

public class JsonParserTest extends TestCase {

    public void testConvertToJson() throws Exception {
        Item item = new Item("blackberry", 200.0f, 100, "test");
        String result  = JsonParser.convertToJson(item);

        ObjectMapper objectMapper = new ObjectMapper();
        Item resultItem = objectMapper.readValue(result, Item.class);

        assertEquals(resultItem.getDescription(), "test");
        assertEquals(resultItem.getkCalPer100g(), new Integer(100));
        assertEquals(resultItem.getTitle(), "blackberry");
        assertEquals(resultItem.getUnitPrice(), 200.0f);
    }
}
