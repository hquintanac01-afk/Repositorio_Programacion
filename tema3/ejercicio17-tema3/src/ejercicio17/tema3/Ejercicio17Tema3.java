/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio17Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        double numero;
 
        do {
            System.out.print("Introduzca un numero para calcular su raiz cuadrada: ");
            numero = entrada.nextDouble();
            if (numero < 0) {
                System.out.println("Error: no se puede calcular la raiz cuadrada de un numero negativo. Intentelo de nuevo.");
            }
        } while (numero < 0);
 
        System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
        entrada.close();
    }
}

