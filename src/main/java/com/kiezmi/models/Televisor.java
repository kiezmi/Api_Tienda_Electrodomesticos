package com.kiezmi.models;

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
    public Televisor(double precioBase, double peso, Colores color, ConsumoElectronico miconsumo,int pulgadas, boolean sintonizador_TDT) {

    }

    //Geters & Seters
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int pulgadas) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
}
