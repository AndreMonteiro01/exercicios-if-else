package ExercIfElse;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
//        Exercícios sobre IF ELSE em Java
//        Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, comprimento e área desta.

        Double raio = 0.0;
        Double diametro = 0.0;
        Double comprimento = 0.0;
        Double area = 0.0;
        final Integer raioVezesDois = 2;
        final Double pi = 3.14;
        final Integer Exponencial = 0;
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Informe o valor do raio? ");
        raio = scanner.nextDouble();

        diametro =  raio * raioVezesDois;
        comprimento = diametro * pi;
        area = pi * (raio * raio );

        System.out.println("O valor do raio é: " + raio + " então o diâmetro: " + diametro + " comprimento: " + comprimento + " e área é: " + area);
    }
}
