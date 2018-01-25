/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejes;

import java.util.Scanner;

/**
 *
 * @author Vale
 */
public class Eje13Entradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double abona = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int cantidad = entrada.nextInt();
        if (cantidad < 8) {
            abona = cantidad * 1.5;
            System.out.println("El grupo debe abonar: $" + abona);

        } else {
            abona = cantidad * 0.5;
            System.out.println("El grupo debe abonar: $" + abona);
        }
        entrada.close();
    }

}
