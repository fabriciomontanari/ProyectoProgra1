/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

public class empleado { //clase parte de la clase main 
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String email;
    private String celular;
    private int edad;

    
    public empleado()    {
        // Inicio de variables 
        identificacion = "desconocido";
        nombre = "desconocido";
        apellidos = "desconocido";
        email = "desconocido";
        celular = "desconocido";
        edad = 0;
    }

    //Modificadores //
    public void SetIdentificacion(String identificacion) {this.identificacion = identificacion;   }
    public void SetNombre(String nombre) {this.nombre = nombre; }
    public void SetApellidos(String apellidos) {this.apellidos = apellidos; }
    public void SetEmail(String email) { this.email = email; }
    public void SetCelular(String celular) {this.celular = celular; }
    public void SetEdad(int edad) {this.edad = edad; }

    //Analizadores //
    public String getIdentificacion() {return identificacion; }
    public String getNombre() {return nombre; }
    public String getApellidos() { return apellidos; }
    public String getEmail() {return email; }
    public String getCelular() { return celular;}
    public int getEdad() {return edad;}
    public String getStringempleado () {
        String mensaje = "Información actual del empleado: \n";
        mensaje = mensaje + "Cedula : " + this.getIdentificacion()+"\n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Apellidos: " + this.getApellidos() + "\n";
        mensaje = mensaje + "Email: " + this.getEmail() + "\n";
        mensaje = mensaje + "Celular: " + this.getCelular() + "\n";
        mensaje = mensaje + "Edad: " + this.getEdad() + "\n";
        mensaje = mensaje + "\n\n\n";
        return mensaje;
    }
}

