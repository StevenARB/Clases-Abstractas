package Clase3Herencia;


public class Main {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Steven", "Retana", 19);
        
        Futbolista f1 = new Futbolista("Diestro", 200, "Alvaro", "Saborio", 40);
        Entrenador e1 = new Entrenador("3-4-3", 25, "Diestro", 20, "Pep", "Guardiola", 51);
        
        Carpintero c1 = new Carpintero("7 Años", 28, "Mario", "Flores", 25);
        Arquitecto a1 = new Arquitecto("Direccion de Proyectos", 1000000, "11 Años", 137, "Alberto", "Barboza", 38);
        
        Fisico fs1 = new Fisico("Licenciado en Ciencias Físicas", 30, "Daniel", "Brenes", 29);
        Profesor ps1 = new Profesor("Universidad Fidelitas", 316, "Profesor de Enseñanza Media y Superior en Fisica", 30, "Rodolfo", "Garcia", 36);
        
        p1.mostrarDatosPersona();
        
        f1.mostrarDatosPersona();
        f1.equipoPreferido();
        e1.mostrarDatosPersona();
        e1.realizarEstrategia();
        
        c1.mostrarDatosPersona();
        a1.mostrarDatosPersona();
        
        fs1.mostrarDatosPersona();
        ps1.mostrarDatosPersona();
        
    }
}
