package com.mycompany.ejerciciosdia6num1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventarioAutos<T extends Autos> {

    private List<T> inventarioAuto;

    public InventarioAutos() {
        this.inventarioAuto = new ArrayList<>();
    }

    public void agregarAuto(T auto) {

        this.inventarioAuto.add(auto);
    }

    public void buscarAuto(String marca) {
        List<T> filtroAuto = inventarioAuto.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
        filtroAuto.forEach(System.out::println);

    }

    public double totalInventario() {
        return inventarioAuto.stream().
                mapToDouble(T::getPrecio).sum();

    }
}
