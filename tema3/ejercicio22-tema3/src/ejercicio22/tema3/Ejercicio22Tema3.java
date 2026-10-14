/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio22Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        try {
               System.out.println("Introduce el primer numero:");
                int a = entrada.nextInt();  
                System.out.println("Introduce el segundo numero:");
                int b = entrada.nextInt();
                int c = a + b;
                System.out.println(a + " + " + b + " = " + c);
            } catch (InputMismatchException e) {
              System.out.println("Error: eso es una letra, no un numero(" + e.getMessage() + ")");
        }
    }
}
