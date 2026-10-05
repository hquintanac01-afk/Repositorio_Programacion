/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                           // Crea el Scanner asociado al teclado
        System.out.print("Por favor, introduzca el primer numero: ");       // Solicita el primer número
        int a = entrada.nextInt();                                          // Lee el primer entero en a
        System.out.print("Ahora, introduzca un segundo numero: ");          // Solicita el segundo número
        int b = entrada.nextInt();                                          // Lee el segundo entero en b
        System.out.print("Introduzca el tercer numero: ");                  // Solicita el tercer número
        int c = entrada.nextInt();                                          // Lee el tercer entero en c
        System.out.print("Por último, introduzca un cuarto numero: ");      // Solicita el cuarto número
        int d = entrada.nextInt();                                          // Lee el cuarto entero en d

        int aux;                                                            // Variable auxiliar para intercambiar dos valores sin perder ninguno
      
        for (int pasada = 1; pasada <= 3; pasada++) {                       // Repite el proceso 3 veces; cada pasada "sube" el mayor restante hacia el final
            if (a > b) {                                                    // Si a y b están desordenados (a mayor que b)...
                aux = a;                                                    // ...guarda a en aux
                a = b;                                                      // ...pone b en a
                b = aux;                                                    // ...y recupera el antiguo a en b (intercambio hecho)
            }
            if (b > c) {                                                    // Compara el segundo con el tercero
                aux = b;                                                    // Intercambio de b y c con aux
                b = c;                                                      // b toma el valor menor
                c = aux;                                                    // c toma el valor mayor
            }
            if (c > d) {                                                    // Compara el tercero con el cuarto
                aux = c;                                                    // Intercambio de c y d con aux
                c = d;                                                      // c toma el valor menor
                d = aux;                                                    // d toma el valor mayor
            }
        }
        System.out.println("El orden de los numeros introducidos es el " + a + " - " + b + " - " + c + " - " + d); // Muestra los números ya ordenados de menor a mayor
    }
}

