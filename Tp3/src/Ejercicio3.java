import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de nuestro vector: ");
        int n = sc.nextInt();

        int [] vector = new int[n];
        System.out.println("Ingrese el valor del cual sacar multiplos: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n; i++) {
            vector[i] = n2 * (i+1);
        }
        System.out.println("El vector se veria asi: ");
        System.out.print("[");

        for (int i = 0; i < n; i++) {
            if (i < n-1) {
                System.out.print(vector[i] + ",");
            }else {
                System.out.print(vector[i]);
            }
        }
        System.out.println("]");

    }
}
