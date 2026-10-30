/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.tema4;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
         raizCuadrada();
         elevarCubo();
         exponencial();
         logaritmo();
         valorMenor();
    }
       public static void raizCuadrada(){
        System.out.println("Raiz cuadrada de 64: " + Math.sqrt(64));
    }
    public static void elevarCubo(){
        System.out.println("8 elevado al cubo es: " + Math.pow(8, 3));
    }
    public static void exponencial(){
        System.out.println("El exponencial de 2 es: " + Math.exp(2));
    }
    public static void logaritmo(){
        System.out.println("El logaritmo de 2,71828 es: " + Math.log(2.71828));
    }
    public static void valorMenor(){
        System.out.println("El valor menor es: " + Math.min(2, 3));
    }
}
   

        
    
    

