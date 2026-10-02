/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                           // Crea el Scanner asociado al teclado
        System.out.print("Introduzca la nota del alumno (0-10): ");         // Solicita la nota
        int nota = entrada.nextInt();                                       // Lee la nota como entero

        if (nota < 0 || nota > 10) {                                        // || significa "o": nota fuera del rango válido 0-10
            System.out.println("Error: la nota debe estar entre 0 y 10");   // Mensaje de error por nota no válida
        } else if (nota <= 4) {                                             // Nota válida entre 0 y 4
            System.out.println("Suspenso");                                 // Menos de 5: suspenso
        } else if (nota <= 6) {                                             // Nota entre 5 y 6 (el 0-4 ya se descartó arriba)
            System.out.println("Bien");                                     // 5 o 6: bien
        } else if (nota <= 8) {                                             // Nota entre 7 y 8
            System.out.println("Notable");                                  // 7 u 8: notable
        } else {                                                            // Solo quedan 9 y 10
            System.out.println("Sobresaliente");                            // 9 o 10: sobresaliente
        }
    }
}
    
   
