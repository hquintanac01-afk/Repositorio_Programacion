/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio29Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Programa que juega con el usuario a adivinar un número entre 1 y 100
        Scanner entrada = new Scanner(System.in); // Creo el objeto para leer por teclado
        int secreto = (int) Math.floor(Math.random() * 100) + 1; // Genero el número que hay que adivinar
        int numero; // Declaro la variable donde guardo lo que escribe el usuario
        int intentos = 0; // Inicializo a 0 el contador de intentos
        System.out.println("He pensado un numero entre 1 y 100. Adivinalo!");
        do {
            System.out.println("Introduce un numero:");
            numero = entrada.nextInt(); // Leo el número del usuario
            intentos++; // Sumo 1 a los intentos
            if (numero < secreto) {
                System.out.println("El numero que buscas es mayor");
            } else if (numero > secreto) {
                System.out.println("El numero que buscas es menor");
            }
        } while (numero != secreto); // Repito mientras no lo adivine
        System.out.println("Enhorabuena! Lo has adivinado en " + intentos + " intentos");
    }
}
