package Clase3Herencia;


public class Arquitecto extends Carpintero {
    
    private String especialidad;
    private int salario;

    public Arquitecto(String especialidad, int salario, String experiencia, int casasConstruidas, String nombre, String apellido, int edad, String reino) {
        super(experiencia, casasConstruidas, nombre, apellido, edad, reino);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getSalario() {
        return salario;
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nArquitecto"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nExperiencia: "+super.getExperiencia()
                +"\nCasas Construidas: "+super.getCasasConstruidas()
                +"\nEspecialidad: "+especialidad
                +"\nSalario: "+salario);
    }
}
