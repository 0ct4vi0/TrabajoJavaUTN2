import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros al azar para llenar el vector ");
        int sumaPares = 0;
        int sumaImpares = 0;
        int [] vector = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero de la posicion " + (i+1));
            vector[i] = sc.nextInt();
            if (vector[i] % 2 == 0) {
                sumaPares = sumaPares + vector[i];
            }else  {
                sumaImpares = sumaImpares + vector[i];
            }

        }
        System.out.println("Nuestros numeros son los siguientes: ");
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            if (i < 19) {
                System.out.print(vector[i] + ",");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.println("]");

        System.out.println("La suma de los pares es " + sumaPares);
        System.out.println("La suma de los impares es " + sumaImpares);

    }
}
