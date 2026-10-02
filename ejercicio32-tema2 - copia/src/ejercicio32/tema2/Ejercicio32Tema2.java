/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32.tema2;
import java.util.Scanner;
/**
 *
 * @author TRENDING PC
 */
public class Ejercicio32Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        int cantidad;   // Importe que introduce el usuario
        int resto;      // Dinero que queda por repartir en cada paso
        int billetes50, billetes20, billetes10, billetes5;  // Número de billetes de cada tipo
        int monedas2, monedas1;                              // Número de monedas de cada tipo

        // Pedimos la cantidad al usuario
        System.out.print("Por favor, indique una cantidad de dinero: ");
        cantidad = entrada.nextInt();

        // Billetes de 50: dividimos entre 50 (división entera, se descartan los decimales)
        billetes50 = cantidad / 50;
        // Lo que sobra tras repartir los billetes de 50 (resto de la división)
        resto = cantidad % 50;

        // Billetes de 20: repetimos el proceso con lo que sobró
        billetes20 = resto / 20;
        resto = resto % 20;

        // Billetes de 10
        billetes10 = resto / 10;
        resto = resto % 10;

        // Billetes de 5
        billetes5 = resto / 5;
        resto = resto % 5;

        // Monedas de 2 euros
        monedas2 = resto / 2;
        // Lo que sobra ya solo puede ser 0 o 1, que son las monedas de 1 euro
        monedas1 = resto % 2;

        // Mostramos el resultado completo en una sola línea
        System.out.println(cantidad + " Euros se descomponen en " + billetes50
                + " billetes de 50, " + billetes20 + " billetes de 20, "
                + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, "
                + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");
    }
}

   
