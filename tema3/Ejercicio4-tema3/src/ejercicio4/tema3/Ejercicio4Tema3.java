/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.tema3;
import java.util.Scanner; // Importa Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio4Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea el Scanner
        System.out.println("Ingresa el primer numero:");// Solicita el primer número
        int a = entrada.nextInt(); // Lee el primer entero en a
        System.out.println("Ingresa segundo numero:");// Solicita el segundo número
        int b = entrada.nextInt(); // Lee el segundo entero en b
        System.out.println("Ingresa un ultimo numero:"); // Solicita el tercer número
        int c = entrada.nextInt(); // Lee el tercer entero en c

        
     int menor = a;// Supone que a es el menor
        if (b < menor) { //Si b es más pequeño que el menor actual...
            menor = b;// ...b pasa a ser el menor
        }
        if (c < menor) {   // Si c es más pequeño que el menor actual (a o b)...
            menor = c; // ...c pasa a ser el menor
        }
        System.out.println("El numero menor de los introducidos es el " + menor);// Muestra el resultado
    }
}
    

