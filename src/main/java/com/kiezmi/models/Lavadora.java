package com.kiezmi.models;

<<<<<<< HEAD
import com.kiezmi.controllers.MasterCtr;
=======
import com.kiezmi.control.MasterCtr;
import com.kiezmi.models.Electrodomestico;
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf

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
<<<<<<< HEAD
        this.precioBase = precioBase;
=======
>>>>>>> cf5b76bad5c7b290434ef22e5a7af3ae0bcf04cf
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso, String color, char miconsumo, int carga) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
    }

    //Geters & Seters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}