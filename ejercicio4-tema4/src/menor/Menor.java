/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menor;

/**
 *
 * @author alumno
 */
public class Menor {
        public static void imprimeMenor(double a, double b, double c) {
        int menor = (int) Math.min(a, Math.min(b, c));
        System.out.println("El numero menor de los introducidos es el " + menor);
    }
}


