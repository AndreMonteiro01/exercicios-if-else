package SENAI;

import org.w3c.dom.ls.LSOutput;

public class Exerc1 {
    public static void main(String[] args) {
//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e
// R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o
// número de maçãs compradas, calcule e escreva o custo total da compra.

        Double precoUnitarioOuMenosQueUmaDuzia = 1.30;
        Double precoAcimaDeUmaDuzia = 1.00;
        Integer quantidade = 0;
        Double totalCompra = 0.0;

        System.out.println("Informe a quantidade de maças que deseja: " );

        if (quantidade < 12){
            System.out.println("O preço da maça é: " + precoUnitarioOuMenosQueUmaDuzia + " rais.");
        }else {
            System.out.println("O preço da maça é: " + precoAcimaDeUmaDuzia + " rais.");
        }
    }
}
