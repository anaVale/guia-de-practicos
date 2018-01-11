package ejes;

import java.util.Scanner;

public class Eje8Descuento {

    public static void main(String[] args) {
        float saldo, descuento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el total de la factura: ");
        saldo = entrada.nextFloat();
        if (saldo >= 1000)  {
            descuento = (saldo * 20) / 100;
            saldo -= descuento;
            System.out.println("El total a pagar es: " +saldo);
        }
        else{
             System.out.println("El total a pagar es: " +saldo);
        }
        entrada.close();
        }
        }

    
