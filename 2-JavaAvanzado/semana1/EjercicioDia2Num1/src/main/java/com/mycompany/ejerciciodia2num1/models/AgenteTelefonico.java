package com.mycompany.ejerciciodia2num1.models;

public class AgenteTelefonico implements Runnable {
    
    Llamadas llamada = new Llamadas();
String name;

    public AgenteTelefonico(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 

    @Override
    public void run() {
        llamada.descolgarLlamada();
        llamada.resolverConsulta();
        llamada.colgarLlamada();
    }

}
