package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParametersManagerTest {

    @Test
    public void analizarLargoSecuencia(){
        String[] args = {"1"};
        int sequenceLength = 1;
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();

        assertEquals(manager.getSequenceLength() , sequenceLength);
    }

    @Test
    public void analizarSinLargoSecuencia(){
        String[] args = {"-o=hd"};
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();

        assertFalse(manager.isValid());
    }

    @Test
    public void analizarParametrosdeImpresionDirecta(){
        String[] args = {"2" , "-o=hd"};
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();
        assertTrue(manager.isDirectOrder());
    }

    @Test
    public void analizarParametrosdeImpresionInversa(){
        String[] args = {"2" , "-o=hi"};
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();
        assertTrue(manager.isInverseOrder());
    }

    @Test
    public void analizarParametrosdeImpresionHorizontal(){
        String[] args = {"2" , "-o=hi"};
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();
        assertTrue(manager.isHorizontalOriented());
    }

    @Test
    public void analizarParametrosdeImpresionVertical(){
        String[] args = {"2" , "-o=vi"};
        ParametersManager manager = new ParametersManager(args);
        manager.processParameters();
        assertFalse(manager.isHorizontalOriented());
        assertTrue(manager.isVerticalOriented());
    }


}
