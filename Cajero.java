package cajero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cajero {
	private int cantidad[] = { 10, 10, 10, 10, 10 };
	private int monto[] = { 100, 50, 500, 500, 100 };
	private int montoT = 0;
	private int cambio[] = { 0, 0, 0, 0, 0 };

	public Cajero() {
		ordenaCajas();
		calculaMontoT();

		int cambio[] = new int[5];
	}

	public void ordenaCajas() {
		int auxC = 0;
		int auxM = 0;

		for (int i = 0; i < 4; i += 1) {
			for (int j = i + 1; j < 5; j += 1) {
				if ((this.monto[i] < this.monto[j])) {
					auxM = this.monto[i];
					auxC = this.cantidad[i];
					this.monto[i] = this.monto[j];
					this.cantidad[i] = this.cantidad[j];
					this.monto[j] = auxM;
					this.cantidad[j] = auxC;
				}
			}
		}
	}

	public void muestraCajas() {
		for (int i = 0; i < 5; i += 1) {
			System.out.println("caja " + (i + 1) + " tiene " + cantidad[i]
					+ " billetes de " + this.monto[i]);

		}
		System.out.println("El monto total es: " + montoT);
	}

	public void ingresaMonto() throws InputMismatchException {
		Scanner m = new Scanner(System.in);
		try {
			muestraCajas();
			System.out.println("Ingrese el monto que desea retirar: ");
			int monto = m.nextInt();

			if (monto > montoT) {
				System.out.println("El monto maximo que puede retirar es: "
						+ montoT);
				throw new InputMismatchException();
			} else {
				buscaCambio(monto);
				muestraCambio();
			}
		} catch (InputMismatchException e) {
			System.out
					.println("No hay dinero suficiente, ingrese un monto menor: ");
			ingresaMonto();
		}
	}

	private void muestraCambio() {
		for (int i = 0; i < 5; i += 1) {
			System.out.println("Entrega " + cambio[i] + " Billetes de "
					+ monto[i]);
		}

	}

	private void buscaCambio(int monto) {
		int t = 0, i = 0;
		boolean fin = false;
		this.montoT -= monto;
		
		while (fin == false) {

			if ((monto / this.monto[i]) <= cantidad[i]) {
				t = monto / this.monto[i];
				cambio[i] = t;
				cantidad[i] -= t;
				fin = true;

			} else {
				cambio[i] = this.cantidad[i];
				monto -= this.cantidad[i] * this.monto[i];
				cantidad[i] = 0;

			}
			i += 1;
		}

	}

	private void calculaMontoT() {

		for (int i = 0; i < 5; i += 1) {
			this.montoT += monto[i] * cantidad[i];
		}

	}
}
