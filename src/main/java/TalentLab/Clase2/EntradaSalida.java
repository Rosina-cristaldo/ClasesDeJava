package TalentLab.Clase2;

import java.util.Scanner;

public class EntradaSalida {
   public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

       System.out.println("Ingrese su nombre de usuario");
        //nextLine() se usa siempre para Strings
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su nombre de Edad");

        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese una descripción");
        String descripcion = entrada.nextLine();
        System.out.println("El usuario ingreso la siguiente info: " + nombre + " " + edad + " " + descripcion);












   }



        }
