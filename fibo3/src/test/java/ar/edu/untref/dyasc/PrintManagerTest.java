package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintManagerTest {
    @Test
    public void imprimirCabeceraDeSecuenciaString(){
        Fibonacci fibo = new Fibonacci();
        PrintManager printer = new PrintManager(fibo);
        printer.addHeader(fibo.getSequenceLength());
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
}
