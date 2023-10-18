
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es par o impar");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("el numero no es par");
        }

        System.out.println("introduce un numero para ver su tabla de multiplicar");
        int tabla = teclado.nextInt();
        int indice = 0;
        int resultado = 0;
        while (indice <= 10) {
            resultado = tabla * indice;
            System.out.println(tabla + " x " + indice + "= " + resultado);
            indice++;

        }
        System.out.println("______________________________________");
        System.out.println("TABLA CON FOR");
        System.out.println("Introduce un numero para la tabla de multiplicar");
        tabla = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = tabla * i;
            System.out.println(tabla + " x " + i + "= " + resultado);

        }
    }
}
