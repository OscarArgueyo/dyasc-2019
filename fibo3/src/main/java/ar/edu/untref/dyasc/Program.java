package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.Fibonacci;
import ar.edu.untref.dyasc.Order;
import ar.edu.untref.dyasc.Orientation;

import java.io.IOException;

public class Program {
    static Fibonacci fibo;

    public static void main(String[] args) {
        ParametersManager parameters = new ParametersManager(args);

        String output;

        fibo = new Fibonacci();
        parameters.processParameters();
        fibo.generateSequence(parameters.getSequenceLength());
        fibo.setOrientation(parameters.getOrientation());
        fibo.setOrder(parameters.getOrder());

        PrintManager printManager = new PrintManager(fibo , parameters.hasOperationSum(),parameters.isVerticalOriented());
        if(parameters.hasSaveFileOption()){
            output = printManager.print();
            try {
                FileManager fileManager = new FileManager();
                PrintManager printFileManager = new PrintManager(fibo);
                printFileManager.addText(" guardado en "+parameters.getFilepath());
                System.out.println(printFileManager.print());
                fileManager.save(parameters.getFilepath(), output);
            }catch (IOException io){
                System.out.println(io.toString());
            }
        }else{
            printManager.printToConsole();
        }




    }


}
