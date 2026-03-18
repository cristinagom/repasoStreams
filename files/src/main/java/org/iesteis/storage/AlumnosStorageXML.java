package org.iesteis.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.iesteis.model.Alumno;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnosStorageXML {
    public void cargarDatos() {
        XmlMapper mapper = new XmlMapper();

        try {
            File f = new File("data/xml/alumnos.xml");
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
            XmlMapper mapper = new XmlMapper();
            File f = new File("data/xml/alumnos2.xml");
            // Creamos un Map donde la clave será la etiqueta de los hijos
            Map<String, List<Alumno>> map = new HashMap<>();
            map.put("alumno", alumnos);

            // Escribimos XML con nodo raíz <productos>
            mapper.writer().withRootName("alumnos").writeValue(f, map);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
