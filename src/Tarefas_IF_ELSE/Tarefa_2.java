package Tarefas_IF_ELSE;

import java.util.Scanner;

public class Tarefa_2 {
    public static void main(String[] args) {
//        2. Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e
//        escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano
//                (não	é	necessário	considerar	o	mês	em	que	ela	nasceu).

        //Variáveis.
        Double anoNascimento = 0.0;
        final Integer anoAtual = 2023;
        final Integer idadeParaVotar = 18;
        Double resultado = 0.0;
        Scanner scanner = new Scanner(System.in);

        //Entrada.
        System.out.println("Qual o ano de nascimento? ");
        anoNascimento = scanner.nextDouble();

        //Lógica e saída.
        resultado = anoAtual - anoNascimento;

        if (resultado >= idadeParaVotar){
            System.out.println("Liberado para votar! ");
        }else {
            System.out.println("Infelizmente você ainda não pode votar.\nObrigado!");
        }
    }
}
