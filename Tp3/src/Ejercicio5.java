public class Ejercicio5 {
    public static void main(String[] args) {
        int [] vector = new int [20];
        int sumaTotal = 0;
        for (int i = 0; i < 20; i++) {
            int par = (int)(Math.random()*50)*2;
            vector[i] = par;
            sumaTotal = (sumaTotal + vector[i]);
        }
        int promedio = sumaTotal / 20;
        int iguales = 0;
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < 20; i++) {
            if (vector[i] == promedio) {
                iguales = iguales +1;
            }else if (vector[i] > promedio) {
                mayores = mayores + 1;
            }else if (vector[i] < promedio) {
                menores = menores +1;
            }
        }
        System.out.println("El vector es el siguiente: ");
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            if (i < 19) {
                System.out.print(vector[i] + ",");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.println("]");

        System.out.println("El promedio es: " + promedio);
        System.out.println("Hay una cantida de: " + iguales + " numeros iguales al promedio");
        System.out.println("Hay: " + mayores + " numeros mayores al promedio");
        System.out.println("Hay: " + menores + " numeros menores al promedio");
    }
}
