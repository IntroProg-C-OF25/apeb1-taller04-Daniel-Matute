
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Bloque de Procesamiento de datos de entrada
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        double costoKwh = teclado.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos: ");
        double consumoKwh = teclado.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        //Bloque de salida de resultados

        double total = costoKwh * consumoKwh;
        if (edad > 65) {
            total = total - (total * 0.1); // Aplica descuento del 10%
        }
        System.out.printf("El valor a cancelar es: %.2f%n", total);//%.2f en System.out.printf indica que se desea mostrar el número en formato de punto flotante (f) con dos decimales (.2)
    }
}
