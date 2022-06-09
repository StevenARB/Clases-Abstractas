package Clase3Herencia;


public class Carpintero extends Persona{
    
    private String experiencia;
    private int casasConstruidas;

    public Carpintero(String experiencia, int casasConstruidas, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.experiencia = experiencia;
        this.casasConstruidas = casasConstruidas;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public int getCasasConstruidas() {
        return casasConstruidas;
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nCarpintero"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nExperiencia: "+experiencia
                +"\nCasas Construidas: "+casasConstruidas);  
    }
}
