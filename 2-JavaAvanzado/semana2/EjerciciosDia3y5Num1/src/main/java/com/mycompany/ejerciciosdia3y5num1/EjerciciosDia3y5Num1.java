package com.mycompany.ejerciciosdia3y5num1;

import com.mycompany.ejerciciosdia3y5num1.models.Empleados;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EjerciciosDia3y5Num1 {
    
//    Ejercicio Nº 1 - Empleados - Individual
//
//Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:
//
//Filtra los empleados cuyo salario sea mayor a cierto valor específico.
//
//Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
//
//Encuentra al empleado con el salario más alto utilizando Optionals.

    public static void main(String[] args) {

        List<Empleados> empleados = Arrays.asList(
                new Empleados("Raul", 28000.00, "Analista"),
                new Empleados("Pedro", 35000.00, "Analista"),
                new Empleados("Pedro", 70000.00, "Gerente"),
                new Empleados("Pedro", 25000.00, "Desarrollador"),
                new Empleados("Pedro", 23000.00, "Desarrolador"),
                new Empleados("Pedro", 20000.00, "Desarrolador"));

        List<Empleados> filtroSalario = empleados.stream()
                .filter(e -> e.getSalario() >= 30000)
                .collect(Collectors.toList());
        filtroSalario.forEach(System.out::println);
        
        
        Double salarioCategoriaAnalista = empleados.stream()
                .filter(e -> e.getCategoria().equals("Analista"))
                .mapToDouble(e -> e.getSalario())
                .average()
                .orElse(0.0);
        System.out.println("Salario promedio de analista es: " +salarioCategoriaAnalista);
        
        Double salarioCategoriaGerente = empleados.stream()
                .filter(e -> e.getCategoria().equals("Gerente"))
                .mapToDouble(e -> e.getSalario())
                .average()
                .orElse(0.0);
        System.out.println("Salario promedio de gerente es: " +salarioCategoriaGerente);
        Double salarioCategoriaDesarrollador = empleados.stream()
                .filter(e -> e.getCategoria().equals("Desarrolador"))
                .mapToDouble(e -> e.getSalario())
                .average()
                .orElse(0.0);
        System.out.println("Salario promedio de desarrolladores es: " +salarioCategoriaDesarrollador);
        
        
        Optional<Empleados> salarioMax = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        
        System.out.println(salarioMax);

    }
}
