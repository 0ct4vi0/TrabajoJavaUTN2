import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arrayNumerico = new int[5];
        System.out.println("Ingrese cinco numeros");
        for (int i=0; i <5; i++){
            System.out.println("Ingrese el numero "+(i+1));
            arrayNumerico[i] = sc.nextInt();

        }
        System.out.println("Numeros almacenados");
        for(int i=0;i<5;i++){
            System.out.println("Nro "+ i +": "+arrayNumerico[i]);
        }
    }
}
