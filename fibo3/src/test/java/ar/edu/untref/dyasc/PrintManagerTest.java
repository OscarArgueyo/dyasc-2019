package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintManagerTest {
    @Test
    public void imprimirSecuenciaEnString(){
        Fibonacci fibo = new Fibonacci();
        PrintManager printer = new PrintManager(fibo);
        String output_printer = printer.getOutputPrinter();

        assertEquals("" , output_printer);

    }
}
