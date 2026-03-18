package org.iesteis;

import org.iesteis.model.Alumno;
import org.iesteis.storage.AlumnosStorageCSV;
import org.iesteis.storage.AlumnosStorageJSON;
import org.iesteis.storage.AlumnosStorageXML;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        AlumnosStorageCSV alumnos = new AlumnosStorageCSV();
        alumnos.cargarDatos();
        List<Alumno> alumnosSimpsons = new ArrayList<>();
        alumnosSimpsons.add(new Alumno("Homer", "DAM", 40));
        alumnosSimpsons.add(new Alumno("Marge", "DAM", 40));
        alumnosSimpsons.add(new Alumno("Bart", "DAW", 9));
        alumnosSimpsons.add(new Alumno("Lisa", "DAW", 7));
        alumnos.guardarDatos(alumnosSimpsons);

        AlumnosStorageJSON alumnosJSON = new AlumnosStorageJSON();
        alumnosJSON.cargarDatos();
        alumnosJSON.guardarDatos(alumnosSimpsons);

        AlumnosStorageXML alumnosXML = new AlumnosStorageXML();
        alumnosXML.cargarDatos();
        alumnosXML.guardarDatos(alumnosSimpsons);

    }
}