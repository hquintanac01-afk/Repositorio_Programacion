/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio18Tema3 {
  final static String CONTRASENA = "1234"; // Contrasena correcta
    final static int MAX_INTENTOS = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        String intento;
        int intentos = 0; // creamos variables
        boolean acertada = false;
 
        do {
            System.out.print("Introduzca la contrasena: "); 
            intento = entrada.nextLine();
            intentos++;
 
            if (intento.equals(CONTRASENA)) {
                acertada = true;
            } else if (intentos < MAX_INTENTOS) {
                System.out.println("Contrasena incorrecta. Le quedan " + (MAX_INTENTOS - intentos) + " intentos.");
            }
        } while (!acertada && intentos < MAX_INTENTOS);
 
        if (acertada) {
            System.out.println("Enhorabuena, ha accedido correctamente.");
        } else {
            System.out.println("Error de acceso: ha fallado 3 veces la contrasena.");
        }
        entrada.close();
    }
}
