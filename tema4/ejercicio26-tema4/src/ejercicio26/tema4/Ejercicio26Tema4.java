/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26Tema4 {

    /**
     * @param args the command line arguments
     */
         public static boolean esPrimo(int numero) {
        boolean primo = true;
        int divisor;

        if (numero < 2) {
            primo = false;   // 0, 1 y negativos no son primos
        } else {
            for (divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    primo = false;   // encontrado un divisor: no es primo
                }
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }
    }
}