/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio24Tema3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int n;
        do {
            System.out.print("Introduzca un numero mayor que 0: ");
            n = entrada.nextInt();
            if (n <= 0) {
                System.out.println("Error: el numero debe ser mayor que 0.");
            }
        } while (n <= 0);
 
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Total de multiplos de 3 mostrados: " + contador);
    }
}

