
import java.util.*;

public class poo1 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese nombre");
        try (Scanner entrada = new Scanner(System.in)) {
            String nombre = entrada.next();
            System.out.println(nombre.toUpperCase());
        }
    }

}
