
package Clase3Herencia;


public abstract class SerVivo {
    
    private String reino;

    public SerVivo(String reino) {
        this.reino = reino;
    }

    public String getReino() {
        return reino;
    }
    
    public abstract void alimentarse();
}
