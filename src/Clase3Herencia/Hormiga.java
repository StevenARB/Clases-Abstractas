
package Clase3Herencia;


public class Hormiga extends SerVivo implements Caminar {
    
    private int hojasCortadas;

    public Hormiga(int hojasCortadas, String reino) {
        super(reino);
        this.hojasCortadas = hojasCortadas;
    }
    
    @Override
    public void alimentarse() {
        System.out.println("La hormiga se alimenta de plantas");
    }
    
    @Override
    public void avanzar() {
        System.out.println("La hormiga esta avanzando");
    }  
    @Override
    public void retroceder() {
        System.out.println("La hormiga esta retrocediendo");
    }
    @Override
    public void detenerse() {
        System.out.println("La hormiga se detuvo");
    }
}
