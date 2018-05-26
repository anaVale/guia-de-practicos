
import java.util.Scanner;

public class U3PooEje4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ingles = 0, frances = 0, portugues = 0, aleman = 0;
        int cantidad = 0;
        int pI, pF, pP, pA;
        String continua;
        do {

            System.out.println("Ingrese opcion ([I]ngles,[F]rances,[P]ortugues, [A]leman:");
            String op = entrada.nextLine();

            while ((op.equals("I")) || (op.equals("F")) || (op.equals("P")) || (op.equals("A"))) {
                if (op.equals("I")) {
                    ingles += 1;
                    cantidad += 1;
                }
                if (op.equals("F")) {
                    frances += 1;
                    cantidad += 1;
                }
                if (op.equals("P")) {
                    portugues += 1;
                    cantidad += 1;
                }
                if (op.equals("A")) {
                    aleman += 1;
                    cantidad += 1;
                }
                op = "N";
            }
            System.out.println("Desea continuar S/N:");
            continua = entrada.nextLine();
        } while (continua.equals("S"));
        if (cantidad > 0) {
            pI = (ingles * 100) / cantidad;
            pF = (frances * 100) / cantidad;
            pP = (portugues * 100) / cantidad;
            pA = (aleman * 100) / cantidad;
            System.out.println("El porcentaje de alumnos inscriptos es:");
            System.out.println("INGLES: " + pI);
            System.out.println("FRANCES: " + pF);
            System.out.println("PORTUGUES:" + pP);
            System.out.println("ALEMAN:" + pA);
        } else {
            System.out.println("El porcentaje de alumnos inscriptos es:");
            System.out.println("INGLES: 0");
            System.out.println("FRANCES: 0");
            System.out.println("PORTUGUES: 0");
            System.out.println("ALEMAN: 0");
        }
    }

}
