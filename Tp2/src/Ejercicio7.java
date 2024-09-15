import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena a analizar: ");
        String cadena = sc.nextLine();
        int vocales = 0;

        int cant = cadena.length();

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
               vocales++;
            }

        }

        System.out.println("La cadena tiene: " + cant + " caracteres y " + vocales + " vocales");
    }
}
