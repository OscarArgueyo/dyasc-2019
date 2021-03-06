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


    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public int sumSequence() {
        int sum = 0;
        for (int number:this.numbers) sum += number;

        return sum;
    }

    public int getSequenceLength(){
        return this.numbers.size();
    }

    public ArrayList<Integer> getSequenceList(){

        if (this.order == Order.INVERSE){
            Collections.reverse(this.numbers);
        }

        return this.numbers;

    }
}