import java.util.Scanner;

public class Adivinas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;
        numero = (int) (Math.random() * 100);
        boolean bandera = true;
        int contador = 1;
        System.out.println("Tienes que adivinar el numero, introduce el numero que quieras hasta adivinarlo desde el 0 al 100.");
        while (bandera == true) {
            int intento = teclado.nextInt();
            if (intento < numero) {
                System.out.println("Escribe un numero mayor. Intentos= " + contador);
                contador = contador + 1;
            }
            else if (intento > numero) {
                System.out.println("Escribe un numero menor  Intentos= " + contador);
                contador = contador + 1;
            } else {
                bandera = false;
            }
        }
        System.out.println("GENIAL HAS ACERTADO EL NUMERO ERA " + numero);
        System.out.println("HAS ACERTADO EL NUMERO EN ESTOS INTENTOS: " + contador);

    }
}
