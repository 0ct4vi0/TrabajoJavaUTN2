import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] golosinas = {
                {"KitKat", "32", "10"},
                {"Chicles", "2", "50"},
                {"Caramelos de Menta", "2", "50"},
                {"Huevo Kinder", "25", "10"},
                {"Chetoos", "30", "10"},
                {"Twix", "26", "10"},
                {"M&M'S", "35", "10"},
                {"Papas Lays", "40", "20"},
                {"Milkybar", "30", "10"},
                {"Alfajor Tofi", "20", "15"},
                {"Lata Coca", "50", "20"},
                {"Chitos", "45", "10"}
        };
        int ventas = 0;

        while (true) {
            System.out.println("Menú:");
            System.out.println("a. Pedir golosina");
            System.out.println("b. Mostrar golosinas");
            System.out.println("c. Rellenar golosinas");
            System.out.println("d. Apagar máquina");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a": {
                    int posicion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    if (posicion < 1 || posicion > golosinas.length) {
                        System.out.println("Posición no válida.");
                        return;
                    }

                    int stock = Integer.parseInt(golosinas[posicion - 1][2]);
                    if (stock > 0) {
                        stock--;
                        golosinas[posicion - 1][2] = String.valueOf(stock);
                        int precio = Integer.parseInt(golosinas[posicion - 1][1]);
                        ventas += precio;
                        System.out.println("Golosina entregada: " + golosinas[posicion - 1][0]);
                    } else {
                        System.out.println("La golosina seleccionada está agotada. Por favor, seleccione otra.");
                    }
                    break;
                }
                case "b":{
                    System.out.println("Golosinas disponibles:");
                    for (int i = 0; i < golosinas.length; i++) {
                        System.out.println((i + 1) + ". " + golosinas[i][0] + " - Precio: " + golosinas[i][1] + " - Stock: " + golosinas[i][2]);
                    }
                }
                    break;
                case "c":{
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña = scanner.nextLine();
                    if (!contraseña.equals("AdminXYZ")) {
                        System.out.println("Contraseña incorrecta.");
                        return;
                    }
                    System.out.print("Ingrese la posición de la golosina (1-" + golosinas.length + "): ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    if (posicion < 1 || posicion > golosinas.length) {
                        System.out.println("Posición no válida.");
                        return;
                    }
                    System.out.print("Ingrese la cantidad a recargar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    int stockActual = Integer.parseInt(golosinas[posicion - 1][2]);
                    stockActual += cantidad;
                    golosinas[posicion - 1][2] = String.valueOf(stockActual);
                    System.out.println("Golosina recargada: " + golosinas[posicion - 1][0]);
                }

                    break;
                case "d": {
                    System.out.println("Ventas totales: " + ventas);
                    System.out.println("Apagando máquina...");
                    return;
                }
                default: {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}