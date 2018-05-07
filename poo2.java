
import com.sun.xml.internal.ws.util.StringUtils;
import java.util.*;

public class poo2 {

    public static void main(String[] args) {

        System.out.println("Ingrese nombre:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido:");
        String apellido = entrada.nextLine();
        String nom = nombre.toLowerCase();
        String ape = apellido.toLowerCase();
        nombre = nom;
        apellido = ape;
        nombre = StringUtils.capitalize(nombre);
        apellido = StringUtils.capitalize(apellido);
        System.out.print("Nombre y apellido:" + nombre);
        System.out.println(" " + apellido);
    }

}
