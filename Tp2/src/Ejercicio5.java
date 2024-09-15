import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double num = sc.nextDouble();

        String strNum = String.valueOf(num);

        System.out.println("Numero ingresado: " + num + "\nConvertido a string: " + strNum);
    }
}
