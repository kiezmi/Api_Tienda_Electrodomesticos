package com.kiezmi.models;


import com.kiezmi.controllers.MasterCtr;

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

        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
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

    //Metodo Precio Final
    public double precioFinal(Electrodomestico electrodomestico) {
        double precioFinal = 0.0;

        switch (electrodomestico.getMiConsumo()) {
            case A:
                precioFinal = precioBase + 100;
                break;
            case B:
                precioFinal = precioBase + 85;
                break;
            case C:
                precioFinal = precioBase + 60;
                break;
            case D:
                precioFinal = precioBase + 50;
                break;
            case E:
                precioFinal = precioBase + 30;
                break;
            case F:
                precioFinal = precioBase + 10;
                break;
        }

        if (peso < 19) {
            precioFinal = precioBase + 10;
        }
        if (peso > 19 && peso < 49) {
            precioFinal = precioBase + 50;
        }
        if (peso > 49 && peso < 79) {
            precioFinal = precioBase + 80;
        }
        if (peso > 80) {
            precioFinal = precioBase + 100;
        }
        return precioFinal;
    }


    //Enums
    public enum Colores {
        BLANCO, METAL, ROJO, VERDE, AZUL
    }

    public enum ConsumoElectronico {A, B, C, D, E, F}
}
