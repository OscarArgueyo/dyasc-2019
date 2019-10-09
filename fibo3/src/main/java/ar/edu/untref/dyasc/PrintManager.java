package ar.edu.untref.dyasc;

import java.util.Collections;

public class PrintManager implements Printable {

    private Fibonacci fibonacci;

    private StringBuilder output_print;

    PrintManager(Fibonacci fibonacci){

        this.setFibonacci(fibonacci);

        this.output_print = new StringBuilder();
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

    public StringBuilder getOutputPrint() {
        return this.output_print;
    }

    @Override
    public String print() {
        this.addHeader(this.getFibonacci().getSequenceLength());
        return this.getOutputPrint().toString();

    }

    @Override
    public void printToConsole() {
        System.out.print(this.print());
    }

    public void addHeader(int length_sequence) {
        this.getOutputPrint()
                .append(
                    "fibo<".concat(
                            String.valueOf(length_sequence)
                    ).concat(">")
        );

    }
}
