package ar.edu.untref.dyasc;

import org.junit.Test;

public class ParametersManagerTest {

    @Test
    public void analizarLargoSecuencia(){
        String[] args = {"1"};
        ParametersManager manager = new ParametersManager(args);

        manager.processParameters();
    }
}
