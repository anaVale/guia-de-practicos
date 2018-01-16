package ejes;

import java.util.Scanner;

public class Eje11Par {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        
        if ((num1%2)==0) {
            System.out.println("El número es par " );
        } else {
            System.out.println("El número es impar ");

        }
        entrada.close();
    }

}
