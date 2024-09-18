import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros a guardar ");
        int [] vector = new int[5];
        for (int i = 0 ; i < 5 ; i++){
            vector[i] = sc.nextInt();
        }
        System.out.println("El vector guardado se ve asi: [" +vector[0]+","+vector[1]+","+vector[2]+","+vector[3]+","+vector[4]+"]" );

    }
}
