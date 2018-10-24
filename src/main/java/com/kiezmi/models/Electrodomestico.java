package com.kiezmi.models;

<<<<<<< HEAD
import com.kiezmi.controllers.MasterCtr;

=======
import com.kiezmi.control.MasterCtr;
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf

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
<<<<<<< HEAD
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
=======
        this.precioBase=precioBase;
        this.peso=peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color=MasterCtr.comprobarColor(color);
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf

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

        switch (electrodomestico.getMiConsumo()) {
            case A:
                precioBase += 100;
                break;
            case B:
                precioBase += 85;
                break;
            case C:
                precioBase += 60;
                break;
            case D:
                precioBase += 50;
                break;
            case E:
                precioBase += 30;
                break;
            case F:
                precioBase += 10;
                break;

        }

        if (peso < 19) {
            precioBase += 10;
        }
        if (peso > 19 && peso < 49) {
            precioBase += 50;
        }
        if (peso > 49 && peso < 79) {
            precioBase += 80;
        }
        if (peso > 80) {
            precioBase += 100;
        }

        return precioBase;
    }

<<<<<<< HEAD

    //Enums
    public enum Colores {
        BLANCO, METAL, ROJO, VERDE, AZUL
    }

    public enum ConsumoElectronico {A, B, C, D, E, F}
=======
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf
}
