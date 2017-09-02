import java.util.*;
public class ContarDesde {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Contar desde.... hasta 0(Ingresa un número): ");
		long num=entrada.nextLong();
		while (num>=0){
			System.out.println(num);
			num=num-1;
		}
		entrada.close();
			
		}

	}


