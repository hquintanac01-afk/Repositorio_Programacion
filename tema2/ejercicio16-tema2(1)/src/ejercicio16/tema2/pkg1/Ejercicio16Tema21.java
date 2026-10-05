/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.tema2.pkg1;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dinero = 130;
      int billetes50;
      int billetes10;
      
      billetes50 = dinero / 50;
      billetes10= (dinero % 50)/ 10;
      
      System.out.println("130 euros hacen un total de: "
                + billetes50 + " billetes de 50 euros y "
                + billetes10 + " billetes de 10 euros.");
    }
    
}
