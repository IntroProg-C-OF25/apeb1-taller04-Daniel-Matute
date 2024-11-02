
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Bloque de Procesamiento de datos de entrada
        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = teclado.nextDouble();
        System.out.print("Ingrese el interés mensual (en %): ");
        double interesMensual = teclado.nextDouble() / 100;
        //Bloque de salida de resultados

        int numeroPagos = 12; // Plazo de 1 año en meses
        double pagoMensual = (montoPrestamo * interesMensual) / (1 - Math.pow(1 + interesMensual, -numeroPagos));

        System.out.printf("El pago mensual es: %.2f%n", pagoMensual);//%.2f en System.out.printf indica que se desea mostrar el número en formato de punto flotante (f) con dos decimales (.2)
    }
}
