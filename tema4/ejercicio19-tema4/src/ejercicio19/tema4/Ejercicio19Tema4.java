/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19Tema4 {

    /**
     * @param args the command line arguments
     */
  /** Pide el día de la semana. */
    public static String pedirDia() {
        String dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un dia de la semana:");
        dia = entrada.nextLine();
        return dia;
    }

    /** Devuelve la posición (1-7) o 0 si no es un día válido. equalsIgnoreCase ignora mayúsculas. */
    public static int obtenerPosicion(String dia) {
        int posicion = 0;
        if (dia.equalsIgnoreCase("Lunes")) {
            posicion = 1;
        } else if (dia.equalsIgnoreCase("Martes")) {
            posicion = 2;
        } else if (dia.equalsIgnoreCase("Miercoles")) {
            posicion = 3;
        } else if (dia.equalsIgnoreCase("Jueves")) {
            posicion = 4;
        } else if (dia.equalsIgnoreCase("Viernes")) {
            posicion = 5;
        } else if (dia.equalsIgnoreCase("Sabado")) {
            posicion = 6;
        } else if (dia.equalsIgnoreCase("Domingo")) {
            posicion = 7;
        }
        return posicion;
    }

    /** Escribe la posición del día en la semana. */
    public static void mostrarResultado(String dia, int posicion) {
        if (posicion == 0) {
            System.out.println("Error: " + dia + " no es un dia de la semana.");
        } else if (posicion == 1) {
            System.out.println("El " + dia + " es el primer dia de la semana");
        } else if (posicion == 2) {
            System.out.println("El " + dia + " es el segundo dia de la semana");
        } else if (posicion == 3) {
            System.out.println("El " + dia + " es el tercer dia de la semana");
        } else if (posicion == 4) {
            System.out.println("El " + dia + " es el cuarto dia de la semana");
        } else if (posicion == 5) {
            System.out.println("El " + dia + " es el quinto dia de la semana");
        } else if (posicion == 6) {
            System.out.println("El " + dia + " es el sexto dia de la semana");
        } else {
            System.out.println("El " + dia + " es el séptimo dia de la semana");
        }
    }

    public static void main(String[] args) {
        String dia;
        int posicion;
        dia = pedirDia();
        posicion = obtenerPosicion(dia);
        mostrarResultado(dia, posicion);
    }
}

