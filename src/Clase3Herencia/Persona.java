package Clase3Herencia;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void mostrarDatosPersona() {
        System.out.println("\nPersona"
                +"\nNombre: "+nombre+" "+apellido
                +"\nEdad: "+edad);
    }
}

