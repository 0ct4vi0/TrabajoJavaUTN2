import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros para el vector principal ");
        int[] vector = new int[10];
        int[] ascendente = new int[10];
        int[] descendente = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero en la posicion " + (i + 1));
            vector[i] = sc.nextInt();
        }
        System.out.println("Vector Principal: ");
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vector[i] + ",");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.println("]");
        for (int i = 0; i < 10; i++) {
            ascendente[i] = vector[i];
            descendente[i] = vector[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (ascendente[i] > ascendente[j]) {
                    int temp = ascendente[i];
                    ascendente[i] = ascendente[j];
                    ascendente[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (descendente[i] < descendente[j]) {
                    int temp = descendente[i];
                    descendente[i] = descendente[j];
                    descendente[j] = temp;
                }
            }
        }
        System.out.print("Arreglo en orden ascendente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ascendente[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo en orden descendente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(descendente[i] + " ");
        }
        //Hace poco descubri la opcion Sort del import java.util.Arrays, pero ya hice el ejercicio asi.
    }
}
