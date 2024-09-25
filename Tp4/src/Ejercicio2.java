import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese X: ");
        int X = sc.nextInt();
        System.out.println("Ingrese Y: ");
        int Y = sc.nextInt();
        int v1 [][] = new int[X][Y];

        System.out.println("Llenemos el vector 1: ");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print("Posicion: " + i + ", " + j + ": ");
                v1[i][j] = sc.nextInt();
            }
        }
        int v2[][] = new int[Y][X];
        System.out.println("Llenemos el vector 2: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Posicion: " + i + ", " + j + ": ");
                v2[i][j] = sc.nextInt();
            }
        }
        int v3[][] = new int[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                v3[i][j] = v1[i][j]* v2[j][i];
            }
        }
        System.out.println("Vector 1");
        printVector(v1);
        System.out.println("Vector 2");
        printVector(v2);
        System.out.println("Vector 3");
        printVector(v3);

    }
    public static void printVector(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
