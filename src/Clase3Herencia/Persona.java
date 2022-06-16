package Clase3Herencia;


public abstract class Persona extends SerVivo {
    
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad, String reino) {
        super(reino);
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
    
    public abstract void mostrarDatosPersona();
}

