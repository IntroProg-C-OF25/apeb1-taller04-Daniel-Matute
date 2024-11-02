
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Declaracion de datos  de entrada
        double gastosHijo1, gastosHijo2, gastosHijo3, gastostotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME GASTOS DEL HIJO1: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.print("DAME GASTOS DEL HIJO2: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.print("DAME GASTOS DEL HIJO 3: ");
        gastosHijo3 = teclado.nextDouble();
        //Bloque de procesamiento de entrada 
        gastostotal = gastosHijo1 + gastosHijo2 + gastosHijo3;
        //Bloque de salida de resultados
        System.out.println("LOS GASTOS EN TOTAL DE LOS HIJOS ES : " + gastostotal);

    }
}
