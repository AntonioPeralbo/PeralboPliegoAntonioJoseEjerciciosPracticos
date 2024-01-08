package com.mycompany.ejerciciosdia3y5num2;

import com.mycompany.ejerciciosdia3y5num2.models.Eventos;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EjerciciosDia3y5Num2 {

    public static void main(String[] args) {
//        Ejercicio Nº 2 - Gestor de Eventos - Individual
//
//Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:
//
//Filtra los eventos que están programados para una fecha específica.
//
//Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
//
//Encuentra el evento más próximo en el tiempo utilizando Optionals. 
//        

        List<Eventos> evento = Arrays.asList(
                new Eventos("evento1", "10/01/2024", "Reunion"),
                new Eventos("evento2", "15/01/2024", "Taller"),
                new Eventos("evento3", "15/01/2024", "Conferencia"),
                new Eventos("evento4", "10/05/2024", "Taller"),
                new Eventos("evento5", "31/12/2024", "Conferencia"));

        List<Eventos> fitrofecha = evento.stream()
                .filter(e -> e.getFecha().equals("15/01/2024"))
                .collect(Collectors.toList());
        fitrofecha.forEach(System.out::println);

        Integer contarReunion = evento.stream()
                .filter(e -> e.getCategoria().equals("Reunion"))
                .collect(Collectors.toList())
                .size();
        System.out.println("el numero de reuniones que hay son: " + contarReunion);

        Integer contarTaller = evento.stream()
                .filter(e -> e.getCategoria().equals("Taller"))
                .collect(Collectors.toList())
                .size();
        System.out.println("el numero de talleres que hay son: " + contarTaller);

        Integer contarConferencia = evento.stream()
                .filter(e -> e.getCategoria().equals("Conferencia"))
                .collect(Collectors.toList())
                .size();
        System.out.println("el numero de conferencias que hay son: " + contarConferencia);

//        Optional<Eventos> eventoProximo = evento.stream()
//                .min((e1, e2) -> String.)
//                        
                        
                
    }
}
