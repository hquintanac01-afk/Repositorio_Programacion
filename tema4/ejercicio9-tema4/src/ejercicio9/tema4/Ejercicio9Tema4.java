/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.tema4;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = Metodos.pedirNumero("Por favor, introduzca el primer numero: ");
        int n2 = Metodos.pedirNumero("Ahora, introduzca un segundo numero: ");
        int n3 = Metodos.pedirNumero("Por último, introduzca un tercer numero: ");
        Metodos.mostrarMenor(n1, n2, n3);
    }
}

