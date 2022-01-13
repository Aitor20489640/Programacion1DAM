/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej18_aitor;
import java.util.*;

/**
 *
 * @author Aitor
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 (utiliza Math.random()*10).
 * Luego ordena los valores del array y los mostrará por pantalla.
 */
public class Ej18_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[30];
        int  i = 0;
        
        for (i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(num);
        
        System.out.print("Estos son los valores del vector: ");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        
    }
    
}
    
