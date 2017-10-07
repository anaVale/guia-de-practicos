import java.io.IOException;
import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alto;
		int ancho;
		// int dato1,dato2;
		Scanner s2 = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		for (;;) {

			try {

				System.out.println("Ingrese Alto: ");
				alto = validaDato(s2.nextInt());
				System.out.println("Ingrese ancho: ");
				ancho = validaDato(s1.nextInt());
				dibujaCuadrado(ancho, alto);
			} catch (Exception e) {
				System.out.println("Alto invalido");
				System.out.println("Ancho invalido");
			}

		}
	}

	
	static int validaDato(int dato) throws IOException {
		if (dato <= 0) {
			throw new IOException();
		}

		return dato;
	}

	static void dibujaCuadrado(int ancho, int alto) {
		for (int i = 0; i < alto; i += 1) {
			for (int j = 0; j < ancho; j += 1) {
				System.out.print("#");

			}
			System.out.println("");
		}
	}
}