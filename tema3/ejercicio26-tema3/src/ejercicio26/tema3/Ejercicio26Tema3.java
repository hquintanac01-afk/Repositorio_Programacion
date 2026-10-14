/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26.tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio26Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int suma = 0;
        // Impares entre 111 y 222 (sin incluir los extremos): del 113 al 221
        for (int i = 113; i < 222; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los impares entre 111 y 222 es: " + suma);
    }
    
}
