/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in); // Crea el Scanner asociado al teclado
        System.out.print("Por favor, introduzca un numero: "); // Solicita un número
        int n = entrada.nextInt();  // Lee el entero y lo guarda en n

        if (n % 2 == 0) { // % devuelve el resto de la división: si el resto entre 2 es 0, es par
            System.out.println("El numero " + n + " es par"); // Informa de que es par
        } else {                                                            // Si el resto no es 0...
            System.out.println("El numero " + n + " es impar");// ...es impar
        }
    }
}

    
    
