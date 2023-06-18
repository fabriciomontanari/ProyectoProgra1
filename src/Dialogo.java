/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.*;

public class Dialogo { //Clase fundamental para el funcionamiento de la clase main 

    String dialogo;

    public Dialogo() {     }
    // Menu de la base de datos del empleado
    public int obtenerOpcionMenu() throws IOException { // Menu para la bases de datos de los empleados 
        dialogo = "Programa de Registro de empleados activos(solo gerencia)\n";
        dialogo += "1.  Agregar empleado\n";
        dialogo += "2.  Modificar un empleado\n";
        dialogo += "3.  Lista completa de los empleados\n";
        dialogo += "4.  Elimianr empleado\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
    // Se pide toda la infromacion del empleado 
    public String tenerlaceduladelempleado() throws IOException {
        dialogo = "Introduzca la cedula del empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

     
    public String tenernombredelempleado() throws IOException {
        dialogo = "Introduzca el nombre del empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String tenerlosapellidosdelempelado() throws IOException {
        dialogo = "Introduzca el apellido del empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String tenerelemaildelempelado() throws IOException {
        dialogo = "Introduzca el email del empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String tenerleceulardelempleado() throws IOException {
        dialogo = "Introduzca el celular del empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int tenerlaedaddelempelado() throws IOException {
        dialogo = "Introduzca la edad del empleado\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Fin del programa ");
        JOptionPane.showMessageDialog(frame, "Gracias por usar nuestro programa");
        System.exit(0);
    }
}
    

