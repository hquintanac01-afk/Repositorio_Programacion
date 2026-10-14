/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer divisor:");
        int a = entrada.nextInt();
        System.out.println("Introduce el segundo divisor:");
        int b = entrada.nextInt();
        try {
            int c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0 (" + e.getMessage() + ")");
        }
    }
    
}
