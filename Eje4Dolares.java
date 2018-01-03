
package ejes;

import java.util.Scanner;

public class Eje4Dolares {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       double dolar, pesos, totalDolar;
       System.out.println("Ingrese la cotización del dolar a la fecha: ");
       dolar=entrada.nextDouble();
       System.out.println("Ingrese el monto en pesos a cotizar: ");
       pesos=entrada.nextDouble();
       totalDolar=pesos/dolar;
       System.out.println("El monto en dolares es:" +String.format("%.2f", totalDolar));
       entrada.close();
    }
    
}
