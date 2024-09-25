import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio8 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int []array = new int[10];
        System.out.println("Ingrese 10 numeros enteros aleatorios");
        for(int i=0;i < array.length;i++){
            System.out.print("Nro "+i+":");
            array[i] =sc.nextInt();
        }

        /*  iba a hacerlo manualmente pero encontre el sort y collections
        for(int i=0; i < array.length; i++){

        }
         */

        int []arrayAscendiente = Arrays.copyOf(array,array.length);
        Integer[] arrayDescendiente = Arrays.copyOf(array,array.length);

        Arrays.sort(arrayAscendiente);
        System.out.println("Ordenado ascendiente: "+Arrays.toString(arrayAscendiente));


        Arrays.sort(arrayDescendiente,Collections.reverseOrder());
        System.out.println("Ordenado descendiente: "+ Arrays.toString(arrayDescendiente));
    }
}
