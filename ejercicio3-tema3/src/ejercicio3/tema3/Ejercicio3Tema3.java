/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.tema3;
import java.util.Scanner; // Importa Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio3Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Crea el Scanner
        System.out.print("Por favor, introduzca el primer numero: ");//Solicita el primer número
        int a = entrada.nextInt(); // Lee el primer entero en a
        System.out.print("Ahora, introduzca un segundo numero: ");// Solicita el segundo número
        int b = entrada.nextInt();//Lee el segundo entero en b
        System.out.print("Por ultimo, introduzca un tercer numero: ");// Solicita el tercer número
        int c = entrada.nextInt();// Lee el tercer entero en c

        int mayor = a;// Supone que a es el mayor
        if (b > mayor) {// Si b supera al mayor actual...
            mayor = b;// ...b pasa a ser el mayor
        }
        if (c > mayor) {  // Si c supera al mayor actual (a o b)...
            mayor = c; // ...c pasa a ser el mayor
        }
        System.out.println("El numero mayor de los introducidos es el " + mayor);// Muestra el resultado
    }
}
    
    

