import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[20];
        System.out.println("Rellene el array con veinte (20) numeros:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nro " + (i + 1) + ":");
            arr[i] = sc.nextFloat();
        }
        float numMayor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numMayor) {
                numMayor = arr[i];
            }
        }
        System.out.println("Numero mas grande: "+numMayor);
        float numMenor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < numMenor) {
                numMenor = arr[i];
            }
        }
        System.out.println("Numero mas pequeño: "+numMenor);
        float difNumeros = 0;
        difNumeros = numMayor - numMenor;
        System.out.println("La diferencia entre el numero mas grande y el mas pequeño es de "+ difNumeros);
    }
}
