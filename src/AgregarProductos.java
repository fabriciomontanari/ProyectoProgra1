/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;


import javax.swing.JOptionPane;

/**
 *
 * @author fabrimontanari
 */
public class AgregarProductos { // Se crea la clase para agregar productos 
    public int x;     
    
    Productos Arreglo[] = new Productos[30]; // Creamos el arreglo udimecional de productos
    
    public void AgregarProductos(){
        
  
  boolean continuar;
  
  for(int x=0; x<Arreglo.length;x++){ // Analiza todo el arreglo 
         String Producto = JOptionPane.showInputDialog("Escriba el nombre del producto:");
         int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad:"));
         int Precio =  Integer.parseInt(JOptionPane.showInputDialog("Escriba el precio: "));
         
         Arreglo[x] = new Productos(Producto,Cantidad,Precio);
 
 

int input = JOptionPane.showConfirmDialog(null, "Desea poner otro producto"); //Codigo para agregar otro producto. 
             if (input == 1)
           {
               JOptionPane.showMessageDialog(null, "Muchas Gracias");
               continuar = false;
               break;
           }
             if(input ==2){
                 return;
             }
  }
    }
    public void VerProductos(){ // Mediante un for recorremos todo el arreglo para imprimir al usuario 
        for(int i=0;i<Arreglo.length;i++){
         JOptionPane.showMessageDialog(null, "El producto "+(i+1)+"es: "+Arreglo[i].Producto+" \nCantidad: "+Arreglo[i].Cantidad+"\n Precio: "+Arreglo[i].Precio);
        }
    }
} // Cierra la clase


