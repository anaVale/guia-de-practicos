package es_primo;

public class MainPrimo {

	public static void main(String[] args) {
	Primo numeros = new Primo();
	escribir(numeros.esPrimo(2));     // true
	escribir(numeros.esPrimo(7));     // true
	escribir(numeros.esPrimo(1871));  // true
	escribir(numeros.esPrimo(12119)); // true
	escribir(numeros.esPrimo(15679)); // true
	// no primos
	escribir(numeros.esPrimo(6));         // false
	escribir(numeros.esPrimo(11663));     // false
	escribir(numeros.esPrimo(2663399));   // false
	escribir(numeros.esPrimo(190013801)); // false
	escribir(numeros.esPrimo(245831041)); // false
	}
   /* System.out.println(numeros.esPrimo(2));     // true
    System.out.println(numeros.esPrimo(7)); 
    System.out.println(numeros.esPrimo(1871));
    System.out.println(numeros.esPrimo(12119));
    System.out.println(numeros.esPrimo(15679));
    System.out.println(numeros.esPrimo(6)); // false
    System.out.println(numeros.esPrimo(11663)); 
    System.out.println(numeros.esPrimo(2663399));
    System.out.println(numeros.esPrimo(245831041)); 
    */


	

private static void escribir(boolean rta) {
System.out.println(rta);
}
}


