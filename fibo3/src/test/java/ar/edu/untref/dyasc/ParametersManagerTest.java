package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParametersManagerTest {

    @Test
    public void analizarLargoSecuencia(){
        String[] args = {"1"};
        int sequenceLength = 1;
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();

        assertEquals(manager.getSequenceLength() , sequenceLength);
    }
}
