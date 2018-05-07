
import java.util.Scanner;

public class poo8 {

    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        System.out.println("Tabla de multiplicar del " + num + ": ");

        int i = 0;
        do {
            i += 1;
            System.out.println(+num + "x" + i + "= " + num * i);

        } while (i < 12);
    }

}
