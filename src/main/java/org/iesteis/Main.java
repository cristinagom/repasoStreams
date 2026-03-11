package org.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void pruebas() {

        List<Integer> list = Arrays.asList(10, 2, 31, 54, 27, 9, 1);
        //System.out.println(list.stream().filter(i -> i % 2 == 0).mapToDouble(Integer::doubleValue).sum());

        List<String> list2 = Arrays.asList("hola", "dam", "IES de Teis", "DAW", "ciaoo!");
        //System.out.println(list2.stream().map(String::toUpperCase).filter(i -> i.startsWith("D")).toList());
        //System.out.println(list2.stream().filter(i -> i.matches("^[Dd].*$")).toList());

        System.out.println(list2.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).toList());

        Map<String, List<Integer>> map = list.stream().collect(Collectors.
                groupingBy(i -> i % 2 == 0 ? "PAR" : "IMPAR"));
        System.out.println(map);
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Maria", "DAM2", 20));
        alumnos.add(new Alumno("Antón", "DAM2", 19));
        alumnos.add(new Alumno("Laura", "DAW2", 20));
        alumnos.add(new Alumno("Breixo", "Ciber", false, 23));
        Map<String, List<String>> map2 =
                alumnos.stream().collect
                (Collectors.groupingBy(Alumno::getCurso, Collectors.mapping(Alumno::getNombre, Collectors.toList())));
        System.out.println(map2);

        Map<String, List<Alumno>> map3 =
                alumnos.stream()
                        .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println(map3);

        Map<String, List<Alumno>> map4 =
                alumnos.stream()
                        .filter(alumno -> alumno.isMatriculado()).
                        collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println(map4);

        Map<String, Double> map5 =
                alumnos.stream()
                        .collect(Collectors.groupingBy(Alumno::getCurso, Collectors.averagingDouble(Alumno::getEdad)));
        System.out.println(map5);
        System.out.println(alumnos.stream().mapToDouble(Alumno::getEdad).average().getAsDouble());
        System.out.println(alumnos.stream().collect(Collectors.averagingDouble(Alumno::getEdad)));

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        AlumnosStorage alumnos = new AlumnosStorage();
        alumnos.cargarDatosCSV();
    }
}