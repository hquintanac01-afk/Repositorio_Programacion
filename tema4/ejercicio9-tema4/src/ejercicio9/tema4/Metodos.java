/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Metodos {
        static Scanner entrada = new Scanner(System.in);

    public static int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextInt();
    }

    public static void mostrarMenor(int a, int b, int c) {
        int menor = Math.min(a, Math.min(b, c));
        System.out.println("El numero menor de los introducidos es el " + menor);
    }
}

