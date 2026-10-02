/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio8Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                           // Crea el Scanner asociado al teclado
        System.out.print("Por favor, indique una cantidad de dinero: ");    // Solicita la cantidad en euros
        int cantidad = entrada.nextInt();                                   // Lee la cantidad (entera)
        int resto = cantidad;                                               // "resto" es el dinero que aún falta por repartir; empieza siendo todo

        int b50 = resto / 50;                                               // División entera: cuántos billetes de 50 caben
        resto = resto % 50;                                                 // Lo que sobra tras quitar esos billetes
        int b20 = resto / 20;                                               // Cuántos billetes de 20 caben en lo que queda
        resto = resto % 20;                                                 // Actualiza lo que sobra
        int b10 = resto / 10;                                               // Cuántos billetes de 10
        resto = resto % 10;                                                 // Actualiza lo que sobra
        int b5 = resto / 5;                                                 // Cuántos billetes de 5
        resto = resto % 5;                                                  // Actualiza lo que sobra
        int m2 = resto / 2;                                                 // Cuántas monedas de 2 euros
        resto = resto % 2;                                                  // Actualiza lo que sobra (será 0 o 1)
        int m1 = resto;                                                     // Lo que queda son monedas de 1 euro

        System.out.println(cantidad + " Euros se descomponen en:");         // Cabecera del desglose
        if (b50 > 0) {                                                      // Solo se muestra cada tipo si hay al menos una unidad
            System.out.println("Billetes de 50: " + b50);                   // Muestra los billetes de 50
        }
        if (b20 > 0) {                                                      // Si hay billetes de 20...
            System.out.println("Billetes de 20: " + b20);                   // ...los muestra
        }
        if (b10 > 0) {                                                      // Si hay billetes de 10...
            System.out.println("Billetes de 10: " + b10);                   // ...los muestra
        }
        if (b5 > 0) {                                                       // Si hay billetes de 5...
            System.out.println("Billetes de 5: " + b5);                     // ...los muestra
        }
        if (m2 > 0) {                                                       // Si hay monedas de 2...
            System.out.println("Monedas de 2 euros: " + m2);                // ...las muestra
        }
        if (m1 > 0) {                                                       // Si hay monedas de 1...
            System.out.println("Monedas de 1 euro: " + m1);                 // ...las muestra
        }
    }
}