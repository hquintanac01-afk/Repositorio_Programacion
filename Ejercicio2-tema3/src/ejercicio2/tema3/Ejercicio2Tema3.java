/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
   System.out.print("Por favor, introduzca un numero: ");
        int a = entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");
        int b = entrada.nextInt();
 
        if (a > 10) {
            System.out.println("La operacion que se realizo es producto y el resultado es " + (a * b));
        } else {
            System.out.println("La operacion que se realizo es suma y el resultado es " + (a + b));
        }
    }
}
   
