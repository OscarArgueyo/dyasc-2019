package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintManagerTest {
    @Test
    public void imprimirCabeceraDeSecuenciaString(){
        Fibonacci fibo = new Fibonacci();
        PrintManager printer = new PrintManager(fibo);
        StringBuilder output_printer = printer.getOutputPrint();

        assertEquals("fibo<0>" , output_printer.toString());
    }

    @Test
    public void imprimirSecuenciaEnFormaDeSumatoria(){

        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(5);
        boolean sumatory_form = true;
        PrintManager printer = new PrintManager(fibo, sumatory_form);

        assertEquals("fibo<5>s: 7" , printer.print());

    }

    @Test
    public void imprimirSecuenciaEnFormaDeListaHorizontalDirecta(){

        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(5);
        fibo.setOrder(Order.DIRECT);
        fibo.setOrientation(Orientation.HORIZONTAL);
        boolean sumatory_form = false;
        PrintManager printer = new PrintManager(fibo, sumatory_form , false);

        assertEquals(
                "fibo<5>: 0 1 1 2 3" , printer.print());

    }

    @Test
    public void imprimirSecuenciaEnFormaDeListaHorizontalInversa(){

        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(5);
        fibo.setOrder(Order.INVERSE);
        fibo.setOrientation(Orientation.HORIZONTAL);
        boolean sumatory_form = false;
        PrintManager printer = new PrintManager(fibo, sumatory_form , false);

        assertEquals(
                "fibo<5>: 3 2 1 1 0" , printer.print());

    }
}
