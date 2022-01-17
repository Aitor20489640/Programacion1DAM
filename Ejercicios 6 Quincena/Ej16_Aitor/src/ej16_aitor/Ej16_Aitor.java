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
        int num[];
        int i, j, cuantos = 0, pos = 0;
        
        for(i = 1; i <= 10; i++){
            cuantos += i;
        }
        
        num = new int[cuantos];
        
        for (i = 1; i <= 10; i++) {
            Arrays.fill(num, pos, pos + i, i);
            pos += i;
        }

                
        System.out.println("Este es el valor del vector.");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}
