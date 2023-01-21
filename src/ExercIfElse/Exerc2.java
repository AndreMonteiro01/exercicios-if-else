package ExercIfElse;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        //Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.

        Integer valor1 = 0;
        Integer valor2 = 0;
        Integer valor3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.println("Informe o terceiro valor: ");
        valor3 = scanner.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("O maior número digitado foi o primeirio: " + valor1);

        }if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior número digitado é o segundo: " +valor2);

        }if(valor3 > valor1 && valor3 > valor2){
            System.out.println("O maior número digitado é o terceiro: " +valor3);
        }
    }
}
