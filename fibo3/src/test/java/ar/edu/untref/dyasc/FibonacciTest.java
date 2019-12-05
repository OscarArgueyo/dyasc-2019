package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.junit.Assert.*;


public class FibonacciTest {

    @Test
    public void sumatoriaDeSecuencia(){
        Fibonacci fibo = new Fibonacci();
        fibo.generateSequence(4);
        int sum = fibo.sumSequence();
        assertEquals(2, sum);
    }

    @Test
    public void sumatoriaDeSecuenciaSinGenerarla(){
        Fibonacci fibo = new Fibonacci();
        int sum = fibo.sumSequence();
        assertEquals(0, sum);
    }
}
