package com.kiezmi.models;

<<<<<<< HEAD
import com.kiezmi.controllers.MasterCtr;
=======
import com.kiezmi.control.MasterCtr;
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf

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
<<<<<<< HEAD

    }

    public Televisor(double precioBase, double peso, String color, char miconsumo, int resolucion, boolean sintonizador_TDT) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    @Override
    public double precioFinal(Electrodomestico electrodomestico) {

        double preciofinal = super.precioFinal(electrodomestico);

        if (resolucion > 40) {
            preciofinal = (preciofinal * 30) / 100;
        } else {
            preciofinal = preciofinal;
        }

        if (sintonizador_TDT == true) {
            preciofinal = preciofinal + 50;
        } else {
            preciofinal = preciofinal;
        }

        return preciofinal;
=======
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;

    }

    public Televisor(double precioBase, double peso, String color, char miconsumo, int pulgadas, boolean sintonizador_TDT) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color=MasterCtr.comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf
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
