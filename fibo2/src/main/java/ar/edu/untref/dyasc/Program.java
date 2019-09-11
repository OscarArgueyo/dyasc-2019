package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.Fibonacci;
import ar.edu.untref.dyasc.Order;
import ar.edu.untref.dyasc.Orientation;

public class Program {
    static Fibonacci fibo;

    public static void main(String[] args) {
        fibo = new Fibonacci();
        int number;

        /**
         * Caso con dos parametros
         */
        if (args.length == 2 && validateArguments(args)){
            number = Integer.parseInt(args[1]);
            System.out.printf("fibo<%s>: " , number);
            fibo.generateSequence(number);
            fibo.printSequence();
        }

        /**
         * Caso con un solo parametro, se asume el entero de fibo1
         */
        if (args.length == 1)
        {
            try {

                number = Integer.parseInt(args[0]);
                System.out.printf("fibo<%s>: " , number);
                fibo.generateSequence(number);
                fibo.printSequence();
            }
            catch (NumberFormatException nfe) {
                System.out.println("Opción no válida");
                System.exit(1);
            }

        }
        if (args.length != 2 && args.length !=1 ){
            System.out.println("Cantidad de argumentos invalidos.");
            System.exit(1);
        }
        System.out.println("");
    }

    public static boolean validateArguments(String[] args){

        String opcion_str = args[0];
        if(opcion_str.contains("-o=")){

            String rest_option = opcion_str.replaceAll("-o=" , "");

            if (rest_option.length() == 2){
                    switch (rest_option){
                        case "hd":
                            fibo.setOrientation(Orientation.HORIZONTAL);
                            fibo.setOrder(Order.DIRECT);
                            break;
                        case "hi":
                            fibo.setOrientation(Orientation.HORIZONTAL);
                            fibo.setOrder(Order.INVERSE);
                            break;
                        case "vd":
                            fibo.setOrientation(Orientation.VERTICAL);
                            fibo.setOrder(Order.DIRECT);
                            break;
                        case "vi":
                            fibo.setOrientation(Orientation.VERTICAL);
                            fibo.setOrder(Order.INVERSE);
                            break;
                        default:
                            System.out.println("Opción no válida");
                            return false;
                    }
                    return true;
            }
        }
        System.out.println("Opción no válida");
        return false;
    }
}
