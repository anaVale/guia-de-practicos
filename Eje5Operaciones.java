
package ejes;

import java.util.Scanner;

public class Eje5Operaciones {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num1, num2, num3, promedio, suma, producto;
        System.out.println("Ingrese un número: ");
        num1= entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2= entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num3= entrada.nextInt();
        suma=num1+num2+num3;
        promedio=suma/3;
        producto=num1*num2*num3;
        System.out.println("La suma de los números es: " +suma);
        System.out.println("El producto de los números es: " +producto);
        System.out.println("El promedio de los números es: " +promedio); 
        entrada.close();
    }
    
}
