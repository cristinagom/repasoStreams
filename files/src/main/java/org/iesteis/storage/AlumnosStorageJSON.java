package org.iesteis.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesteis.model.Alumno;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AlumnosStorageJSON {

    public void cargarDatos() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File f = new File("data/json/alumnos.json");
            if (!f.exists()) { throw new RuntimeException("No existe el archivo");}
            List<Alumno> alumnos = mapper.readValue(f,
                    new TypeReference<List<Alumno>>() {});
            alumnos.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void guardarDatos(List<Alumno> alumnos) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File f = new File("data/json/alumnos2.json");
            mapper.writeValue(f,alumnos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
