import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena a invertir: ");
        String cadena = sc.nextLine();

        System.out.print("La cadena invertida es: ");
        invertirCadena(cadena);
        System.out.println();
    }
    public static void invertirCadena(String cadena) {
        if (cadena.length() > 0) {
            System.out.print(cadena.charAt(cadena.length() - 1));
            invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }
}

