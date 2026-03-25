package org.iesteis.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesteis.models.Response;

import java.net.URL;
import java.util.List;

public class CharacterStorage {
    public void cargarDatos() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL jsonURL = new URL("https://dragonball-api.com/api/characters?limit=58");
            Response r = mapper.readValue(jsonURL, Response.class);
            r.getItems().forEach(System.out::println);
            System.out.println(r.getItems().stream().count());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}