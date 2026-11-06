/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema4 {

    /**
     * @param args the command line arguments
     */
         /** Pide el número y lo repite hasta que sea mayor que 0. */
    public static int pedirNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduzca un número mayor que 0:");
            numero = entrada.nextInt();
            if (esMayorQueCero(numero) == false) {
                System.out.println("Error: el número debe ser mayor que 0.");
            }
        } while (esMayorQueCero(numero) == false);
        return numero;
    }

    /** Método de tipo boolean: true si el número es mayor que 0. */
    public static boolean esMayorQueCero(int numero) {
        boolean resultado;
        resultado = numero > 0;
        return resultado;
    }

    /** Hace los cálculos y muestra los múltiplos de 3 y cuántos hay. */
    public static void mostrarMultiplos(int limite) {
        int i;
        int total = 0;   // contador de múltiplos mostrados
        for (i = 1; i <= limite; i++) {
            if (i % 3 == 0) {   // múltiplo de 3: el resto de dividir entre 3 es 0
                System.out.println(i);
                total++;
            }
        }
        System.out.println("Total de números mostrados: " + total);
    }

    public static void main(String[] args) {
        int limite;
        limite = pedirNumero();
        mostrarMultiplos(limite);
    }
}
    
    

