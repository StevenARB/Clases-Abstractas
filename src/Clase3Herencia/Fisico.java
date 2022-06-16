package Clase3Herencia;


public class Fisico extends Persona{
    
    private String tituloUniversitario;
    private int librosLeidos;

    public Fisico(String tituloUniversitario, int librosLeidos, String nombre, String apellido, int edad, String reino) {
        super(nombre, apellido, edad, reino);
        this.tituloUniversitario = tituloUniversitario;
        this.librosLeidos = librosLeidos;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public int getLibrosLeidos() {
        return librosLeidos;
    }
    
    @Override
    public void alimentarse() {
        System.out.println("\n"+super.getNombre()+"se alimenta de cereales");
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nFisico"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nTitulo Universitario: "+tituloUniversitario
                +"\nLibros Leidos: "+librosLeidos);
    }
}
