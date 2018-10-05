package com.kiezmi.models;

import com.kiezmi.controllers.MasterCtr;

public class Televisor extends Electrodomestico {

    //Variables
    int resolucion;
    boolean sintonizador_TDT;

    //Constructores
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizador_TDT = false;
    }

    public Televisor(double precioBase, double peso) {
        super();

    }

    public Televisor(double precioBase, double peso, String color, char miconsumo, int pulgadas, boolean sintonizador_TDT) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    //Geters & Seters
    public int getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(int pulgadas) {
        this.resolucion = pulgadas;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
}
