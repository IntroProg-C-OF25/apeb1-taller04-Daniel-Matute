
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Declaracion de datos de entrada
        double costoMinuto, cantidadMinutos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble();
        System.out.print("DAME LA CANTIDAD DE MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        //Bloque de procesamiento de datos de entrada
        valorPlanilla = costoMinuto * cantidadMinutos;
        //Bloque de salidad de resultados
        System.out.println("VALOR DE LA PLANILLA ES : " + valorPlanilla);

    }

}
