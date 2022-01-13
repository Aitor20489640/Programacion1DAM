/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej05c_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * Necesitamos crear un programa para registrar sueldos de hombres
 * y mujeres de una empresa y detectar si existe brecha salarial entre ambos. El
 * programa pedirá por teclado la información de N personas distintas (valor
 * también introducido por teclado). Para cada persona, pedirá su género (0 para
 * varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una
 * única matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
 */
public class Ej05C_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldos[][];
        int n, g, media, m = 0, h = 0, salir = 0;
        
        System.out.println("Bienvenido a un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe brecha salarial entre ambos");
        System.out.print("Introduzca cuantos sueldos va a introducir:");
        n = sc.nextInt();
        sueldos = new int[2][n];
        
        do{
            System.out.print("Introduzca su genero (0 para hombre y 1 para mujer): ");
            g = sc.nextInt();
            switch(g){
                case 0:
                    while(h < sueldos[0][h]){
                        System.out.print("Introduzca su sueldo: ");
                        sueldos[0][h] = sc.nextInt();
                        h++;
                        salir++;
                    }
                    break;
                case 1:
                    while(m < sueldos[1][m]){
                        System.out.print("Introduzca su sueldo: ");
                        sueldos[0][m] = sc.nextInt();
                        m++;
                        salir++;
                    }
            }
            
        }while (salir == n);
        
        
    }
    
}
