public class Ejercicio9 {
        public static void main(String[] args) {
            String cadena = "La lluvia en Mendoza es escasa";

            System.out.println("Cadena original: " + cadena);
            System.out.println("Códigos ASCII de los caracteres:");

            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                int codigoAscii = (int) caracter;
                System.out.println("Carácter: " + caracter + "\nCódigo ASCII: " + codigoAscii);
            }
        }
    }
