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
     * @param nota
     * @param args the command line arguments
     */  
    public static void calificacion(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10");
        } else if (nota <= 4) {
            System.out.println("Calificacion: Suspenso");
        } else if (nota <= 6) {
            System.out.println("Calificacion: Bien");
        } else if (nota <= 8) {
            System.out.println("Calificacion: Notable");
        } else {
            System.out.println("Calificacion: Sobresaliente");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la nota del alumno (0-10): ");
        int nota = entrada.nextInt();
        calificacion(nota);
    }
}
    
    

