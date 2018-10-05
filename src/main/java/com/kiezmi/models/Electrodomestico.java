package com.kiezmi.models;

import com.kiezmi.control.MasterCtr;

public class Electrodomestico {

    //Variables
    protected double precioBase;
    protected double peso;
    protected Colores color;
    protected ConsumoElectronico miConsumo;

    //Constructores
    public Electrodomestico() {
        this.precioBase = 200;
        this.peso = 5;
        this.color = Colores.BLANCO;
        this.miConsumo = ConsumoElectronico.B;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.color = Colores.BLANCO;
        this.miConsumo = ConsumoElectronico.B;
    }

    public Electrodomestico(double precioBase, double peso, String color, char miconsumo) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color=MasterCtr.comprobarColor(color);

    }

    //metodos get and set
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public ConsumoElectronico getMiConsumo() {
        return miConsumo;
    }

    public void setMiConsumo(ConsumoElectronico miConsumo) {
        this.miConsumo = miConsumo;
    }

    //Enums
    public enum Colores {BLANCO, METAL, ROJO, VERDE, AZUL}

    public enum ConsumoElectronico {A, B, C, D, E, F}

}
