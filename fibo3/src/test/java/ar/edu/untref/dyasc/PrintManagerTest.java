package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintManagerTest {
    @Test
    public void imprimirCabeceraDeSecuenciaString(){
        Fibonacci fibo = new Fibonacci();
        PrintManager printer = new PrintManager(fibo);
        String output_printer = printer.print();

        assertEquals("fibo<0>" , output_printer);

    }
}
