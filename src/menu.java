/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabrimontanari
 */
public class menu { // Menu principal de todo nuestro programa 
   // Llamado de las clases necesarias  
 public void menu() throws IOException{
 AgregarProductos miclase = new AgregarProductos();
 EliminarProductos miclase1 = new EliminarProductos();
 Facturar miclase3 = new Facturar();
 Estanterias miclase4 = new Estanterias();
 Comision miclase5 = new Comision();
 ClaveDinamica miclase6 = new ClaveDinamica();
 txtproducto miclase7 = new txtproducto();
 clasemain miclase8 = new clasemain();
 
    byte opcion = 0;
    String producto;
    String nombre_producto;
    int precio;
    int cantidad;
    int total;
        
        do{
           opcion = Byte.parseByte(JOptionPane.showInputDialog( //Menu que vera el usuario 
                   "---- Bienvenido a Store and inventory program (Quick and easy code) ----\n"+
                        "1) Agregar Producto\n"+
                        "2) Administracion completa de inventario(antes de inciar seleccione la opcion 8)  \n"+
                        "3) Ver Productos\n"+
                        "4) Facturación\n"+
                        "5) Productos totales en bodegas\n"+ 
                        "6) Comisión del trabajador\n"+   
                        "7) Generar clave dinamica para el usuario\n"+
                        "8) Txt para inventario\n "+
                        "9) Base de datos empleados (Solo administradores)\n "+
                        "10) Salir del Sistema"));
           switch(opcion){ //Se determina el llamado de clases para cada opcion 
               case 1:                                     
                   miclase.AgregarProductos();
                   break; 
                   
               case 2:
                   miclase1.Relleno_de_tienda();
                   miclase1.Menu_de_inventario_tienda();
                  
                   
                   break;
                   
               case 3:
                   miclase.VerProductos();
                   break;
               case 4:
                   miclase3.Facturar();
                   break;
               case 5:
                   miclase4.Tamaño_del_estante();
                   miclase4.cantidad_de_productos();
                   miclase4.Consultar_cantidad_de_productos_estante();
                   miclase4.PasillosYEstantes();
                   break;
               case 6:
                   miclase5.ComisionEmpleado();
                   break;
               case 7:
                   miclase6.clave_dinamica();
                   break;
               case 8:
                   miclase7.productos();
                   break;
               case 9:
                   miclase8.main();
                   break;
        
                   
               case 10:
                   opcion = 10;
                   break;
                
           }
                          
        }while(opcion!=10);
        System.exit(0);
        } 
    }// Cierra la clase 
    

    
    

