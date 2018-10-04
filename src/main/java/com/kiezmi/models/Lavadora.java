package com.kiezmi.models;

import com.kiezmi.models.Electrodomestico;

public class Lavadora extends Electrodomestico {

    //Variables
    int carga;

    //Constructores
    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(int precioBase, int carga) {

    }

    public Lavadora(double precioBase, double peso, Colores color, ConsumoElectronico miconsumo, int carga) {

    }

    //Geters & Seters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}