package tareas;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
	private int alto;
	private int ancho;

	public void ingresoDatos(){

		try {
			this.ancho = ingresaAncho();
			this.alto = ingresaAlto();
		} catch (AnchoException e) {
			System.out.println(e.getMessage());
			ingresoDatos();
		} catch (AltoException e) {
			System.out.println(e.getMessage());
			ingresoDatos();
		}catch (InputMismatchException e){
			System.out.println("Dato invalido, vuelva a ingresarlos");
			ingresoDatos();
		}
	}

	static int ingresaAncho() throws AnchoException  {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese el Ancho: ");
		
		int dato = s1.nextInt();
		if (dato <= 0) {

			throw new AnchoException("Ancho invalido");

		}

		else {
			return dato;
		}
		

	}

	static int ingresaAlto() throws AltoException {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el Alto: ");
		int dato = s.nextInt();
		if (dato <= 0) {
			throw new AltoException("Alto invalido");
		}

		else {
			return dato;
		}

	}

	public void dibuja() {
		int altoF = this.alto + 2;
		int anchoF = this.ancho + 2;

		for (int i = 0; i < altoF; i += 1) {

			for (int j = 0; j < anchoF; j += 1) {
				if (((j == 0) && (i == 0))
						|| ((j == anchoF - 1) && (i == altoF - 1))
						|| ((j == anchoF - 1) && (i == 0))
						|| ((j == 0) && (i == altoF - 1))) {
					System.out.print("+");
				}

				if (((i == 0) || (i == altoF - 1)) && (j > 0)
						&& (j <= anchoF - 2)) {
					System.out.print("-");

				}
				if ((j > 0) && (j < anchoF - 1) && (i > 0) && (i < altoF - 1)) {
					System.out.print(" ");
				}
				if (((j == 0) || (j == anchoF - 1)) && (i < altoF - 1)
						&& (i > 0)) {
					System.out.print("|");

				}
			}
			System.out.println("");
		}
	}

}
