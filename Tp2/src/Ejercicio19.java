import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora mas trucha");

        System.out.println("Ingrese el primer numero: ");
        double num = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Ingrese la operacion: ");
        String operacion = sc.next();
        switch (operacion) {
            case "+": {
                double resultado = sumar(num, num2);
                System.out.println("El resultado es: " + resultado);
                break;
            }
            case "-": {
                double resultado = restar(num,num2);
                System.out.println("El resultado es: " + resultado);
                break;
            }
            case "*": {
                double resultado = multiplicar(num,num2);
                System.out.println("El resultado es: " + resultado);
                break;
            }
            case "/": {
                double resultado = dividir(num,num2);
                System.out.println("El resultado es: " + resultado);
                break;
            }
        }
    }
    private static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    private static double restar(double num1, double num2) {
        return num1 - num2;
    }
    private static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    private static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
