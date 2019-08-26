package ar.edu.untref.dyasc;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> fibonacci_numbers = new ArrayList<Integer>();
        int number;
        if (args.length == 1)
        {
            number = Integer.parseInt(args[0]);
            System.out.printf("fibo<%s>: " , number);
            generateFibonacciSequence(number , fibonacci_numbers);
            printFibonacciSequence(fibonacci_numbers);
            System.out.println("");

        }
        else
            System.out.println("Se debe ingresar solo un argumento.");

    }

    public static void generateFibonacciSequence(int n , ArrayList<Integer> numbers){
        Integer fib = 1, prevFib = 1, result=0;
        if (n > 2){
            numbers.add(result);
            numbers.add(fib);
            for(int i=0; i<n-2; i++) {
                    numbers.add(fib);
                    int temp = fib;
                    fib+= prevFib;
                    prevFib = temp;
                }
            }
        if( n == 2) {
            numbers.add(result);
            numbers.add(fib);
        }
        if( n == 1) {
            numbers.add(result);
        }
    }

    public static void printFibonacciSequence(ArrayList<Integer> list){
        for (Integer element : list) {
            System.out.print(element.toString() + " ");
        }
    }

}
