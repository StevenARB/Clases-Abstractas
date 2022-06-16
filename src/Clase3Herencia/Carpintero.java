package Clase3Herencia;


public class Carpintero extends Persona{
    
    private String experiencia;
    private int casasConstruidas;

    public Carpintero(String experiencia, int casasConstruidas, String nombre, String apellido, int edad, String reino) {
        super(nombre, apellido, edad, reino);
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
    public void alimentarse() {
        System.out.println("\n"+super.getNombre()+"se alimenta de carne");
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
