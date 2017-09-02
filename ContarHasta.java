import java.util.*;
public class ContarHasta {

	public static void main(String[] args) {
		long num;
		num=0;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Hasta que número queres que cuente?(Ingresa un número) ");
		long nu=entrada.nextLong();
				
		while (num<=nu) {
		System.out.println(num);
		num=num+1;
		}
		entrada.close();
	}

}
