package ejes;

import java.util.Scanner;

public class Eje3Suma {

    public static void main(String[] args) {
        double num1, num2, suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese otro número: ");
        num2 = entrada.nextDouble();
        suma = num1 + num2;
        System.out.println("La suma de los números ingresados es: " + suma);
        entrada.close();

    }

}
