import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(50) * 2 + 2;
            numeros.add(numero);
        }
        System.out.println("Números generados: " + numeros);
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.size();
        int iguales = 0;
        int mayores = 0;
        int menores = 0;

        for (int numero : numeros) {
            if (numero == promedio) {
                iguales++;
            } else if (numero > promedio) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Promedio aritmético: " + promedio);
        System.out.println("Números iguales al promedio: " + iguales);
        System.out.println("Números mayores que el promedio: " + mayores);
        System.out.println("Números menores que el promedio: " + menores);
    }
}
