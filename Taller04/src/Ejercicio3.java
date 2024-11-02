
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Bloque de Procesamiento de datos de entrada

        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO ENTRE 2 Y 6: ");
        int num = teclado.nextInt();
        //Bloque de salida de resultados

        if (num >= 2 && num <= 6) {
            System.out.println("LA TABLA DE MULTIPLICACION DEL 4 " + num + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.println(num + "x" + i + "=" + (num * i));

            }

        } else {
            System.out.println("EL NUMERO QUE INGRESO NO ESTA ENTRE 2 Y 6 ");
        }

    }

}
