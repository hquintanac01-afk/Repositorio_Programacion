/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.tema2;
import java.util.Scanner;
/**
 *
 * @author TRENDING PC
 */
public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        double precio;    // double porque el precio puede tener decimales
        int unidades;     // int porque las unidades son un número entero
        double total;     // double porque el total también puede tener decimales

      
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");   // Pedimos el precio al usuario (print no salta de línea, así se escribe a continuación)
        precio = entrada.nextDouble();   // Leemos un número decimal

        // Pedimos el número de unidades
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada.nextInt();    // Leemos un número entero

     
        total = precio * unidades; // Calculamos el total: precio por unidad multiplicado por el número de unidades
        // (el int se convierte automáticamente a double: conversión implícita)

       
        System.out.println("El precio total de su compra es de: " + total + " Euros."); // Mostramos el resultado concatenando texto y variables con el operador +
    }
}