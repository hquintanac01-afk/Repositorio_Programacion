/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22.tema2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio22Tema2 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Por favor introduzca la medida de un lado:");
       double lado = entrada.nextDouble();
       
       double perimetro = lado * 3;
       double area = (lado * lado * Math.sqrt(3)) /4;
       
       System.out.println("El area de un triangulo de lado: " + lado + " es: " + area);
       System.out.println("El perimetro de un triangulo de lado: " + lado + " es: " + perimetro);
       
    }
    
}
