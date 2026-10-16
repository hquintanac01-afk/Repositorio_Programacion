/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparador;

/**
 *
 * @author alumno
 */
public class Comparador {
    public static void imprimeMayor(double a, double b, double c) {
        int mayor = (int) Math.max(a, Math.max(b, c));
        System.out.println("El numero mayor de los introducidos es el " + mayor);
    }
}

