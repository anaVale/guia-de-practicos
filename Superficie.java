package primerprograma;
import java.util.*;

public class Superficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int superficie;
     
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese base: ");
      int base =entrada.nextInt();
      System.out.println("Ingrese altura: ");
      int altura=entrada.nextInt();
      superficie=base*altura;
      System.out.println("La superficie de base:" +base +" y altura: " +altura +" es: " +superficie);
      entrada.close();
    }
    
}
