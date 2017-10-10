package cajero;

import java.util.Scanner;

public class UsoCajero {

	public static void main(String[] args) {
		Cajero opero = new Cajero();
		Scanner op = new Scanner(System.in);

		for (;;) {
			System.out.println("Bienvenido");
			System.out.println("Para operar presione un numero:");
			int n = op.nextInt();
			opero.ingresaMonto();
			
		}

	}
}
