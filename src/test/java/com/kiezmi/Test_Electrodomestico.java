package com.kiezmi;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

import com.kiezmi.models.Electrodomestico;
import com.kiezmi.models.Lavadora;
import com.kiezmi.models.Televisor;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Unit test for simple App.
 */
public class Test_Electrodomestico {
    /**
     * Rigorous Test :-)
     */

    //Electrodomestico
    @Test
    public void itObjectisInstanceOfClass() {
        Electrodomestico subClass = new Electrodomestico();
        assertThat(subClass, instanceOf(Electrodomestico.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit2params() {
        Electrodomestico subClass = new Electrodomestico(200, 5);
        assertThat(subClass, instanceOf(Electrodomestico.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit4params() {
        Electrodomestico subClass = new Electrodomestico(200, 5, Electrodomestico.Colores.BLANCO, Electrodomestico.ConsumoElectronico.B);
        assertThat(subClass, instanceOf(Electrodomestico.class));
    }

    @Test
    public void testSetPrecioBase() {
        System.out.println("Testeo de seter Precio Base");
        double cargado = 567;
        Electrodomestico movil = new Electrodomestico();
        System.out.println(movil.getPrecioBase());
        movil.setPrecioBase(cargado);
        System.out.println(movil.getPrecioBase());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(movil.getPrecioBase(), cargado);
    }

    @Test
    public void testGetPrecioBase() {
        System.out.println("Testeo de geter Precio Base");
        Electrodomestico movil = new Electrodomestico();
        System.out.println(movil.getPrecioBase());
        double expResult = 800;
        movil.setPrecioBase(800);
        System.out.println(movil.getPrecioBase());
        double result = movil.getPrecioBase();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPeso() {
        System.out.println("Testeo de seter Peso");
        double cargado = 567;
        Electrodomestico movil = new Electrodomestico();
        System.out.println(movil.getPeso());
        movil.setPeso(cargado);
        System.out.println(movil.getPeso());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(movil.getPeso(), cargado);
    }

    @Test
    public void testGetPeso() {
        System.out.println("Testeo de geter Peso");
        Electrodomestico movil = new Electrodomestico();
        System.out.println(movil.getPeso());
        double expResult = 800;
        movil.setPeso(800);
        System.out.println(movil.getPeso());
        double result = movil.getPeso();
        assertEquals(expResult, result);
    }
    @Test
    public void getsetColor() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Electrodomestico movil = new Electrodomestico();

        //when
        movil.setColor(Electrodomestico.Colores.BLANCO);

        //then
        final Field field = movil.getClass().getDeclaredField("color");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(movil), Electrodomestico.Colores.BLANCO);
    }

    @Test
    public void getsetMiConsumo() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Electrodomestico movil = new Electrodomestico();

        //when
        movil.setMiConsumo(Electrodomestico.ConsumoElectronico.B);

        //then
        final Field field = movil.getClass().getDeclaredField("miConsumo");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(movil), Electrodomestico.ConsumoElectronico.B);
    }


    //Lavadora

    @Test
    public void itObjectisInstanceOfClassLavadora() {
        Lavadora subClass = new Lavadora();
        assertThat(subClass, instanceOf(Lavadora.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit2paramsLavadora() {
        Lavadora subClass = new Lavadora(200, 5);
        assertThat(subClass, instanceOf(Lavadora.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit5paramsLavadora() {
        Lavadora subClass = new Lavadora(200, 5, Electrodomestico.Colores.BLANCO, Electrodomestico.ConsumoElectronico.B, 5);
        assertThat(subClass, instanceOf(Lavadora.class));
    }


    @Test
    public void testSetCarga() {
        System.out.println("Testeo de seter Carga");
        int cargado = 567;
        Lavadora Whirpool = new Lavadora();
        System.out.println(Whirpool.getCarga());
        Whirpool.setCarga(cargado);
        System.out.println(Whirpool.getCarga());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(Whirpool.getCarga(), cargado);
    }

    @Test
    public void testGetCarga() {
        System.out.println("Testeo de geter Carga");
        Lavadora Whirpool = new Lavadora();
        System.out.println(Whirpool.getCarga());
        int expResult = 800;
        Whirpool.setCarga(800);
        System.out.println(Whirpool.getCarga());
        int result = Whirpool.getCarga();
        assertEquals(expResult, result);
    }


    //Televisor
    @Test
    public void itObjectisInstanceOfClassTelevisor() {
        Televisor subClass = new Televisor();
        assertThat(subClass, instanceOf(Televisor.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit2paramsTelevisor() {
        Televisor subClass = new Televisor(200, 5);
        assertThat(subClass, instanceOf(Televisor.class));
    }

    @Test
    public void itObjectisInstanceOfClasswhit5paramsTelevisor() {
        Televisor subClass = new Televisor(200, 5, Electrodomestico.Colores.BLANCO, Electrodomestico.ConsumoElectronico.B, 20, false);
        assertThat(subClass, instanceOf(Televisor.class));
    }

    @Test
    public void testSetResolucion() {
        System.out.println("Testeo de seter Resolucion");
        int resolucion = 567;
        Televisor LG = new Televisor();
        System.out.println(LG.getResolucion());
        LG.setResolucion(resolucion);
        System.out.println(LG.getResolucion());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(LG.getResolucion(), resolucion);
    }

    @Test
    public void testGetResolucion() {
        System.out.println("Testeo de geter Resolucion");
        Televisor LG = new Televisor();
        System.out.println(LG.getResolucion());
        int expResult = 800;
        LG.setResolucion(800);
        System.out.println(LG.getResolucion());
        int result = LG.getResolucion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSintonizador_TDT() {
        System.out.println("Testeo de seter TDT");
        int resolucion = 567;
        Televisor LG = new Televisor();
        System.out.println(LG.getResolucion());
        LG.setResolucion(resolucion);
        System.out.println(LG.getResolucion());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(LG.getResolucion(), resolucion);
    }

    @Test
    public void testGetSintonizador_TDT() {
        System.out.println("Testeo de geter TDT");
        Televisor LG = new Televisor();
        System.out.println(LG.isSintonizador_TDT());
        boolean expResult = true;
        LG.setSintonizador_TDT(true);
        System.out.println(LG.isSintonizador_TDT());
        boolean result = LG.isSintonizador_TDT();
        assertEquals(expResult, result);
    }


}

