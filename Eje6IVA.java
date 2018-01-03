
package ejes;

import java.util.Scanner;


public class Eje6IVA {

    
    public static void main(String[] args) {
        double monto;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra: ");
        monto=entrada.nextDouble();
        System.out.println("El importe de IVA es:" +((monto*21)/121));
        entrada.close();
        
    }
    
}
