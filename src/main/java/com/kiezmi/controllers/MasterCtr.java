package com.kiezmi.controllers;


import com.kiezmi.models.Electrodomestico;
import com.kiezmi.models.Lavadora;
import com.kiezmi.models.Televisor;

import java.util.ArrayList;

public class MasterCtr {
    //Electrodomestico portatil = new Electrodomestico();
    //Lavadora Whirllpoll = new Lavadora();
    //git pushTelevisor LG = new Televisor();

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


    public static double precioFinal(int a, int b, int c) {
        return a + b + c;
    }

}
