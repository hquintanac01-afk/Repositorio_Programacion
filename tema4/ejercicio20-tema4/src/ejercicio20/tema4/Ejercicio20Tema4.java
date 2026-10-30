/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20Tema4 {

    // Soluciones como constantes
    static final String CAPITAL = "Madrid";
    static final String DESCUBRIDOR = "Colón";

    /** Pregunta 1: devuelve 5 si acierta y 0 si falla. */
    public static int pregunta1() {
        String respuesta;
        int puntos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?:");
        respuesta = entrada.nextLine();
        if (respuesta.equalsIgnoreCase(CAPITAL)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + CAPITAL);
        }
        return puntos;
    }

    /** Pregunta 2: devuelve 5 si acierta y 0 si falla. */
    public static int pregunta2() {
        String respuesta;
        int puntos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?:");
        respuesta = entrada.nextLine();
        if (respuesta.equalsIgnoreCase(DESCUBRIDOR)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + DESCUBRIDOR);
        }
        return puntos;
    }

    public static void main(String[] args) {
        int nota;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        nota = pregunta1();
        nota = nota + pregunta2();   // nota final: 0, 5 o 10
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
}


