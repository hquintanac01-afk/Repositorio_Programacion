/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25.tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio25Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int suma = 0;
        // Pares entre 17 y 139: del 18 al 138
        for (int i = 18; i < 139; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los pares entre 17 y 139 es: " + suma);
    }
}
