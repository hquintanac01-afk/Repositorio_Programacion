/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.tema4;
import java.util.Scanner;
import comparador.Comparador;
/**
 *
 * @author alumno
 */
public class Ejercicio3Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero:");
            int n1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
            int n2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un tercer numero:");
            int n3 = entrada.nextInt();
             
             Comparador.imprimeMayor(n1,n2,n3);
    }
    
}
