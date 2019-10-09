package ar.edu.untref.dyasc;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FileManagerTest {

    @Test
    public void guardarArchivoTest(){
        Fibonacci fibo = new Fibonacci();
        String filepath = "fibo.txt";
        PrintManager printer = new PrintManager(fibo);
        PrintManager filecontent = new PrintManager(fibo);
        FileManager fileManager = new FileManager();
        try {
            fileManager.save(filepath , printer.print());
        }catch (IOException ex){
            ex.printStackTrace();
        }

        filecontent.addText(" guardado en "+filepath);

        assertEquals("fibo<0> guardado en fibo.txt" , filecontent.print());
    }

    @Test
    public void guardarArchivoSumatoriaTest(){
        Fibonacci fibo = new Fibonacci();
        String filepath = "fibo.txt";

        fibo.generateSequence(5);
        boolean sumatory_form = true;
        PrintManager printer = new PrintManager(fibo);
        PrintManager filecontent = new PrintManager(fibo , sumatory_form);

        FileManager fileManager = new FileManager();
        try {
            fileManager.save(filepath ,filecontent.print());
            printer.addText(" guardado en "+filepath);

        }catch (IOException ex){
            ex.printStackTrace();
        }
        assertEquals("fibo<5> guardado en fibo.txt" , printer.print());


    }

}
