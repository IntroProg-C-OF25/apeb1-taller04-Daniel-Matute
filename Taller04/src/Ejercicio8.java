
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaracion de datos de entrada

        double totalServicios = 15.99 + 11.99 + 9.99 + 9.99;//Netflix +Youtube Premium+Dropbox+Spotify
        //Bloque de Procesamiento de datos de entrada

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        if (edad < 30) {
            totalServicios = totalServicios - (totalServicios * 0.2); // Aplica descuento del 20%
        }
        //Bloque de salida de resultados

        System.out.printf("El total a pagar por los servicios es: %.2f%n", totalServicios);//%.2f en System.out.printf indica que se desea mostrar el número en formato de punto flotante (f) con dos decimales (.2)
    }
}
