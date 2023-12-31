
package com.mycompany.ejerciciodia2num1.models;


public class Llamadas {

    public Llamadas() {
    }
    
    
       public void descolgarLlamada() {
        System.out.println(" El agente " + Thread.currentThread().getName() + " descuelga la llamada" );

    }

    public void resolverConsulta() {
        System.out.println("El agente " + Thread.currentThread().getName() + " resuelve la consulta");
    }

    public void colgarLlamada() {
        System.out.println("El agente " + Thread.currentThread().getName() +" Cuelga la llamada");
    }
    
}
