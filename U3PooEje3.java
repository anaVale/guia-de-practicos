
import java.util.Scanner;

public class U3PooEje3 {

    public static void main(String[] args) {
        int mes = 0;
        int dia = 0;
        int valida = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese mes de nacimiento: ");
            mes = entrada.nextInt();
        } while ((mes < 1) || (mes > 12));

        do {
            System.out.println("Ingrese dia de nacimiento: ");
            dia = entrada.nextInt();

            if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && ((dia >= 1) && (dia <= 31))) {
                valida = 1;

            } else if (((mes == 4) || (mes == 6) || (mes == 9)||(mes==11)) && ((dia >= 1) && (dia <= 30))) {
                valida = 1;

            } else if ((mes == 2) && ((dia >= 1) && (dia <= 28))) {
                valida = 1;

            } else {
                System.out.println("Dia incorrecto");
                valida = 0;
            }
        } while (valida == 0);

        switch (mes) {
            case 1:
                if (dia <= 19) {
                    System.out.println("CAPRICORNIO");
                } else {
                    System.out.println("ACUARIO");
                }
                break;
            case 2:
                if (dia <= 19) {
                    System.out.println("ACUARIO");
                } else {
                    System.out.println("PISCIS");

                }
                break;
            case 3:
                if (dia <= 20) {
                    System.out.println("PISCIS");
                } else {
                    System.out.println("ARIES");

                }
                break;
            case 4:
                if (dia <= 21) {
                    System.out.println("ARIES");
                } else {
                    System.out.println("TAURO");

                }
                break;
            case 5:
                if (dia <= 20) {
                    System.out.println("TAURO");
                } else {
                    System.out.println("GEMINIS");

                }
                break;
            case 6:
                if (dia <= 20) {
                    System.out.println("GEMINIS");
                } else {
                    System.out.println("CANCER");

                }
                break;
            case 7:
                if (dia <= 22) {
                    System.out.println("CANCER");
                } else {
                    System.out.println("LEO");

                }
                break;
            case 8:
                if (dia <= 22) {
                    System.out.println("LEO");
                } else {
                    System.out.println("VIRGO");

                }
                break;
            case 9:
                if (dia <= 23) {
                    System.out.println("VIRGO");
                } else {
                    System.out.println("LIBRA");

                }
                break;
            case 10:
                if (dia <= 22) {
                    System.out.println("LIBRA");
                } else {
                    System.out.println("ESCORPIO");

                }
                break;
            case 11:
                if (dia <= 22) {
                    System.out.println("ESCORPIO");
                } else {
                    System.out.println("SAGITARIO");

                }
                break;
            case 12:
                if (dia <= 21) {
                    System.out.println("SAGITARIO");
                } else {
                    System.out.println("CAPRICORNIO");

                }
                break;

        }

    }

}
