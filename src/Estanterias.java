/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fabrimontanari
 */
public class Estanterias {
    
    static int estantes[]; // Se hace un arreglo un arreglo udimecional 

public void Tamaño_del_estante() // Se le solicita al usario  el tamaño del estante 
{
int TArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estantes existentes"));

estantes = new int[TArreglo];
}

public void cantidad_de_productos() // Se solicita llenar la cantidad de productos dicha 
{ // Se recorre el arreglo 
for(int i=0; i<estantes.length;i++)
{
estantes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos del estante "+(i+1)));
}

}

public void Consultar_cantidad_de_productos_estante() // Se imprimen los productos brindados 
{
String Cad="";
// Se recorre el arreglo 
for (int i=0; i< estantes.length; i++)
{
Cad+="Productos existente en estante "+(i+1)+" es : "+ estantes[i]+"\n";
}

JOptionPane.showMessageDialog(null, Cad);
JOptionPane.showMessageDialog(null,"Bienvenido a la suma de sus productos tototales en bodega ");
} 

public void PasillosYEstantes(){ //Aca sumaremos los estante y pasillos para saber el total de productos 
    
    Scanner entrada = new Scanner(System.in);   
       int matriz[][], nPas,nEst,sumaFilas; // Se le solicita al usaurio de numero de la matriz
       
       nPas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de pasillos en la tienda: "));
       nEst = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros de estante por pasillo: "));
       
       matriz = new int [nPas][nEst];  
       // Se le solicita al usario la cantidad de productos 
       System.out.println("Digite la cantidad de productos");
       for(int i=0; i<nPas;i++){
           for(int j=0;j<nEst;j++){
               System.out.print("Pasillo["+i+"]["+j+"]: ");
               matriz[i][j] = entrada.nextInt();
           }
       }
       
       System.out.println("\nTodos los productos de la tienda son: "); //Imprimimos todos los productos de la tienda 
       for(int i=0;i<nPas;i++){
          for(int j=0;j<nEst;j++){
              System.out.print(matriz[i][j]+" ");
          } 
          System.out.println("");
       }
      
       for(int i=0;i<nPas;i++){
           sumaFilas = 0;
           for(int j=0;j<nEst;j++){
               sumaFilas += matriz[i][j];
           }
           System.out.print("\nEl numero total de productos en el pasillo["+i+"]son: "+sumaFilas);
       }
       System.out.println("");
       
    }
}


