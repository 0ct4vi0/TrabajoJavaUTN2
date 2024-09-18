package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//--------------------------------------------------------------------------
// 2)A- Cunado se le asigna un valor que esta fuera de rango de una variable, ocurre un desbordamiento
//  (overflow) en el codigo y reduce su valor al minimo
//        byte b = 127;
//        System.out.println("Valor del byte antes del desbordeamiento: "+ b);
//        b++;
//        System.out.println("Valor del byte despues del desbordeamiento: "+ b);

//    B- Tambien puede ocurrir se genere un error en el codigo y este no termine de compilar
//        int[] num;
//        num= new int[3];
//        for (int i=1;i<5; i++) {
//            num[i]++;
//        }
//        for (int i=1;i<5; i++){
//            System.out.println(num[i]);
//        }
//---------------------------------------------------------------------------
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
//  12)
//        System.out.println("ingrese una cadena de texto");
//        String cadena = sc.nextLine();
//        String extrac1 = cadena.substring(3,4);
//        String extrac2 = cadena.substring(4,5);
//        System.out.println("las palabras susstraidas son: "+ extrac1 + " y " + extrac2);

//-------------------------------------------------------------------------------------------
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
//  20)
//        class Fraccion {
//            private int num;
//            private int den;
//            public Fraccion (){
//                this.num = num;
//                this.den = den;
//            }
//            //  hago publico las variables
//            public int getNumerador(){
//                return num;
//            }
//            public int getDenominador(){
//                return den;
//            }
//            public int sumaFraccion(int num, int den){
//                return num + den;
//            }
//            public int restaFraccion(int num, int den){
//                return num - den;
//            }
//            public int multFraccion(int num, int den){
//                return num * den;
//            }
//            public int divFraccion(int num, int den){
//                return num  / den;
//            }
//        }
//// comando principal
//        System.out.println("!hagamos operaciones matematicas¡");
//        boolean part = true;
////        inicio del bucle
//       do{
//            System.out.println("que operacion desea realizar?: 1)Suma/2)Resta/3)Multiplicacion/4)Divicion/5)Salir");
//            int option = sc.nextInt();
////      opcion 1 -------------------SUMA-------------
//            if (option == 1) {
//                System.out.println("ingrese los numeros a sumar");
//                System.out.println("Ingrese el numerador");
//                int num = sc.nextInt();
//                System.out.println("Ingrese el denominador");
//                int den = sc.nextInt();
//                Fraccion fraccion = new Fraccion();
//                int suma = fraccion.sumaFraccion(num,den);
//                System.out.println("La suma de los numeros es: "+suma);
////      opcion 2-------------------RESTA-------------
//            } else if (option == 2) {
//                System.out.println("ingrese los numeros a restar");
//                System.out.println("Ingrese el numerador");
//                int num = sc.nextInt();
//                System.out.println("Ingrese el denominador");
//                int den = sc.nextInt();
//                Fraccion fraccion = new Fraccion();
//                int resta = fraccion.restaFraccion(num,den);
//                System.out.println("La resta de los numeros es: "+resta);
////      opcion 3---------------MULTIPLICACION-------------
//            } else if (option == 3) {
//                System.out.println("ingrese los numeros a multiplicar: ");
//                System.out.println("Ingrese el numerador");
//                int num = sc.nextInt();
//                System.out.println("Ingrese el denominador");
//                int den = sc.nextInt();
//                Fraccion fraccion = new Fraccion();
//                int mult = fraccion.multFraccion(num,den);
//                System.out.println("La multiplicacion de los numeros es: "+mult);
////      opcion ------------------DIVICION-------------
//            } else if (option == 4) {
//                System.out.println("ingrese los numeros a Dividir");
//                System.out.println("Ingrese el numerador");
//                int num = sc.nextInt();
//                System.out.println("Ingrese el denominador");
//                int den = sc.nextInt();
//                Fraccion fraccion = new Fraccion();
//                int div = fraccion.divFraccion(num,den);
//                System.out.println("La divicion de los numeros es: "+div);
////      opcion 5-----------------SALIDA-------
//            }else{
//                System.out.println("gracias por participar");
//                break;
//            }
//       } while(part == true);
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


