/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.util.Scanner;


/**
 *
 * @author fabrimontanari
 */
public class Comision {
public void ComisionEmpleado(){  // Se inicia con el codigo para calcular la comicion 
        Scanner leer = new Scanner(System.in);
       Scanner leer1 = new Scanner(System.in);
         String nombre;
        String opcion;
        double valor,acumulador=0,bono; // Se crean 3 variables el valor que sera lo que vendio el acomulador (contador) y el bono. 
        System.out.println("Bienvenido al calculador de tu comicion");
        
        System.out.println("Ingresa el nombre del trabajador"); // Se le solicita al usuario su nombre 
        nombre = leer.nextLine(); // Salto de linea 
        
        
        System.out.println("Deseas iniciar   \n s: SI  n: NO"); 
        opcion = leer1.nextLine();
        
        while(opcion.equalsIgnoreCase("s")){  // Mediante un while hacemos que el programa pare hasta que el usuario coloque un caracter o letra diferente a "s"
           System.out.println("Ingresa el monto de la factura que vendio ");    
            valor = leer.nextDouble();
            bono = valor * 0.05 ;      //asignamos el valor de valor que es igual a una comicion de 5% = 0.05
            acumulador = acumulador + bono ;
            System.out.println("Deseas ingresar otro monto de facturas \n s: SI  n: NO"); // Si el usuario preciona "s" podra seguir agregando facturas 
            opcion = leer1.nextLine();   //Salto de linea 
        }        
        System.out.println("El total de su comicion es  "+acumulador); //Imprime la comicion 
 
    
 }


}//Cierra la clase 

    

