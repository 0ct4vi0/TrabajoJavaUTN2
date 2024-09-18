/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_18;

/**
 *
 * @author Pc-Gamers
 */
import java.util.Date;
import java.util.Calendar;

public class Actividad_18 {
public static Date crearFecha(int dia, int mes, int anio ) {
Calendar calendario =  Calendar.getInstance();
calendario.set(anio, mes-1, dia );
return calendario.getTime(); 
}

    public static void main(String[] args) {
        Date fecha = crearFecha(19, 9, 24); 
        System.out.println(fecha);
    }
}
