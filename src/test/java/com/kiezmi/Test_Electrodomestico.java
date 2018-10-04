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
    public void getsetPrecioBase() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Electrodomestico movil = new Electrodomestico();

        //when
        movil.setPrecioBase(200);

        //then
        final Field field = movil.getClass().getDeclaredField("precioBase");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(movil), 200.0);
    }

    @Test
    public void getsetPeso() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Electrodomestico movil = new Electrodomestico();

        //when
        movil.setPeso(5);
        //then
        final Field field = movil.getClass().getDeclaredField("peso");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(movil), 5.0);
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
    public void getsetCarga() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Lavadora Whirpool = new Lavadora();

        //when
        Whirpool.setCarga(5);

        //then
        final Field field = Whirpool.getClass().getDeclaredField("carga");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(Whirpool), 5);
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

    /* @Test
     public void getsetResolucion() throws NoSuchFieldException, IllegalAccessException {
         //given
         System.out.println("Testeo de geter y seter Resolucion");
         final Televisor LG = new Televisor();

         //when
         LG.setResolucion(20);

         //then
         final Field field = LG.getClass().getDeclaredField("resolucion");
         field.setAccessible(true);
         assertEquals("Fields didn't match", field.get(LG), 20);
     }
     */
    @Test
    public void getsetsintonizador_TDT() throws NoSuchFieldException, IllegalAccessException {
        //given
        System.out.println("Testeo de ");
        final Televisor LG = new Televisor();

        //when
        LG.setSintonizador_TDT(true);

        //then
        final Field field = LG.getClass().getDeclaredField("sintonizador_TDT");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(LG), true);
    }

   /* @Test
    public void testSetResolucion() {
        System.out.println("Testeo de seter");
        int resolucion = 567;
        Televisor LG = new Televisor();
        LG.setResolucion(resolucion);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(LG.getResolucion(), resolucion);
    }*/
/*
    @Test
    public void testGetResolucion() {
        System.out.println("Testeo de geter");
        Televisor LG = new Televisor();
        System.out.println(LG.getResolucion());
        int expResult = 800;
        LG.setResolucion(800);
        System.out.println(LG.getResolucion());
        int result = LG.getResolucion();
        assertEquals(expResult, result);
    }
*//*
    @Test
    public void shouldSetResolucion() {
        System.out.println("Testeo de seter");
        Televisor gadget = new Televisor();
        gadget.setResolucion(300);
        System.out.println(gadget.getResolucion());
        assertEquals(300, gadget.getResolucion());
    }
    *//*
   @Test
   public void testGetResolucion()
   {
       Televisor gadget = new Televisor(200,5, Electrodomestico.Colores.BLANCO, Electrodomestico.ConsumoElectronico.B,200,false);
       int moco = gadget.getResolucion();
       assertEquals(200, moco);
   }*/

}

