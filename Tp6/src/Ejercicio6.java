import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el nombre para la celda (o 'FIN' para terminar): ");
            String valor = sc.nextLine();

            if (valor.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = sc.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = sc.nextInt();
            sc.nextLine();

            matriz.agregarCelda(fila, columna, valor);
        }

        System.out.println("Valores cargados en cada matriz:");
        matriz.mostrarMatriz();

        System.out.print("Ingrese la cantidad de filas de la celda: ");
        int filaBuscada = sc.nextInt();
        System.out.print("Ingrese la cantudad de columnas para obtener la celda: ");
        int columnaBuscada = sc.nextInt();

        String valorObtenido = matriz.obtenerValor(filaBuscada, columnaBuscada);
        System.out.println("La celda es (" + filaBuscada + ", " + columnaBuscada + "): " + valorObtenido);
    }
}

class Celda {
    int fila;
    int columna;
    String valor;
    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Celda{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", Nombre='" + valor + '\'' +
                '}';
    }
}
class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();
    public void agregarCelda(int fila, int columna, String valor) {
        Celda celda = new Celda(fila, columna, valor);
        matrizCuadrada.add(celda);
    }
    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La fila y columna indicada no ha coinciden";
    }
    public void mostrarMatriz() {
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda);
        }
    }
}

