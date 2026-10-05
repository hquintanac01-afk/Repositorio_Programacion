/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19.tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio19Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 3, b = 6, c;

    c = a / b;
    System.out.println("El valor de c es: " + c); // 0

    c = a % b;
    System.out.println("El valor de c es: " + c); // 3

    a++;
    System.out.println("El valor de a es: " + a); // 4

    ++a;
    System.out.println("El valor de a es: " + a); // 5

    c = ++a + b++;
    System.out.println("El valor de a es: " + a); // 6
    System.out.println("El valor de b es: " + b); // 7
    System.out.println("El valor de c es: " + c); // 12

    c = ++a + ++b;
    System.out.println("El valor de a es: " + a); // 7
    System.out.println("El valor de b es: " + b); // 8
    System.out.println("El valor de c es: " + c); // 15
    }
    
}
