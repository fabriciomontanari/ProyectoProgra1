/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gaysx
 */
class txtproducto {
     public void productos() throws IOException { //IO EXCEPTION  nos permite crear archivos en nuestra computadoras
        FileWriter fichero = new FileWriter("C:/Users/gaysx/Documents/tzt/productos.txt"); // Ubicacion donde se crea el txt 
        
        // Lista de los productos que tendra el txt 
        fichero.write("1. Carne de res.  Codigo:1822 \n" +
"                \"2. Atun. Codigo: 1899 \n" +
"                \"3. Arroz. Codigo:2214 \n" +
"                \"4. Cervesas. Codigo:1455 \n" +
"                \"5. Frijoles. Codigo:5544 \n" +
"                \"6. Ranchitas. Codigo:9999 \n" +
"                \"7. Aceite. Codigo:1455 \n" +
"                \"8. Peras. Codigo:8844 \n" +
"                \"9. Agua. Codigo:5566 \n" +
"                \"10. Big cola. Codigo: 3377 \n" +
"                \"11. Mantequilla Codigo: 8899 \n" +
"                \"12. helado de fresa Codigo: 2233 \n" +
"                \"13. Chile picante  Codigo: 9783 \n" +
"                \"14. Mani  Codigo: 1634 \n" +
"                \"15. Pollo Codigo: 3543 \n" +
"                \"16. Cacique Codigo: 2953 \n" +
"                \"17. Harina  Codigo: 5093 \n" +
"                \"18. Masa Codigo: 8016 \n" +
"                \"19. Galletas  Codigo: 2200 \n" +
"                \"20. Comida perros  Codigo:6655" );                 
                   
        

        fichero.close();
        
        
    }
    
}

