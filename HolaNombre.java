import java.util.*;

public class HolaNombre {

	public static void main(String[] args) {
		System.out.println("Ingresa tu nombre");
		Scanner entrada=new Scanner(System.in);
		String nombre=entrada.nextLine();
		System.out.println("Hola " +nombre);
		 entrada.close();
	}

}
