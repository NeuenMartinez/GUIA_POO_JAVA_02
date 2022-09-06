package Entidades02;

/**
 *
 * @author NeuenMartinez
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "el radio de la Circunferencia es: " + radio + '}';
    }
    
    
}
