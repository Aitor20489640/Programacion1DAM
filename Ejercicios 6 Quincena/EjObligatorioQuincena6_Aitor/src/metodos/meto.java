/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class meto {
    
    /**
     * Metodo para introducir nombres en un vector de Strings.
     * @param n vector donde se guardaran los nombres. 
     */
    
    public static void inputNombres(String[] n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.print("Introduzca el nombre de un estudiante: ");
            n[i] = sc.nextLine();

        }
    }
    
    /**
     * Metodo para intoducir las respuestas correctas a la preguntas del examen.
     * @param c vector donde se guardaran las respuestas correctas
     */
    
    public static void inputCorrectas(char[] c){
        Scanner sc = new Scanner(System.in);
        char carac;
        boolean correcto = true;
        for (int i = 0; i < c.length; i++){
            System.out.print("Introduce la respuesta correcta a la pregunta "+(i+1)+": ");
            carac = sc.nextLine().charAt(0);
            switch(carac){
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                    c[i] = carac;
                    break;
                default:
                    do{
                        System.out.print("Introduzca una opcion valida: ");
                        carac = sc.nextLine().charAt(0);
                        switch (carac) {
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                                c[i] = carac;
                                correcto = false;
                                break;
                        }
                    }while(correcto);
                    
            }
        }
    }
    
    /**
     * Metodo para introducir las respuestas de los alumnos.
     * @param c matriz donde se guardaran las respuestas de los alumnos.
     */
    
    public static void inputAlumnos(char[][] c){
        Scanner sc = new Scanner(System.in);
        char carac;
        boolean correcto = true;
        for (int i = 0; i < c.length; i++){
            System.out.println("Pon las respuestas del alumno "+(i + 1)+": ");
            for (int j = 0; j < c[0].length; j++){
                System.out.print("Escribe la respuesta a la pregunta "+(j + 1)+": ");
                carac = sc.nextLine().charAt(0);
                switch (carac) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                        c[i][j] = carac;
                        break;
                    default:
                        do {
                            System.out.print("Introduzca una opcion valida: ");
                            carac = sc.nextLine().charAt(0);
                            switch (carac) {
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                    c[i][j] = carac;
                                    correcto = false;
                                    break;
                            }
                        } while (correcto);

                }
            }
            System.out.println("");
        }
    }
    
}
