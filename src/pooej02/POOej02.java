/*
 * @author NeuenMartinez
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia.
e) Método perimetro(): para calcular el perímetro.
 */
package POOej02;

import Entidades02.Circunferencia;
import Servicios02.CircunferenciaService;

public class POOej02 {

    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.CrearCircunferencia();
        cs.area(c1);
        cs.perimetro(c1);
        System.out.println(c1);

    }

}