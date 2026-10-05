/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int contador = 0;
        StringBuilder lista = new StringBuilder();
 
        // Primer impar mayor que 20 es el 21; llegamos hasta el 159 (< 160)
        for (int i = 21; i < 160; i += 2) {
            if (contador > 0) {
                lista.append(" - ");
            }
            lista.append(i);
            contador++;
        }
 
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son: " + lista);
        System.out.println("La cantidad de numeros impares impresos han sido: " + contador);
    }
}
