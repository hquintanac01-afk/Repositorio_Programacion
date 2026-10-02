/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.tema3;

import java.util.Scanner;

public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
             Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero: ");
        double n = entrada.nextDouble();
 
        if (n > 0) {
            System.out.println("El numero introducido es positivo");
        } else if (n < 0) {
            System.out.println("El numero introducido es negativo");
        } else {
            System.out.println("El numero introducido es cero (ni positivo ni negativo)");
        }
    }
}

       
  

    
  
