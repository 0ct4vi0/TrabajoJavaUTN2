import java.util.Scanner;
import java.util.Random;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vector = new int [50];
        for (int i = 0; i < 50; i++) {
            int random = new Random().nextInt(100);
            vector[i] = random;
        }

        System.out.println("El vector es el siguiente: ");
        System.out.print("[");
        for (int i = 0; i < 50; i++) {
            if (i < 49) {
                System.out.print(vector[i] + ",");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.println("]");

        System.out.println("Que numero desea buscar?");
        int num = sc.nextInt();

        int posicion = -1;

        for (int i = 0; i < 50; i++) {
            if (vector[i] == num) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("El numero "+num+" esta en la posicion: "+posicion);
        }else
            System.out.println("El numero es no se encuentra en nuestro vector");
    }
}
