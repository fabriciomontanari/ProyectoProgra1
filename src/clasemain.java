/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;


import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public  class clasemain {
   public void main () throws IOException {

        int opcionEligeUsuario = 0;
        List <empleado> listaDeempleados = new ArrayList<empleado> (); // El metodo array no sirve para almacenar datos de una lista //
        Dialogo opcionesUsuario = new Dialogo();
        Dialogo mensajeVent = new Dialogo();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            // Registra la opcion 1 del menu agregar empleado 
            if (opcionEligeUsuario == 1) {
                // Se llama a los metodos creados en la clase empleados
                empleado tmpempleado = new empleado();
                tmpempleado.SetIdentificacion(opcionesUsuario.tenerlaceduladelempleado());
                tmpempleado.SetNombre(opcionesUsuario.tenernombredelempleado());
                tmpempleado.SetApellidos(opcionesUsuario.tenerlosapellidosdelempelado());
                tmpempleado.SetEmail(opcionesUsuario.tenerelemaildelempelado());
                tmpempleado.SetCelular(opcionesUsuario.tenerleceulardelempleado());
                tmpempleado.SetEdad(opcionesUsuario.tenerlaedaddelempelado());
                //Con tmp java nos permite guardar archivos temporales en este caso la listas de empleados 
                listaDeempleados.add(tmpempleado);
            }
            
            // Fin de el pedido de empleados 

            //opcion modificar la informacion de un empleado opcion 2 
            if (opcionEligeUsuario == 2) {
                String identempleadobusqueda = opcionesUsuario.tenerlaceduladelempleado();
                boolean empleadoencontrado = false;

                Iterator<empleado> it = listaDeempleados.iterator();
                empleado tmpAnalizando;

                while ( it.hasNext() ) {     // El metodo hasNext nos permite saber si hay o no mas elemntos en el agregado

                    tmpAnalizando = it.next();                
                        // Si se encuentra solicitamos la nueva informacion 
                    if (tmpAnalizando.getIdentificacion().equals(identempleadobusqueda) ) {
                        empleadoencontrado  = true;
                        String mensaje = tmpAnalizando.getStringempleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este pasajero";

                        mensajeVent.mostrarMensaje(mensaje);

                        //Solicitamos los nuevos datos del empleado y los almacenamos en tmp 

                        mensajeVent.mostrarMensaje("La idetificacion de la cedula solo la puede realizar el dueño de la tienda , modifique los otros datos ");
                        tmpAnalizando.SetNombre(opcionesUsuario.tenernombredelempleado());
                        tmpAnalizando.SetApellidos(opcionesUsuario.tenerlosapellidosdelempelado());
                        tmpAnalizando.SetEmail(opcionesUsuario.tenerelemaildelempelado());
                        tmpAnalizando.SetCelular(opcionesUsuario.tenerleceulardelempleado());
                        tmpAnalizando.SetEdad(opcionesUsuario.tenerlaedaddelempelado());

                        mensaje = tmpAnalizando.getStringempleado();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }    

                } 

                if (empleadoencontrado  == false) {
                    mensajeVent.mostrarMensaje("No se encontró el empleado con esta cedula ");
                }
            } //Termina la opcion 2 de modificar empleados 

                // Opcion 3 lista completa de empleados 
            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<empleado> it2 = listaDeempleados.iterator();
                empleado tmpAnalizando;

                while ( it2.hasNext() ) {           // Utilisamos hasnext 
                    tmpAnalizando = it2.next();                
                    listado = listado + tmpAnalizando.getStringempleado();
                    listado = listado + "\n\n\n";
                } 

                mensajeVent.mostrarMensaje(listado);

            }   //Termina la opcion 3  de lista de empleados 

                    //Eliminar empleados opcion 4 
            if (opcionEligeUsuario == 4) {
                String identEmpleadobuscado = opcionesUsuario.tenerlaceduladelempleado();
                boolean empleadoencontrado = false;

                Iterator<empleado> it = listaDeempleados.iterator();
                empleado tmpAnalizando;

                while ( it.hasNext() && empleadoencontrado ==false ) {       //Usamos nuevamente hasnext     

                    tmpAnalizando = it.next();                

                    if (tmpAnalizando.getIdentificacion().equals(identEmpleadobuscado) ) {
                        empleadoencontrado = true;
                        String mensaje = tmpAnalizando.getStringempleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se sigue a la eliminacion de datos de este empleado\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Se solictan nuevos datos del empleado 
                        listaDeempleados.remove(tmpAnalizando);
                        empleadoencontrado=true;

                    } else { }    

                } 

                if (empleadoencontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontro el empleado con esa cedula");
                }
            } 

        }

        opcionesUsuario.cerrarPrograma();

    } 

} 