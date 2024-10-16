import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese números enteros (ingrese un número menor a 0 para terminar):");

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            numeros.add(numero);
        }
        System.out.println("Números ingresados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
