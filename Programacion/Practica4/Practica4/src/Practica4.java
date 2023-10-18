import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) throws Exception {
        // Practica fibonacci

        int numero = 0;
        int numero2 = 1;
        int sumatorio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica la cantidad de numeros que quieres");
        int contador = teclado.nextInt();
        System.out.println("______________________");

        for (int i = 0; i < contador; i++) {
            sumatorio = numero + numero2;
            numero = numero2;
            numero2 = sumatorio;
            System.out.println(sumatorio);
        }

    }
}
