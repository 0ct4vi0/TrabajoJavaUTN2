public class Ejercicio1 {
    public static void main(String[] args){
        // Ejemplo de un array fuera de rango limite.
        int [] arrayExample = new int[3];
        for(int i=0;i <= 3; i++){
            System.out.println(arrayExample[i]);
        }
        //  Este deberia dar un error de compilacion porque estariamos
        // intentando acceder a un indice fuera de rango valido.
    }
}
