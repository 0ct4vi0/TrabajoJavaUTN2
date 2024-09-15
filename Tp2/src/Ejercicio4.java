import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra: ");
        double num = sc.nextDouble();
        int b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
        int m05 = 0, m025 = 0, m01 = 0, m005 = 0;

        if (num >= 200) {
            while (num >= 200) {
                b200 = b200 + 1;
                num = num - 200;
            }
        } if (num >= 100) {
            while (num >= 100) {
                b100 = b100 + 1;
                num = num - 100;
            }
        } if (num >= 50) {
            while (num >= 50) {
                b50 = b50 + 1;
                num = num - 50;
            }
        } if (num >= 20) {
            while (num >= 20) {
                b20 = b20 + 1;
                num = num - 20;
            }
        } if (num >= 10) {
            while (num >= 10) {
                b10 = b10 + 1;
                num = num - 10;
            }
        } if (num >= 5) {
            while (num >= 5) {
                b5 = b5 + 1;
                num = num - 5;
            }
        } if (num >= 2) {
            while (num >= 2) {
                b2 = b2 + 1;
                num = num - 2;
            }
        } if (num >= 1) {
            while (num >= 1) {
                b1 = b1 + 1;
                num = num - 1;
            }
        } if (num >= 0.50) {
            while (num >= 0.50) {
                m05 = m05 + 1;
                num = num - 0.50;
            }
        } if (num >= 0.25) {
            while (num >= 0.25) {
                m025 = m025 + 1;
                num = num - 0.25;
            }
        } if (num >= 0.10) {
            while (num >= 0.1) {
                m01 = m01 + 1;
                num = num - 0.10;
            }
        } if (num == 0.05) {
            while (num >= 0.05) {
                m005 = m005 + 1;
                num = num - 0.05;
            }
        }
        System.out.println("Se deben dar: \n" +b200+ " billetes de 200 \n" +b100+ " billetes de 100 \n" +b50+ " billetes de 50 \n" +b20+ " billetes de 20 \n" +b10 + " billetes de 10 \n" +b5 + " billetes de 5 \n" +b2 + " monedas de 2 \n" +b1+ " monedas de 1 \n" +m05+ " monedas de 0.50 \n" +m025+ " monedas de 0.25 \n" +m01+ " monedas de 0.10 \n" +m005+ " monedas de 0.05" );

    }
}
