package TalentLab.Clase7.Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            funcionPrincipal();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Input malo");
            System.out.println(e.getMessage());
        }catch (NoEncontradoException e){
            System.out.println("No encontrado");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //Quiero que siempre se muestre este mensaje final
        System.out.println("Mensaje final");
    }

    public static void funcionPrincipal() throws NoEncontradoException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero par, positivo y menor a 100");
        int numero = entrada.nextInt();
        int[] array = new int[3];
        ArrayList<String> lista = new ArrayList<>();

        //System.out.println(lista.get(5));  //IndexOutOfBoundsException
        //System.out.println(array[0]);     //  ArrayIndexOutOfBoundsException

        if (numero < 1) {
            throw new NoEncontradoException("Tenes que cargar numeros positivos");
        } else if (numero % 2 == 1) {
            throw new NotFoundExcepction("Tenes que cargar numeros que sean pares");
        } else if(numero > 100){
            throw new RuntimeException("Tiene que ser un numero menor al 100");
        }
    }
}






