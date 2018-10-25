package com.kiezmi.controllers;


import com.kiezmi.models.Electrodomestico;
import com.kiezmi.models.Lavadora;
import com.kiezmi.models.Televisor;

import java.util.ArrayList;

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

    public static Electrodomestico[] crearArrayElectrodomesticos(){

        Electrodomestico[] electrodomesticos= new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(100, 20, "rojo",'A');
        electrodomesticos[2] = new Electrodomestico(100, 20, "rojo",'A');
        electrodomesticos[3] = new Electrodomestico(100, 20, "rojo",'A');
        electrodomesticos[4] = new Electrodomestico(100, 20, "rojo",'A');
        electrodomesticos[5] = new Lavadora(100, 20, "rojo",'A',45);
        electrodomesticos[6] = new Lavadora(100, 20, "rojo",'A',35);
        electrodomesticos[7] = new Electrodomestico(100, 20, "rojo",'A');
        electrodomesticos[8] = new Televisor(50, 5, "metal",'D',30,false);
        electrodomesticos[9] = new Televisor(50, 5, "metal",'D',30,false);

        return  electrodomesticos;
    }


}
