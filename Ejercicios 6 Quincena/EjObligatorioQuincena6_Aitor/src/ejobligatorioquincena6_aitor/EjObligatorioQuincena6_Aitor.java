/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejobligatorioquincena6_aitor;
import java.util.Scanner;
import java.util.Arrays;
import metodos.meto;

/**
 *
 * @author aitor
 */
public class EjObligatorioQuincena6_Aitor {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[8];
        char alu[][] = new char[2][3];
        
        System.out.println("Bienvenido");
        meto.inputNombres(nombres);
        System.out.println("El vector es: "+ Arrays.toString(nombres));
        meto.inputAlumnos(alu);
    }
    
}
