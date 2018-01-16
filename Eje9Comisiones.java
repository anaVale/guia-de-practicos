
package ejes;

import java.util.Scanner;

public class Eje9Comisiones {

  
    public static void main(String[] args) {
     float comision=0;
     Scanner entrada= new Scanner(System.in);
     System.out.println("Ingrese el Código del vendedor: ");
     int codVendedor=entrada.nextInt();
     System.out.println("Ingrese el monto vendido: ");
     float montoVendido=entrada.nextFloat();
     if (codVendedor<100){
         comision=(montoVendido*30)/100;
         
     }
     if ((codVendedor>=100)&&(codVendedor<=200)){
         comision=(montoVendido*20)/100;
         
     }
     if (codVendedor>200){
         comision=(montoVendido*10)/100;
         
     }
     System.out.println("El codigo del vendedor es: " +codVendedor);
     System.out.println("El monto vendido es: " +montoVendido);
     System.out.println("La comision es: " +comision);
    }
    
}
