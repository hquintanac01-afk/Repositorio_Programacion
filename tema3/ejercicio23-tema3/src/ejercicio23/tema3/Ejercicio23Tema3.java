/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int n;
        do {
            System.out.print("Introduzca un numero mayor que 1: ");
            n = entrada.nextInt();
            if (n <= 1) {
                System.out.println("Error: el número debe ser mayor que 1.");
            }
        } while (n <= 1);
 
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
