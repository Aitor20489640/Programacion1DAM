/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16_aitor;
import java.util.*;

/**
 *
 * @author Aitor
 * Crea un programa que cree un array de enteros e introduzca la * siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
 * En esta ocasión has de utilizar Arrays.fill().

 */
public class Ej16_Aitor {

    
    public static void main(String[] args) {
        int num[] = new int[55];
        int i= 0;
        
        Arrays.fill(num, 0, 1, 1);
        Arrays.fill(num, 1, 3, 2);
        Arrays.fill(num, 3, 6, 3);
        Arrays.fill(num, 6, 10, 4);
        Arrays.fill(num, 10, 15, 5);
        Arrays.fill(num, 15, 21, 6);
        Arrays.fill(num, 21, 28, 7);
        Arrays.fill(num, 28, 36, 8);
        Arrays.fill(num, 36, 45, 9);
        Arrays.fill(num, 45, 55, 10);
                
        System.out.println("Este es el valor del vector.");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}
