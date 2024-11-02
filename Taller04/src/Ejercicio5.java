
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Declaracion de variables
        double cpu, teclado, pantalla, raton, costoTotal;
        Scanner teclado1 = new Scanner(System.in);
        System.out.print("DAME VALOR DEL CPU: ");
        cpu = teclado1.nextDouble();
        System.out.print("DAME COSTO DEL TECLADO: ");
        teclado = teclado1.nextDouble();
        System.out.print("DAME COSTO DE LA PANTALLA: ");
        pantalla = teclado1.nextDouble();
        System.out.print("DAME COSTO DEL RATON: ");
        raton = teclado1.nextDouble();
        //Bloque de procesamiento de datos de entrada
        costoTotal = cpu + teclado + pantalla + raton;
        //Bloque de salidad de resultados
        System.out.println("EL COSTO TOTAL DEL COMPUTADOR ES DE: " + costoTotal);

    }
}
