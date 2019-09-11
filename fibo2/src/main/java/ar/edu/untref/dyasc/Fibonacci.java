package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.Orientation;
import ar.edu.untref.dyasc.Order;
import java.util.ArrayList;
import java.util.Collections;


public class Fibonacci
{
    ArrayList<Integer> numbers;
    Orientation orientation;
    Order order;

    public Fibonacci(){
        this.numbers = new ArrayList<Integer>();
        this.orientation = Orientation.HORIZONTAL;
        this.order = Order.DIRECT;
    }

    public void generateSequence(int n){
        Integer fib = 1, prevFib = 1, result=0;
        if (n > 2){
            this.numbers.add(result);
            this.numbers.add(fib);
            for(int i=0; i<n-2; i++) {
                this.numbers.add(fib);
                int temp = fib;
                fib+= prevFib;
                prevFib = temp;
            }
        }
        if( n == 2) {
            this.numbers.add(result);
            this.numbers.add(fib);
        }
        if( n == 1) {
            this.numbers.add(result);
        }
    }

    public void printSequence(){

        if (this.order == Order.INVERSE){
            Collections.reverse(this.numbers);
        }

        if(this.orientation == Orientation.VERTICAL){
            System.out.println("");
        }

        for (Integer element : this.numbers) {
            if(this.orientation == Orientation.VERTICAL){
                System.out.println(element.toString());
            }else{
                System.out.print(element.toString() + " ");
            }
        }

    }

    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }

    public void setOrder(Order order){
        this.order = order;
    }
}