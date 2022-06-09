package Clase3Herencia;


public class Profesor extends Fisico {
    
    private String institucion;
    private int examenesRevisados;

    public Profesor(String institucion, int examenesRevisados, String tituloUniversitario, int librosLeidos, String nombre, String apellido, int edad) {
        super(tituloUniversitario, librosLeidos, nombre, apellido, edad);
        this.institucion = institucion;
        this.examenesRevisados = examenesRevisados;
    }

    public String getInstitucion() {
        return institucion;
    }

    public int getExamenesRevisados() {
        return examenesRevisados;
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nProfesor"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nTitulo Universitario: "+super.getTituloUniversitario()
                +"\nLibros Leidos: "+super.getLibrosLeidos()
                +"\nInstitucion: "+institucion
                +"\nExamenes Revisados: "+examenesRevisados);
    }
    
    public void calcularGravedadSol() {
        
    }
}
