import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 dígitos enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el dígito " + (i + 1) + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        ArrayList<Integer> numerosAscendente = new ArrayList<>(numeros);
        ArrayList<Integer> numerosDescendente = new ArrayList<>(numeros);

        Collections.sort(numerosAscendente);

        Collections.sort(numerosDescendente, Collections.reverseOrder());

        System.out.println("Números en orden ascendente: " + numerosAscendente);
        System.out.println("Números en orden descendente: " + numerosDescendente);
    }
}
