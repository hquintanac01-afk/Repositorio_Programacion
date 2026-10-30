/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema4 {

    /**
     * @param args the command line arguments
     */
     // Códigos ASCII de la 'a' (97) y la 'z' (122)
    static final int ASCII_A = 97;
    static final int ASCII_Z = 122;

    static Scanner entrada = new Scanner(System.in);

    /**
     * Genera una letra minúscula aleatoria.
     * Math.random() da un double en [0,1); lo multiplicamos por 26 letras,
     * lo pasamos a int (0-25) y le sumamos 97 para obtener el código de 'a'..'z'.
     */
    public static char generarLetra() {
        int codigo = ASCII_A + (int) (Math.random() * (ASCII_Z - ASCII_A + 1));
        return (char) codigo;   // convertimos el código ASCII a char
    }

    /**
     * Pide una letra al usuario y la devuelve.
     * Si el usuario pulsa Enter sin escribir nada, se vuelve a pedir
     * (charAt(0) daría error con una cadena vacía).
     */
    public static char pedirLetra() {
        String texto;
        do {
            System.out.print("Introduzca una letra minuscula: ");
            texto = entrada.nextLine();
        } while (texto.isEmpty());
        return texto.charAt(0);   // nos quedamos con el primer carácter
    }

    /**
     * Compara el intento con la letra secreta y muestra la pista.
     * Devuelve true si ha acertado.
     * Los char se pueden comparar con <, > e == porque se comparan por su código ASCII.
     */
    public static boolean comprobar(char intento, char secreta) {
        if (intento == secreta) {
            return true;
        }
        if (secreta < intento) {
            System.out.println("La letra secreta esta ANTES en el alfabeto.");
        } else {
            System.out.println("La letra secreta esta DESPUES en el alfabeto.");
        }
        return false;
    }

    /** Muestra el mensaje final con el número de intentos. */
    public static void mostrarResultado(char secreta, int intentos) {
        System.out.println("¡Correcto! La letra era '" + secreta + "'.");
        System.out.println("Has necesitado " + intentos + " intentos.");
    }

    public static void main(String[] args) {
        char secreta = generarLetra();
        int intentos = 0;
        boolean acertada = false;

        System.out.println("He pensado una letra minuscula entre a y z. ¡Adivinala!");

        // Se repite hasta que el usuario acierte
        while (!acertada) {
            char intento = pedirLetra();
            intentos++;
            acertada = comprobar(intento, secreta);
        }
        mostrarResultado(secreta, intentos);
    }
}
