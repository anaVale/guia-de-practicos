
import java.util.Scanner;

public class poo5 {

    public static void main(String[] args) {
        System.out.println("Ingrese un número de 4 dígitos: ");
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        String numero = String.valueOf(num);

        char nume[] = numero.toCharArray();
        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.print(nume[i]);
        }
        System.out.println("");

    }

}
