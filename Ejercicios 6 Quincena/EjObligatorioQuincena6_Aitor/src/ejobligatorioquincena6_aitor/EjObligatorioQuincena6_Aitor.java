/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejobligatorioquincena6_aitor;
import java.util.*;

/**
 *
 * @author aitor
 */
public class EjObligatorioQuincena6_Aitor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[8];
        
        System.out.println("Bienvenido");
        entradaNombres(nombres);
        
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
      
    }
    
    public static void entradaNombres(String[] nombres){
        Scanner sc = new Scanner(System.in);
        nombres = new String[8];
        for (int i = 0; i < 8; i++){
            System.out.print("Introduzca el nombre de un estudiante: ");
            nombres[i] = sc.nextLine();
            
        }
    }
    
}
