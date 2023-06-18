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
public class Facturar {
    
    public void Facturar(){ // Asignamos la sub clase factura
         // Se asignan las variables de la factura y se le solcitan al usuario y se definen las formulas 
        double cantidad, descuento, impuesto, porcentaje_de_descuento, porcentaje_de_impuesto;
        double precio_unidad, subtotal, total;
        String codigo_del_producto, nombre_del_producto;
        codigo_del_producto = JOptionPane.showInputDialog("Ingresa el codigo del producto:");
        nombre_del_producto = JOptionPane.showInputDialog("Ingresa el nombre del producto:");
        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de cantidad"));
        porcentaje_de_descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de porcentaje de descuento"));
        porcentaje_de_impuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de porcentaje de impuesto"));
        precio_unidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de precio unidad"));
        subtotal=cantidad*precio_unidad; // Monto total de la factura sin rebajo ningun tipo 
        descuento=subtotal*porcentaje_de_descuento/100; // Resta el descuento 
        impuesto=(subtotal-descuento)*porcentaje_de_impuesto/100; //calculamos el impuesto 
        total=subtotal-descuento+impuesto; //Monto a pagar
        JOptionPane.showMessageDialog(null,  //Se imprime la factura completa
            "Codigo del producto: " + codigo_del_producto + "\n" +
            "Nombre del producto: " + nombre_del_producto + "\n" +
            "Valor de descuento: " + descuento + "\n" +
            "Valor de impuesto: " + impuesto + "\n" +
            "Valor de subtotal: " + subtotal + "\n" +
            "Valor de total: " + total);
    }

}
    
      
    
    
    

