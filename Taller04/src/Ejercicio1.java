
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Declaracion de datos o variable 
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //Ingreso de datos de entrada
        System.out.print("DAME LA BASE: ");//Carpinteria de salida
        base = teclado.nextDouble();// Datos de entrada
        System.out.print("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        //Procesamineto de datos de entrada
        area = (base * altura) / 2;
        //Presentacion de datos de salida
        System.out.println("Area del triangulo es = " + area);

    }
}
