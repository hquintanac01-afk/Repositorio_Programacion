/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio11Tema4 {

    /**
     * @param args the command line arguments
     */
   static Scanner entrada = new Scanner(System.in);

    /**
     * Pide un número y lo vuelve a pedir mientras sea negativo
     * (la raíz cuadrada de un negativo no existe en los reales).
     */
    public static double pedirNumero() {
        double numero;
        // do-while: el cuerpo se ejecuta al menos una vez
        do {
            System.out.print("Introduzca un numero (no negativo): ");
            numero = entrada.nextDouble();
            if (numero < 0) {
                System.out.println("Error: el numero no puede ser negativo.");
            }
        } while (numero < 0);   // se repite mientras el dato sea inválido
        return numero;
    }

    /** Calcula la raíz cuadrada usando el método estático Math.sqrt(). */
    public static int calcularRaiz(int numero) {
        return (int) Math.sqrt(numero);
    }

    /** Muestra el número original y su raíz. */
    public static void mostrarResultado(int numero, int raiz) {
        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
    }

    public static void main(String[] args) {
        int numero = (int) pedirNumero();
        int raiz = calcularRaiz(numero);
        mostrarResultado(numero, raiz);
    }
}