package TalentLab.Clase2;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        //int precioProducto = 500;
        //int cantidad;
        //int saldo = 5000;

        //bucle con repeticiones indefinidas

        /* while (saldo > 0) {
            System.out.println("Saldo actual: " +saldo);
            System.out.println("Cantidad a comprar: ");
            cantidad = entrada.nextInt();

            saldo = saldo - (precioProducto * cantidad);

        }


        System.out.println("Mensaje final del bucle");
        */


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero de 0 a 10");
        int numeroTabla = entrada.nextInt();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("ahora otro numero");
        int numerador = entrada1.nextInt();

        for (int i = numeroTabla; i <= numerador; i++){
            System.out.println(numeroTabla + "x" + numerador + "=" + (numeroTabla * numerador));


        }






    }

    }
