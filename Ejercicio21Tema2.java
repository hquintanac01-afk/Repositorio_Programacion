/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21.tema2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21Tema2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
 
        System.out.print("Por favor, introduzca un numero de segundos: ");
        long segundos = entrada.nextLong();
 
        long dias = segundos / 86400;
        long resto = segundos % 86400;
 
        long horas = resto / 3600;
        resto = resto % 3600;
 
        long minutos = resto / 60;
        long segundosRestantes = resto % 60;
 
        System.out.println(segundos + " segundos hacen un total de : " + dias
                + " dias, " + horas + " horas, " + minutos + " minutos y "
                + segundosRestantes + " segundos.");
    }
    
}
