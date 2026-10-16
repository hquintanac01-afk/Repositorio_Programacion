/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
 
        // Los dos números se piden una sola vez, antes del menú
        System.out.print("Introduzca el primer número: ");
        int a = entrada.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int b = entrada.nextInt();
 
        int opcion; // Opción elegida en el menú
        do {
            // Mostramos el menú en cada vuelta del bucle
            System.out.println("\n--- MENÚ ---");
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
 
            // switch según la opción; cada case termina con break para salir del switch
            switch (opcion) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    try {
                        // Si b es 0 salta ArithmeticException
                        System.out.println(a + " / " + b + " = " + (a / b));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: no se puede dividir entre 0.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    // Cualquier otro número no está en el menú
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5); // El programa solo termina con la opción 5
    }
}