package com.kiezmi.models;

public class Televisor extends Electrodomestico {

    //Variables
    int pulgadas;
    boolean sintonizador_TDT;

    //Constructores
    public Televisor() {
       this.pulgadas = 20;
       this.sintonizador_TDT = false;
    }
    public Televisor(double precioBase, double peso) {
    }
    public Televisor(double precioBase, double peso, Colores color, ConsumoElectronico miconsumo,int pulgadas, boolean sintonizador_TDT) {

    }

    //Geters & Seters
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
}
