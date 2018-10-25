package com.kiezmi.controllers;

import com.kiezmi.models.Electrodomestico;
import com.kiezmi.models.Lavadora;
import com.kiezmi.models.Televisor;

import java.util.ArrayList;
import java.util.List;

public class MasterCtr {

    public static Electrodomestico.ConsumoElectronico comprobarConsumoEnergetico(char letra) {
        String consumos = "ABCDEF";
        if (!(consumos.contains(String.valueOf(letra)))) {
            return Electrodomestico.ConsumoElectronico.B;
        } else {
            return Electrodomestico.ConsumoElectronico.valueOf(Character.toString(letra));
        }
    }

    public static Electrodomestico.Colores comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("BLANCO");
        colores.add("METAL");
        colores.add("ROJO");
        colores.add("VERDE");
        colores.add("AZUL");

        if (!(colores.contains(color))) {
            return Electrodomestico.Colores.BLANCO;
        }
        return Electrodomestico.Colores.valueOf(color);
    }

    public static Electrodomestico[] crearArrayElectrodomesticos() {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(100, 20, "ROJO", 'A');
        electrodomesticos[2] = new Electrodomestico(200, 30, "VERDE", 'B');
        electrodomesticos[3] = new Lavadora(100, 20, "ROJO", 'F', 35);
        electrodomesticos[4] = new Electrodomestico(400, 50, "METAL", 'D');
        electrodomesticos[5] = new Lavadora(100, 20, "AZUL", 'E', 45);
        electrodomesticos[6] = new Electrodomestico(300, 40, "BLANCO", 'C');
        electrodomesticos[7] = new Televisor(50, 5, "METAL", 'A', 30, false);
        electrodomesticos[8] = new Electrodomestico(100, 20, "ROJO", 'G');
        electrodomesticos[9] = new Televisor(50, 5, "VERDE", 'C', 30, true);

        return electrodomesticos;
    }
    public static Electrodomestico calcularPrecios(Electrodomestico electrodomesticos){
    double precios;

        for(int i = 0;i<10;i++){



        }
        return precios;
    }

}
