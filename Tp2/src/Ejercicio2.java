import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        byte num1 = sc.nextByte(); //Si es mayor de 127 o menor de -128 se dara un error de compilacion

        System.out.println("Numero ingresado: " + num1);

        //Como solucion se puede hacer lo siguiente

        System.out.println("Ingrese el numero: ");
        int num2 = sc.nextInt(); //Utilizaremos int pero limitaremos el rango manualmente para que no haya errores de compilacion

        if (num2 > 127) {
            System.out.println("El numero mayor que 127, esta fuera del rango de byte");
        }else
            if (num2 < -128) {
                System.out.println("El numero es menor que -128, esta fuera del rango de byte");
            }else
                System.out.println("El numero " + num2 +" esta en el rango de byte, proceda");
    }
}
