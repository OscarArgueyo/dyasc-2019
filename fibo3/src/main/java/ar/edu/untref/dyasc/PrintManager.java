package ar.edu.untref.dyasc;

import java.util.Collections;

public class PrintManager {

    private Fibonacci fibonacci;
    private StringBuilder output_print;

    PrintManager(Fibonacci fibonacci){
        this.setFibonacci(fibonacci);
    }

    public void setFibonacci(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    public Fibonacci getFibonacci() {
        return fibonacci;
    }

    public void printSequence(){
        this.output_print = new StringBuilder();
        if (this.getFibonacci().order == Order.INVERSE){
            Collections.reverse(this.getFibonacci().numbers);
        }

        if(this.getFibonacci().orientation == Orientation.VERTICAL){
            System.out.println("");
        }

        for (Integer element : this.getFibonacci().numbers) {
            if(this.getFibonacci().orientation == Orientation.VERTICAL){
                System.out.println(element.toString());
            }else{
                System.out.print(element.toString() + " ");
            }
        }

    }

    public String getOutputPrinter() {
        return "";
    }
}
