import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String cadenaModificada = cadena.replace('a', 'e').replace('A', 'E');

        System.out.println("La cadena original: "+cadena + "\nLa cadena modificada: "+cadenaModificada);
    }
}
