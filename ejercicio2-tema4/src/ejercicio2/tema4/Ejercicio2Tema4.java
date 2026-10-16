/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Por favor, introduzca un numero:");
            int num1 = entrada.nextInt();
         System.out.println("Ahora, introduzca un segundo numero:");
            int num2 = entrada.nextInt();
            
            if (num1 > 10){
                operaciones.suma(num1, num2);
            } else {
                operaciones.multiplica(num1,num2);
            }
    }
    
}
