
package ejes;

import java.util.Scanner;

public class Eje7Calificacion {

    public static void main(String[] args) {
        float notasParciales, promedio, examenFinal, trabajoFinal, nota;
       
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese una calificacion parcial: ");
        notasParciales=entrada.nextInt();
        System.out.println("Ingrese otra calificacion parcial: ");
        notasParciales+=entrada.nextInt();
        System.out.println("Ingrese otra calificacion parcial: ");
        notasParciales+=entrada.nextInt();
        promedio=notasParciales/3;
        System.out.println("Ingrese la calificacion del examen final: ");
        examenFinal=entrada.nextInt();
        System.out.println("Ingrese la calificacion del trabajo final: ");
        trabajoFinal=entrada.nextInt();
        nota=((promedio*55)/100)+((examenFinal*30)/100)+((trabajoFinal*15)/100);
        System.out.println("La nota final es: " +nota);
        entrada.close();
        
    }
    
}
