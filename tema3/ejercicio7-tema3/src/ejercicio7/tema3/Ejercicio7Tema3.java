/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);                           // Crea el Scanner asociado al teclado
        System.out.print("Introduzca el dia de la semana (1-7): ");         // Solicita el día (1 = lunes ... 7 = domingo)
        int diasemana = entrada.nextInt();                                  // Lee el día como entero
        boolean laborable = false; // valor inicial para que compile con cualquier entrada // Java exige que la variable tenga valor antes de usarla; si el día no es 1-7 el switch no la asigna

        switch (diasemana) {                                                // Compara diasemana con cada case
            case 1, 2, 3, 4, 5 -> // Si vale 1 (lunes)... no hay break, así que "cae" al siguiente case
                laborable = true; // Es día laborable
            case 6, 7 -> // ...o 2 (martes)...
                // ...o 7 (domingo):
                laborable = false; // No es laborable (es fin de semana)
        }
      
        if (diasemana < 1 || diasemana > 7) {                               // Comprueba primero si el número está fuera de rango
            System.out.println("Ese dia no existe");                        // Mensaje de error
        } else if (laborable) {                                             // Si es válido y laborable es true...
            System.out.println("Es un dia laborable");                      // ...es de lunes a viernes
        } else {                                                            // Si es válido y laborable es false...
            System.out.println("Es fin de semana (no laborable)");          // ...es sábado o domingo
        }
    }
}
