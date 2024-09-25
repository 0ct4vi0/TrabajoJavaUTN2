import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array de una dimension");
        int arrayTamaño = sc.nextInt();
        int []arrayFeliz = new int[arrayTamaño];
        System.out.println("Ingrese el numero con el cual sacar multiplos");
        int number=sc.nextInt();
        funcionRellenoDeArray.rellenoArray(arrayFeliz, number);
        funcionMuestraArray.mostrarArray(arrayFeliz);
    }
    public class funcionRellenoDeArray {
        public static void rellenoArray(int[] array, int numberMultiplo) {
            int resultado = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = numberMultiplo * i;
            }
        }
    }
    public class funcionMuestraArray {
        public static void mostrarArray(int[] arrayMostrar) {
            System.out.println("Resultado:");
            for (int i = 0; i < arrayMostrar.length; i++) {
                System.out.print(arrayMostrar[i]+", ");
            }
        }
    }
}
