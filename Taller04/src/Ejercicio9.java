
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        //Declaracion de datos de entrada
        double base, altura, areaRectangulo, areaTriangulo, areaCuadrado, areatotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME VALOR DE LA BASE: ");
        base = teclado.nextDouble();
        System.out.print("DAME VALOR DE LA ALTURA: ");
        altura = teclado.nextDouble();
        //Bloque de Procesamiento de datos de entrada
        areaRectangulo = base * altura;
        areaTriangulo = ((base * altura) / 2) * 3;
        areaCuadrado = Math.pow(altura, 2);
        areatotal = areaRectangulo + areaTriangulo + areaCuadrado;

        //Bloque de salida de resultados
        System.out.println("VALOR DEL AREA DEL RECTANGULO ES: " + areaRectangulo);
        System.out.println("VALOR DEL AREA DEL TRIANGULO ES: " + areaTriangulo);
        System.out.println("VALOR DEL AREA DEL CUADRARO: " + areaCuadrado);
        System.out.println("EL AREA TOTAL ES :" + areatotal);

    }
}
