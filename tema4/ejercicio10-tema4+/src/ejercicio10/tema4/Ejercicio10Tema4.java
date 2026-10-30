/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio10Tema4 {

    /**
     * @param args the command line arguments
     */

    /**
     * Pide un número al usuario y lo devuelve (método de tipo int).
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        return entrada.nextInt();
    }

    /**
     * Recibe el número por parámetro e imprime su tabla del 0 al 10.
     */
    public static void mostrarTabla(int numero) {
        // Bucle para recorrer el multiplicador desde 0 hasta 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        int numero = pedirNumero(); // Guardamos el número que devuelve el método
        mostrarTabla(numero);       // Lo pasamos al otro método
    }
}
