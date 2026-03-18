package org.iesteis.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesteis.modelo.Fruit;

import java.net.URL;
import java.util.List;

public class FruitsStorage {
    public void cargarDatos() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL jsonURL = new URL("https://fruityvice.com/api/fruit/all");
            List<Fruit> list = mapper.readValue(jsonURL, new TypeReference<List<Fruit>>() {
            });
            list.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
