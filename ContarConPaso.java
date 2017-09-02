import java.util.*;
public class ContarConPaso {

	public static void main(String[] args) {
		long num=1;
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingresa el paso con el que queres que cuente: ");
		int paso=entrada.nextInt();
		while (num>-1){
			System.out.println(num);
			num=num+paso;
			
		}
	entrada.close();
	}

}
