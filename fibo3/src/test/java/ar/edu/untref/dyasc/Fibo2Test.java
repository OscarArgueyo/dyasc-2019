package ar.edu.untref.dyasc;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Fibo2Test {


    private java.util.ArrayList<Integer> lista;

    @Test
    public void testSecuenciaVacia() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(0);
        assertEquals(fibo.numbers.size() , lista.size());
        
    }

    @Test
    public void testSecuencia5Elementos() {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(0,1,1,2,3));
        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(5);
        assertEquals(fibo.numbers, lista);
    }

}
