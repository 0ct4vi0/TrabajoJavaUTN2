package org.example;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//   1)
//        Scanner sc = new Scanner(System.in);
//                System.out.println("Ingrese un numero decimal");
//                double doble = sc.nextDouble();
//                Leon leon = new Leon();
//                leon.cShort(doble);
//                Serpiente serpiente =new Serpiente();
//                serpiente.cInt(doble);
//                TeTocaAVos teTocaAVos = new TeTocaAVos();
//                teTocaAVos.cLong(doble);
//                Elefante elefante = new Elefante();
//                elefante.cString(doble);
//                Jirafa jirafa = new Jirafa();
//                jirafa.cFloat(doble);
//            }
//        }
//        class Leon {
//            public void cShort(double doble) {
//                short dobleConvertidoShort = (short) doble ;
//                System.out.println("Convertido a short: "+dobleConvertidoShort);
//            }
//        }
//        class Serpiente {
//            public void cInt(double doble){
//                int dobleConvertidoAInt = (int) doble;
//                System.out.println("Double convertido a int: "+ dobleConvertidoAInt);
//            }
//        }
//        class TeTocaAVos{
//            public void cLong(double doble){
//                long dobleConvertidoALong = (long) doble;
//                System.out.println("Double convertido a long: "+dobleConvertidoALong);
//            }
//        }
//        class Elefante {
//            public void cString(double doble){
//                String convertidoAString = Double.toString (doble);
//                System.out.println("Double convertido a String: "+convertidoAString);
//            }
//        }
//        class Jirafa{
//            public void cFloat(double doble){
//                float convertidoAFloat = (float) doble;
//                System.out.println("Double convertido a Float: "+convertidoAFloat);
//    }
//--------------------------------------------------------------------------
//  2)
//      RTA= Cunado se le asigna un valor que esta fuera de rango de una variable, ocurre un desbordamiento
//      (overflow) en el codigo y reduce su valor al minimo
//        byte b = 127;
//        System.out.println("Valor del byte antes del desbordeamiento: "+ b);
//        b++;
//        System.out.println("Valor del byte despues del desbordeamiento: "+ b);
//      B- Tambien puede ocurrir se genere un error en el codigo y este no termine de compilar
//        int[] num;
//        num= new int[3];
//        for (int i=1;i<5; i++) {
//            num[i]++;
//        }
//        for (int i=1;i<5; i++){
//            System.out.println(num[i]);
//        }
//---------------------------------------------------------------------------
//  3)
//       double numero;
//       System.out.print("Ingrese un numero de 3 digitos (100 - 999): ");
//       numero = sc.nextInt();
//       while (numero < 100 || numero > 999) {
//            System.out.println("Numero invalido. Debe estar entre 100 y 999.");
//            numero=sc.nextInt();
//       }
//            double mod_numero, trunc_numero, suma_numero;
//            suma_numero = 0;
//            trunc_numero = 1;
//            while (trunc_numero > 0) {
//                mod_numero = numero % 10;
//                suma_numero = mod_numero + suma_numero;
//                trunc_numero = Math.floor(numero / 10);
//                numero = trunc_numero;
//            }
//       System.out.println("La suma de los di­gitos es: " + suma_numero);
//----------------------------------------------------------------------------
//  4)
//        System.out.println("Ingrese el monto de la compra: ");
//        double num = sc.nextDouble();
//        int b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
//        int m05 = 0, m025 = 0, m01 = 0, m005 = 0;
//        if (num >= 200) {
//            while (num >= 200) {
//                b200 = b200 + 1;
//                num = num - 200;
//            }
//        } if (num >= 100) {
//            while (num >= 100) {
//                b100 = b100 + 1;
//                num = num - 100;
//            }
//        } if (num >= 50) {
//            while (num >= 50) {
//                b50 = b50 + 1;
//                num = num - 50;
//            }
//        } if (num >= 20) {
//            while (num >= 20) {
//                b20 = b20 + 1;
//                num = num - 20;
//            }
//        } if (num >= 10) {
//            while (num >= 10) {
//                b10 = b10 + 1;
//                num = num - 10;
//            }
//        } if (num >= 5) {
//            while (num >= 5) {
//                b5 = b5 + 1;
//                num = num - 5;
//            }
//        } if (num >= 2) {
//            while (num >= 2) {
//                b2 = b2 + 1;
//                num = num - 2;
//            }
//        } if (num >= 1) {
//            while (num >= 1) {
//                b1 = b1 + 1;
//                num = num - 1;
//            }
//        } if (num >= 0.50) {
//            while (num >= 0.50) {
//                m05 = m05 + 1;
//                num = num - 0.50;
//            }
//        } if (num >= 0.25) {
//            while (num >= 0.25) {
//                m025 = m025 + 1;
//                num = num - 0.25;
//            }
//        } if (num >= 0.10) {
//            while (num >= 0.1) {
//                m01 = m01 + 1;
//                num = num - 0.10;
//            }
//        } if (num == 0.05) {
//            while (num >= 0.05) {
//                m005 = m005 + 1;
//                num = num - 0.05;
//            }
//        }
//        System.out.println("Se deben dar: \n" +b200+ " billetes de 200 \n" +b100+ " billetes de 100 \n" +b50+ " billetes de 50 \n" +b20+ " billetes de 20 \n" +b10 + " billetes de 10 \n" +b5 + " billetes de 5 \n" +b2 + " monedas de 2 \n" +b1+ " monedas de 1 \n" +m05+ " monedas de 0.50 \n" +m025+ " monedas de 0.25 \n" +m01+ " monedas de 0.10 \n" +m005+ " monedas de 0.05" );
//-------------------------------------------------------------------------------
//5)
//        System.out.println("Ingrese un numero: ");
//        double num = sc.nextDouble();
//        String strNum = String.valueOf(num);
//        System.out.println("Numero ingresado: " + num + "\nConvertido a string: " + strNum);
//-------------------------------------------------------------------------------
//  6)
//        public class Ejercicio6 {
//        public static void main(String[] args){
//        String lluviaMendoza = "La lluvia en Mendoza es escasa";
//        System.out.println(lluviaMendoza);
//        int longitudVariable = lluviaMendoza.length();
//        System.out.println("El tamaño de la cadena es de " + longitudVariable + " caracteres");
//          }
//        }
//--------------------------------------------------------------------------
//  7)
//        System.out.println("ingrese una cadena de texto");
//        String txt = sc.nextLine();
//        int tamCadena = txt.length();
//        int contVocal = 0;
//        System.out.println("el tamaño de la cadena es: " + tamCadena);
//        for (int i = 0; i < tamCadena; i++) {
//            char Vocal = txt.charAt(i);
//            if (Vocal == 'a' || Vocal == 'e' || Vocal == 'i' || Vocal == 'o' || Vocal == 'u' ||
//                    Vocal == 'A' || Vocal == 'E' || Vocal == 'I' || Vocal == 'O' || Vocal == 'U') {
//                contVocal++;
//            }
//        }
//        System.out.println("La cantidad de vocales son: " + contVocal);
//------------------------------------------------------------------------------------------
//  8)
//        String Cad;
//        int Tamaño;
//        int Contador;
//        int Contador_Vocal;
//        Contador_Vocal=0;
//        System.out.println("Ingrese una cadena");
//        Cad = Cadena.nextLine();
//        System.out.println("El tamaño de la cadena es "+Cad.length());
//        System.out.println(Cad.replace('a', 'e'));
//        Cad=Cad.toLowerCase();
//        Tamaño=Cad.length();
//        Contador=0;
//        while (Contador<=Tamaño-1){
//            char Posicion = Cad.charAt(Contador);
//            if (Posicion == 'a'|| Posicion == 'e'|| Posicion == 'i'|| Posicion == 'o'|| Posicion == 'u' ){
//                Contador_Vocal=Contador_Vocal+1;
//            }
//            Contador=Contador+1;
//        }
//        System.out.println("Cantidad de vocales: " + Contador_Vocal);
// ------------------------------------------------------------------------------------------
//    9)
//        String cadena = "La lluvia en Mendoza es escasa";
//        System.out.println("Cadena original: " + cadena);
//        System.out.println("Códigos ASCII de los caracteres:");
//        for (int i = 0; i < cadena.length(); i++) {
//            char caracter = cadena.charAt(i);
//            int codigoAscii = (int) caracter;
//            System.out.println("Carácter: " + caracter + "\nCódigo ASCII: " + codigoAscii);
//        }
// ------------------------------------------------------------------------------------------
//  10)
//        System.out.println("Ingrese la frase o palabra: ");
//        String cadena = sc.nextLine();
//        System.out.println("Elija una opcion \n1.Mayusculas \n2.Minusculas");
//        int opcion = sc.nextInt();
//        switch (opcion) {
//
//            case 1: {
//                cadena = cadena.toUpperCase();
//                System.out.println(cadena);
//                break;
//            }
//            case 2: {
//                cadena = cadena.toLowerCase();
//                System.out.println(cadena);
//                break;
//            }
//        }
// ------------------------------------------------------------------------------------------
//  11)
//        public class Ejercicio11 {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("A continuacion ingrese dos palabras para verificar si son iguales: ");
//                System.out.print("Ingrese la primera palabra: ");
//                String palabraUno = sc.nextLine();
//                System.out.print("Ingrese la segunda palabra: ");
//                String palabraDos = sc.nextLine();
//                if (palabraUno.equals(palabraDos)){
//                    System.out.println("Las palabras ingresadas son iguales. (Usando .equals)");
//                }else {
//                    System.out.println("Las palabras ingresadas NO son iguales. (Usando .equals)");
//                }
//                int compareStrings = palabraUno.compareTo(palabraDos);
//                if (compareStrings != 0){
//                    System.out.println("Las palabras ingresadas NO son iguales. (Usando .compareTo)");
//                }else {
//                    System.out.println("Las palabras ingresadas son iguales. (Usando .compareTo)");
//                }
//                int compareStringsNoCase = palabraUno.compareToIgnoreCase(palabraDos);
//                if (compareStringsNoCase != 0){
//                    System.out.println("Las palabras ingresadas NO son iguales. (Usando .compareToIgnoreCase)");
//                }else{
//                    System.out.println("Las palabras ingresadas son iguales. (Usando .compareToIgnoreCase)");
//                }
//         }
// -------------------------------------------------------------------------------------------------------
//  12)
//       System.out.println("ingrese una cadena de texto");
//       String cadena = sc.nextLine();
//       String extrac1 = cadena.substring(3,4);
//       String extrac2 = cadena.substring(4,5);
//       System.out.println("las palabras susstraidas son: "+ extrac1 + " y " + extrac2);
//----------------------------------------------------------------------------------------------------------
//  13)
//        String Cadena, Cadena2;
//        System.out.println("Ingrese una cadena");
//        Cadena = entrada.nextLine();
//        System.out.println("Ingrese una segunda cadena");
//        Cadena2 = entrada.nextLine();
//        System.out.println(Cadena.contains(Cadena2));
//-----------------------------------------------------------------------------------------
//  14)
//        int num = 20; // int es una variable primitiva, por que se le asignan numeros generalmente
//        Integer num2 = null; // Integer en cambio es el mismo tipo de variable que int pero envuelta como objeto, lo que permite asignarle valores diferentes
//        System.out.println(num);
//        System.out.println(num2);
//-----------------------------------------------------------------------------------------
//  15)
//        // int num = null; Es incompatible ya que no se puede convertir a entero (Error de compilacion)
//        // En cambio podemos usar Interger
//        Integer num = null; // Al ser un objeto se le puede asignar el valor null
//        System.out.println(num);
//-----------------------------------------------------------------------------------------
//  16)
//       public class Ejercicio16 {
//       public static void main(String[] args){
//                // conviertiendo variable de double a Double
//                double num = 1.5;
//                Double numDouble = new Double(num);
//                // convirtiendo de Double a double
//                Double numDouble = 1.5;
//                double num = numDouble.doubleValue();
//            }
//        }
//----------------------------------------------------------------------------------------------------------
//  17)
//        class FuncionesPrograma{
//            public static String getFechaString(Date fecha){
//                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
//                return formatoFecha.format(fecha);
//            }
//        }
//                Date fechaActual = new Date();
//                String fechaCadena = FuncionesPrograma.getFechaString(fechaActual);
//                System.out.println("La fecha actual en formato cadena es: "+fechaCadena);
//---------------------------------------------------------------------------------------------
//  18)
//        public class Actividad_18 {
//            public static Date crearFecha(int dia, int mes, int anio) {
//                Calendar calendario = Calendar.getInstance();
//                calendario.set(anio, mes - 1, dia);
//                return calendario.getTime();
//            }
//
//            public static void main(String[] args) {
//                Date fecha = crearFecha(19, 9, 24);
//                System.out.println(fecha);
//            }
//---------------------------------------------------------------------------------------------
//  19)
//        System.out.println("Bienvenido a la calculadora mas trucha");
//        System.out.println("Ingrese el primer numero: ");
//        double num = sc.nextDouble();
//        System.out.println("Ingrese el segundo numero: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Ingrese la operacion: ");
//        String operacion = sc.next();
//        switch (operacion) {
//            case "+": {
//                double resultado = sumar(num, num2);
//                System.out.println("El resultado es: " + resultado);
//                break;
//            }
//            case "-": {
//                double resultado = restar(num,num2);
//                System.out.println("El resultado es: " + resultado);
//                break;
//            }
//            case "*": {
//                double resultado = multiplicar(num,num2);
//                System.out.println("El resultado es: " + resultado);
//                break;
//            }
//            case "/": {
//                double resultado = dividir(num,num2);
//                System.out.println("El resultado es: " + resultado);
//                break;
//            }
//        }
//    }
//    private static double sumar(double num1, double num2) {
//        return num1 + num2;
//    }
//    private static double restar(double num1, double num2) {
//        return num1 - num2;
//    }
//    private static double multiplicar(double num1, double num2) {
//        return num1 * num2;
//    }
//    private static double dividir(double num1, double num2) {
//        return num1 / num2;
//    }
//
// ---------------------------------------------------------------------------------------------
//  20)
//        class Fraccion {
//            private int num;
//            private int den;
//            public Fraccion() {
//                this.num = num;
//                this.den = den;
//            }
//            //  hago publico las variables
//            public int getNumerador() {
//                return num;
//            }
//            public int getDenominador() {
//                return den;
//            }
//            public int sumaFraccion(int num, int den) {
//                return num + den;
//            }
//            public int restaFraccion(int num, int den) {
//                return num - den;
//            }
//            public int multFraccion(int num, int den) {
//                return num * den;
//            }
//            public int divFraccion(int num, int den) {
//                return num / den;
//            }
//        }
////      comando principal
//        System.out.println("!hagamos operaciones matematicas¡");
////        inicio del bucle
//         while (true) {
//             System.out.println("que operacion desea realizar?: 1)Suma/2)Resta/3)Multiplicacion/4)Divicion/5)Salir");
//             int option = sc.nextInt();
//             switch (option) {
//                 case 1: {
//                     System.out.println("ingrese los numeros a sumar");
//                     System.out.println("Ingrese el numerador");
//                     int num = sc.nextInt();
//                     System.out.println("Ingrese el denominador");
//                     int den = sc.nextInt();
//                     Fraccion fraccion = new Fraccion();
//                     int suma = fraccion.sumaFraccion(num, den);
//                     System.out.println("La suma de los numeros es: " + suma);
//                 }
//                 case 2: {
//                     System.out.println("ingrese los numeros a restar");
//                     System.out.println("Ingrese el numerador");
//                     int num = sc.nextInt();
//                     System.out.println("Ingrese el denominador");
//                     int den = sc.nextInt();
//                     Fraccion fraccion = new Fraccion();
//                     int resta = fraccion.restaFraccion(num, den);
//                     System.out.println("La resta de los numeros es: " + resta);
//                 }
//                 case 3: {
//                     System.out.println("ingrese los numeros a multiplicar: ");
//                     System.out.println("Ingrese el numerador");
//                     int num = sc.nextInt();
//                     System.out.println("Ingrese el denominador");
//                     int den = sc.nextInt();
//                     Fraccion fraccion = new Fraccion();
//                     int mult = fraccion.multFraccion(num, den);
//                     System.out.println("La multiplicacion de los numeros es: " + mult);
//                 }
//                 case 4: {
//                     System.out.println("ingrese los numeros a Dividir");
//                     System.out.println("Ingrese el numerador");
//                     int num = sc.nextInt();
//                     System.out.println("Ingrese el denominador");
//                     int den = sc.nextInt();
//                     Fraccion fraccion = new Fraccion();
//                     int div = fraccion.divFraccion(num, den);
//                     System.out.println("La divicion de los numeros es: " + div);
//                 }
//                 case 5: {
//                     System.out.println("gracias por participar");
//                     break;
//                 }
//             }
//         }
//------------------------------------------------------------------------------------
// 21)
//        class SumaRecursiva {
//            private int num;
//            public SumaRecursiva() {
//                this.num = num;
//            }
//            public int getNum(){
//                return num;
//            }
//            public int suma(int num) {
//                if (num == 1) {
//                    return 1;
//                }
//                return num + suma(num - 1); // Llamada recursiva
//            }
//        }
//        boolean positivo=true;
//        do {
//            System.out.println("ingrese un numero ");
//            int numero = sc.nextInt();
//            if (numero<0){
//                System.out.println("el numero ingresado no puede ser menor que 0, ingreselo nuevamente");
//            }else {
//                SumaRecursiva sumaR = new SumaRecursiva();
//                int resultado = sumaR.suma(numero);
//                System.out.println("La suma de los números desde " + numero + " hasta 1 es: " + resultado);
//                break;
//            }
//        }while(positivo ==true);
//----------------------------------------------------------------
//  22)
//        class SumaRecursiva {
//            private int num;
//            public SumaRecursiva() {
//                this.num = num;
//            }
//            public int getNum(){
//                return num;
//            }
//            public int sumaDigitos(int num) {
//                if (num==0) {
//                    return 0;
//                }
//                return (num % 10) + sumaDigitos(num / 10);
//            }
//        }
//        System.out.println("ingrese un numero ");
//        int numero = sc.nextInt();
//        SumaRecursiva sumaR = new SumaRecursiva();
//        int resultado = sumaR.sumaDigitos(numero);
//        System.out.println("La suma de los números ingresados es: " + resultado);
//------------------------------------------------------------------------------------------
//  23)
//        class InvertirCadena {
//            private String cadena;
//            public InvertirCadena() {
//                this.cadena =cadena;
//            }
//            public static String cadenaInversa(String cadena) {
//                if (cadena.isEmpty()) {
//                    return cadena;
//                }
//                return cadena.charAt(cadena.length() - 1) + cadenaInversa(cadena.substring(0, cadena.length() - 1));
//            }
//        }
//        System.out.println("ingrese una cadena");
//        String texto = sc.nextLine();
//        InvertirCadena cadenaI = new InvertirCadena();
//        String nuevaCadena = cadenaI.cadenaInversa(texto);
//        System.out.println("la cadena invertida es: "+ nuevaCadena);
    }
}
