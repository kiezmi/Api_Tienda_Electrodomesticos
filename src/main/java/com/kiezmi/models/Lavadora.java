package com.kiezmi.models;


import com.kiezmi.controllers.MasterCtr;


public class Lavadora extends Electrodomestico {

    //Variables
    int carga;

    //Constructores
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, int carga) {
        super();
        this.precioBase = precioBase;
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso, String color, char miconsumo, int carga) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
    }

    @Override
    public double precioFinal(Electrodomestico electrodomestico) {

        double preciofinal = super.precioFinal(electrodomestico);

        if (carga > 30) {
            preciofinal = preciofinal + 50;
        } else {
            preciofinal = preciofinal;
        }
        return preciofinal;
    }

    //Geters & Seters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}