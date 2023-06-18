/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.util.Random; // Se llama a la biblioteca de java random

/**
 *
 * @author fabrimontanari
 */
public class ClaveDinamica { // Se crea la clase clave dinamica. 
    
    public void clave_dinamica(){
        int matrizNumeros[][] = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];   // Se crea una matriz y mediante la biblioteca ramdom se nos enviara el tamaño de matriz aleatorio 
        inicializar(matrizNumeros);    //Incia la matriz 
        visualizar(matrizNumeros); // Se ve la amtriz 
        
    }
 
    static void inicializar(int[][] matriz){
         Random r = new Random();    // Solicitamos a random, la cual llenara toda la matriz de numeros random 
        for(int i=0;i<matriz.length;i++){  // Mediante un for recorremos la matriz 
                for(int j=0;j<matriz[i].length;j++){
                    matriz[i][j] = r.nextInt(25) + 1; 
                }
            }
        }

        static void visualizar(int[][] matriz){ // Imprimimos la matriz mediante un for 
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j] + "\t");
                }
            
            System.out.println();
        } // Se le imprime unas indicaciones al usuario 
        System.out.println("Estos numeros son sus numeros de ingreso al sistema");
        System.out.println("Selecione un numero de cada fila para ingresar al sistema");
        System.out.println("Seleccione 1 numero de diferentes filas");
        
    }
} // Cierra la clase 
