/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1Tema4 {
  public static void positivoONegativo(double numero) {
        if (numero > 0) {
            System.out.println("El número introducido es positivo");
        } else if (numero < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número introducido es cero (ni positivo ni negativo)");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero: ");
        double numero = entrada.nextDouble();
        positivoONegativo(numero);
    }
}

