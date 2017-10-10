package tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
	private int alto;
	private int ancho;
	public  void ingresaDatos()  {
		Scanner s2 = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese Alto: ");
		
		try{
		this.alto = validaAlto(s2.nextInt());
		System.out.println("Ingrese ancho: ");
		this.ancho = validaAncho(s1.nextInt());
	}catch (AltoException e){
		System.out.println(e.getMessage());
		ingresaDatos();
	}catch (AnchoException e){
		System.out.println(e.getMessage());
		ingresaDatos();
	}catch (InputMismatchException e){
		System.out.println("Dato invalido");
		ingresaDatos();
	}}
	

	private int validaAlto(int dato) throws AltoException {
		if (dato <= 0) {
			throw new AltoException("Alto invalido");
		}

		return dato;
	}

	private int validaAncho(int dato) throws AnchoException {
		if (dato <= 0) {
			throw new AnchoException("Ancho invalido");
		}

		return dato;
	}

	public void dibujaCuadrado() {
		for (int i = 0; i < this.alto; i += 1) {
			for (int j = 0; j < this.ancho; j += 1) {
				System.out.print("#");

			}
			System.out.println("");
		}
	}
	}

