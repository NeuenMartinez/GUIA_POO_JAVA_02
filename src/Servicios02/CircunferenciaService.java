package Servicios02;

import Entidades02.Circunferencia;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class CircunferenciaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("#.00");

    public Circunferencia CrearCircunferencia() {
        System.out.println("Ingresar el tamaño del radio:");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);

    }
    public void area(Circunferencia c1){
        double area = Math.PI * (c1.getRadio()*c1.getRadio());
        System.out.println("El area de la Cirunferencia es: " + Math.round(area * 100d) / 100d + "cm2");
    }
    public void perimetro(Circunferencia c1){
        double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("El perimetro de la Circunferencia es: " + df.format(perimetro) + "cm");
    }

}
