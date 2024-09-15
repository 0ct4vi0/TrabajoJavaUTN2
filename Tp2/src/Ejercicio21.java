import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor a 0: ");
        int num = sc.nextInt();

        if (num <= 0){
            System.out.println("El numero no puede ser menor o igual a 0");
        }else{
            int suma = sumarEnteros(num);
            System.out.println("La suma total es: " +suma);
        }
    }
    public static int sumarEnteros(int num){
        int suma = 0;
        if (num == 1){
            return 1;
        }else
            return num + sumarEnteros(num - 1);

    }
}
