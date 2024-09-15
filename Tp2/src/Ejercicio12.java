import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena para extraer la primer y quinta letra");{
            String cadena = sc.nextLine();
            String primero = cadena.substring(0,1);
            String quinto = cadena.substring(4,5);

            System.out.println("La primera es: " + primero);
            System.out.println("La quinta es: " + quinto);

        }
    }
}
