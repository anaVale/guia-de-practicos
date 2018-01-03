
package ejes;

import java.util.Scanner;


public class Eje2Descuento {

   
    public static void main(String[] args) {
        final int descuento = 15;
        float compra, totalDescuento;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese el importe de la compra: ");
        compra=entrada.nextFloat();
        totalDescuento=(compra*descuento)/100;
        System.out.println("El valor final de la compra es: " +(compra-totalDescuento));
        entrada.close();
        
    }

}
