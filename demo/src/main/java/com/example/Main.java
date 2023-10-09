package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero1 = 10;
        int numero2 = 2;

        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        double division = numero1/numero2;
    
        System.out.println("Esta es la suma de "+numero1+ " + " +numero2+ " = "+suma);
        System.out.println("Esta es la resta de "+numero1+ " - " +numero2+ " = "+resta);
        System.out.println("Esta es la multiplicacion de "+numero1+ " x " +numero2+ " = "+multiplicacion);
        System.out.println("Esta es la divison de "+numero1+ " / " +numero2+ " = "+division);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Quieres realizar operaciones? 1 para si, 2 para salir.");

        int calculadora = teclado.nextInt();
        if (calculadora == 1) {
            System.out.println("Elije una de estas opciones para realizar operaciones con los numeros que elijas");
            System.out.println("Teclea 1 para sumar");
            System.out.println("Teclea 2 para restar");
            System.out.println("Teclea 3 para multiplicar");
            System.out.println("Teclea 4 para dividir");
            System.out.println("Teclea salir para salir del programa");
        int menu =teclado.nextInt();

        System.out.println("Teclea tu primer numero");
              double num1 = teclado.nextInt();
              System.out.println("Teclea tu segundo numero");
              double num2 = teclado.nextInt();
        switch(menu) {
            case 1:
              System.out.println("El resultado de la suma es: " +(num1+num2));
              break;
            case 2:
              System.out.println("El resultado de la resta es: "+(num1-num2));
              break;
            case 3:
              System.out.println("El resultado de la multiplicacion es: "+(num1*num2));
              break;
            case 4:
              System.out.println("El resultado de la division es: "+(num1/num2));
              break;
            default:
              System.out.println("i es mayor a tres.");
          }
            
        } else {
            System.out.println("Gracias por usar la aplicacion");
            
        }
    }
}