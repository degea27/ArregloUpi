
package arregloupi;

import java.util.Scanner;


public class ArregloUPI {

  
    public static void main(String[] args) {
      
        int[] arreglo = new int[5]; 
        int [] vector;
        float [] notas = new float[]{50.4f,100,65.3f,40,30};
        System.out.println(notas.length);
        
        String[] nombres = new String[]{"Paul", "George", "John", "Ringo"};
        String[] banda = new String[]{"Tre", "Mike", "Billie Joe", "Raj", "Al Sobrante" };
        
        for (int i = 0; i < 4; i++) {
            System.out.println(banda[i]);
        }
        
        int indice = 0;
        while (indice < 4 ) {
            System.out.println(nombres[indice]);
            indice++;
        }
        
        for (int i = 3; i >= 0; i--) {
             System.out.println(nombres[i]);
        }
        
        System.out.println("Estudiante       Nota");
        System.out.println("---------------------");
        for (int i = 0; i < banda.length ; i++) {
            System.out.println(banda[i] + "           " + notas[i]);   
        }
        
        // cuantos estudiantes tienen una nota superior al promedio?
        // calcular el promedio = sumatorianotas/cantidad
        // comparacion de las notas con el promedio
        // Resultado = cantidad de estudiantes con nota superior
        
        indice = 0;
        float promedio = 0f;
        while (indice <= 4 ) {
            promedio+=notas[indice]; // acumulador 
            indice++;
        }
        promedio/=notas.length;
        System.out.println("El promedio: " + promedio);
        
        int contador =0;
        for (int i = 0; i < 5; i++) {
            if (notas[i] > promedio) {
               contador++;    // contador de estudiantes
            }
        }
        
        System.out.println("La cantidad de estudiantes:" + contador);
         System.out.print("\n");
          System.out.print("\n");
          
          Scanner leer = new Scanner(System.in);
          System.out.println("Digite una fila:");
          int leerfila = leer.nextInt();
          System.out.println("Digite una columna");
          int leercol = leer.nextInt();
          
        int [][] matriz = new int [5][5];
        contador = 25;
        int sumatoria = 0;
        int sumacol = 0;
        int sumafil = 0;
        for (int fila = 4; fila>=0; fila--) {
            for (int col = 4; col>=0; col--) {
               matriz[fila][col] = contador--;
                System.out.print(matriz[fila][col] + "   ");
                sumatoria+=matriz[fila][col];
                if (col==leercol) {
                    sumacol+=matriz[fila][col];
                }
                if (fila==leerfila) {
                     sumafil+=matriz[fila][col];
                }
            }
           System.out.print("\n");
        }
        System.out.println(" sumatoria total: " + sumatoria);
        System.out.println(" Suma columna " + leercol  + " total: " + sumacol);
         System.out.println(" Suma Fila " + leerfila + " total: " + sumafil);
    }
    
     
    
}
