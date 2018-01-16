package ejes;

import java.util.Scanner;

public class Eje10Menor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = entrada.nextInt();
        if (num1 < num2) {
            System.out.println("El número menor es: " + num1);
        } else {
            System.out.println("El número menor es: " + num2);

        }
        entrada.close();
    }

}
