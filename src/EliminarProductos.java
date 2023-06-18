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
public class EliminarProductos {
   static String inventario[][] = new String[4][5]; // Se crea una matrz de 4*5 (20)
    
    public void Relleno_de_tienda()
    {
        for (int f=0; f<inventario.length ; f++) //Rellenamos los espacios la matriz con la letra "d"
        {
            for(int c=0; c<inventario[0].length;c++)
            {
                inventario[f][c]="d";
            }
        }
    }
    
    public void Menu_de_inventario_tienda() //Menu encargado para que el empelado pueda decidir que hacer en bodega 
    {
        boolean seguir = true;
        
        while(seguir)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al inventario de la tienda. Favor ver el txt antes de inciar  \n"+
                                                                           "1. Ingresar productos\n"+
                                                                           "2. Modificación de pasillo\n"+
                                                                           "3. Eliminar producto \n"+
                                                                           "4. Consultar reserva por codigo de producto \n"+
                                                                           "5. Disponibilidad de productos \n"+
                                                                           "6. Salir del Programa\n"));
            
            switch(opcion)
            { // Se llaman a todas las clases 
                case 1:
                    Reserva_de_producto();
                    break;
                case 2:
                    Modificar_pasillo();
                    break;
                case 3:
                    Eliminar_producto();
                    break;
                case 4:
                    Consultar_producto_por_codigo();
                    break;
                case 5:
                    Disponibilidad_de_producto();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por hacer el inventario ");
                    seguir =false;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Ingrese un valor correcto del Menú");
                     break;
                    
                           
            }
            
        }
    }
    
    public void Reserva_de_producto() // Esta sub clase nos deja añadir los 20 productos mediante su codigo
    {
        boolean seguir = true;
        
        while(seguir)
        {
        String producto = JOptionPane.showInputDialog("Ingrese el codigo del producto ");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del pasillo del 1 al 4 "));
        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estante del 1 al 5 "));
        
        fila--;
        campo--;
        
        if (inventario[fila][campo].equals("d"))
        {
            inventario[fila][campo]= producto;
            JOptionPane.showMessageDialog(null, "Espacio reservado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Espacio no disponible ");
        }
        // Depues de esto solicitamos al usuario si desea guardar otro producto 
        int otro = JOptionPane.showConfirmDialog(null, "¿Quieres guardar otro campo ?");
        
        if(otro==1)
        {
            seguir = false;
        }
        
        }  
        
    }
    
    public void Modificar_pasillo() // En este caso esta sub clase nos permite modificar pasilos y estantes de nuestro inventario 
    {
        boolean seguir = true;
        boolean modificar = true;
        
        while(seguir)
        {
            int pasillo = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del pasillo a modificar del 1 al 4"));
            int estante = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del estante a modificar del 1 al 5 "));
            
            pasillo--;
            estante--;
            // Solcitamos al usuario que codigo desea modificar 
            String producto = JOptionPane.showInputDialog("Ingrese el codigo del producto que desea modificar ");
             
            if (inventario[pasillo][estante].equals(producto)) // Aseguramos que ese producto exista
            {
                while(modificar) //Modificamos el productos mediante un while 
                {
                    JOptionPane.showMessageDialog(null, "Digite el campo donde quiere mover los productos ");
                    int pasillot = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemero de pasillo del 1 al 4"));
                    int estantey = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estante del 1 al 5 "));
                    
                    pasillot--;
                    estantey--;
                    
                    if (inventario[pasillot][estantey].equals("d")) // Reservamos el espacio mediante un if 
                    {
                      inventario[pasillot][estantey]= producto;
                      inventario[pasillo][estante]="d";
                      JOptionPane.showMessageDialog(null, "Espacio reservado exitosamente ");
                      modificar=false;
                      
                    }
                    else // Si el espacio ya contiene el codigo de algun producto queda reservado 
                     {
                      JOptionPane.showMessageDialog(null, "Espacio ocupado");
                      //Si es asi el usuario decide si desea intentar con otro espacio 
                      int otraop = JOptionPane.showConfirmDialog(null,"¿Quiere intentar en otro espacio?");
                      
                      if(otraop ==1)
                      {
                          modificar=false;
                      }
                     }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El campo no le pertenece a el espacio en la bodega");
            }
            // Solicitamos que si quiere modifica el espacio 
            int distinto = JOptionPane.showConfirmDialog(null,"¿Quiere modificar este espacio ?");
                      
                      if(distinto ==1)
                      {
                          seguir=false;
                      }
            
        }
    }
    
    public void Eliminar_producto() // Eliminacion de codigo de producto 
    {
       boolean seguir = true;
       
       while(seguir)
       {
           int pasillo = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del pasillo del 1 al 4 "));
           int estante = Integer.parseInt(JOptionPane.showInputDialog("digite el nuermo de estante del 1 al 5"));
           
           pasillo--;
           estante--;
           
           JOptionPane.showMessageDialog(null, "Por motivo de control verifique el codigo del producto ");
           
           String producto = JOptionPane.showInputDialog("Ingrese el numero de producto que le pertenece este espacio ");
            
           if(inventario[pasillo][estante].equals(producto))//Un if de siempre y cuando sea el mismo producto lo eliminara 
           {
               inventario[pasillo][estante] ="d";
               JOptionPane.showMessageDialog(null, "El producto fue eliminado exitosamente ");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "El codigo del producto no corresponde al espacio seleccionado ");
           }
           // Se le da la opcion al usuario de si desea eliminar el producto 
           int distinto = JOptionPane.showConfirmDialog(null,"¿Desea eliminar otro producto ?");
                      
           if(distinto ==1)
           {
             seguir=false;
           }
           
       }
    }
    
    public void Consultar_producto_por_codigo() // El usuario puede consultar producto por codigo 
    {
        boolean seguir = true;
        int contador = 0; // Se crea un contador 
        
        while(seguir)
        {
            String producto = JOptionPane.showInputDialog("Ingrese el numero del codigo del producto a consultar ");
            // Un for verifica toda la matriz a ver si existe ese dato 
            for(int f=0; f<inventario.length; f++)
            {
                for(int c=0; c<inventario[0].length; c++)
                {
                    if(inventario[f][c].equals(producto))
                    { // Se imprime el producto encontrado 
                        JOptionPane.showMessageDialog(null, "El prodcuto "+producto+" tiene el espacio reservaod: \n"+
                                                             "Pasillo: # " +(f+1)+"\n"+
                                                             "Estante  # " +(c+1));
                    }
                    else
                    {
                        contador++;
                    }
                }
            }
            
            if(contador==12) // Si el contador es igual a 12 el producto no existe 
            {
                JOptionPane.showMessageDialog(null, "El producto no existe ");
            }
            // Se le da la opcion al usuario de consultar otro produto 
            int distinto = JOptionPane.showConfirmDialog(null,"¿Quiere consultar otro producto ?");
                      
           if(distinto ==1)
           {
             seguir=false;
           }
           
           contador =0;
        }
    }
    
    public void Disponibilidad_de_producto() // Se imprime toda la matriz con los codigos de prodcutos restantes 
    {
        String ocupacion ="";
        // Se recorre toda la matriz 
        for(int f=0; f<inventario.length; f++)
            {
                for(int c=0; c<inventario[0].length; c++)
                {
                    ocupacion+=inventario[f][c]+" ";
                }
                ocupacion+="\n";
            }
        
        JOptionPane.showMessageDialog(null, ocupacion);
    }

    
}// Fin de la clase 
        
        
    
    

