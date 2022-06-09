package Clase3Herencia;


public class Futbolista extends Persona {
    
    private String pieDominante;
    private int golesMarcados;

    public Futbolista(String pieDominante, int golesMarcados, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.pieDominante = pieDominante;
        this.golesMarcados = golesMarcados;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }
    
    @Override
    public void mostrarDatosPersona() {
        System.out.println("\nFutbolista"
                +"\nNombre: "+super.getNombre()+" "+super.getApellido()
                +"\nEdad: "+super.getEdad()
                +"\nPie Dominante: "+getPieDominante()
                +"\nGoles Marcados: "+getGolesMarcados());
    }
    
    public void equipoPreferido() {
        String Equipo;
        double DatoAleatorio;
        DatoAleatorio = Math.random();
        if (DatoAleatorio <= 0.5) {
            Equipo = "Saprissa";
        }
        else {
            Equipo = "Alajuelense";
        }
        
        System.out.println("\nEse jugador se llama "+super.getNombre()+" "+super.getApellido()
                +", tiene "+super.getEdad()+" años, es "+pieDominante+", ha marcado "+golesMarcados+" goles"
                +"\nSu equipo preferido es "+Equipo);
    }
}
