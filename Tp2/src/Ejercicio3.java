import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 digitos: ");
        int num = sc.nextInt();
        if (num >=100 & num <= 999) {
            int digito1 = num % 10;
            int digito2 = (num / 10) % 10;
            int digito3 = num / 100;

            int resultado = digito1 + digito2 + digito3;

            System.out.println("La suma de los digitos es: " + resultado);
        }else
            System.out.println("El numero no es de 3 digitos.");
    }
}
