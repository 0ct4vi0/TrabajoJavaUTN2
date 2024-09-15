import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextInt();

        short numShort = (short) num1;
        int numInt = (int) num1;
        long numLong = (long) num1;
        String strNum = String.valueOf(num1);
        float numFloat = (float) num1;

        System.out.println("Double: "+num1);
        System.out.println("short: "+numShort);
        System.out.println("int: "+numInt);
        System.out.println("Long: "+numLong);
        System.out.println("String: "+strNum);
        System.out.println("Float: "+numFloat);

    }
}
