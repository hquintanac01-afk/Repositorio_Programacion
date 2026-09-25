/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15.tema2;

/**
 *
 * @author alumno
 */
public class Ejercicio15Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int segundos = 10000, minutos, horas;
        
        horas = segundos / 3600;
        segundos = segundos % 3600;
        
        minutos = segundos / 60;
        segundos = segundos % 60;
        
         System.out.println("10.000 segundos hacen un total de: "
                + horas + " horas, "
                + minutos + " minutos y "
                + segundos + " segundos.");
        
    }
    
}
