package Aulas;

import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
//        1. Faça um programa, utilizando os operadores lógicos, que:
//
//        Pergunte ao usuário se ele está com fome e tem dinheiro
//        Apenas nos casos em que o usuário esteja com fome E possua dinheiro, indique um local que venda comida
//        Mostre na tela uma mensagem, de sua escolha, quando ele não estiver com fome ou não possuir dinheiro

        //Variáveis
        String estaComFome ;
        String temDinheiro ;
        Scanner ler = new Scanner(System.in);

        System.out.println("Menu \n Opção 1 Está com fome digite: sim. \n\n Opção 2 Sem fome digite: não.\n\n Opção 3 Tem dinheiro digite: sim.\n\n");

        System.out.println("Está com fome?");
        estaComFome = ler.next();
        System.out.println("Está comm dinheiro?");
        temDinheiro = ler.next();

        if (estaComFome.equals("sim")  && temDinheiro.equals("sim")){
            System.out.println("Dirija - se ao lado. Por favor! \nBom apetite! ");

        } else{
            System.out.println("Que pena, que você não irá comer.\nObrigado! ");
        }
    }
}
