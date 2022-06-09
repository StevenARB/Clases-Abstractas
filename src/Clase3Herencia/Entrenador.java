package Clase3Herencia;


public class Entrenador extends Futbolista{
    
    private String paradoTactico;
    private int titulosGanados;

    public Entrenador(String paradoTactico, int titulosGanados, String pieDominante, int golesMarcados, String nombre, String apellido, int edad) {
        super(pieDominante, golesMarcados, nombre, apellido, edad);
        this.paradoTactico = paradoTactico;
        this.titulosGanados = titulosGanados;
    }

    public String getParadoTactico() {
        return paradoTactico;
    }

    public int getTitulosGanados() {
        return titulosGanados;
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nEntrenador"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nPie Dominante: "+super.getPieDominante()
                +"\nGoles Marcados: "+super.getGolesMarcados()
                +"\nParado Tactico Favorito: "+paradoTactico
                +"\nTitulos Ganados: "+titulosGanados);
    }
    
    public void realizarEstrategia() {
        String modoEquipo;
        
        modoEquipo = switch (paradoTactico) {
            case "5-3-2" -> "Defensivo";
            case "3-4-3" -> "Ofensivo";
            default -> "Normal";
        };
        
        System.out.println("\nEl equipo de "
                +super.getNombre()+" "
                +super.getApellido()+" esta en modo "
                +modoEquipo);
    }  
}
