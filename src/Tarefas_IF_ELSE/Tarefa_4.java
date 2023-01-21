package Tarefas_IF_ELSE;

import java.util.Scanner;

public class Tarefa_4 {
    public static void main(String[] args) {
//        As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma
//        dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um
//        programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o
//        valor	total	da	compra

        //Variáveis
        Double menosDuzia = 0.30;
        Double acimaDuzia = 0.25;
        Double valorPagar = 0.0;
        Integer duzia =12;
        Integer quantidadeMacaComprada = 0;
        Scanner scanner = new Scanner(System.in);

        //Entrada.
        System.out.println("Informe a quantidade de maça compradas? ");
        quantidadeMacaComprada = scanner.nextInt();

        //Lógica e saída.
        valorPagar = quantidadeMacaComprada * acimaDuzia;

        if (quantidadeMacaComprada >= duzia){
            System.out.println("Você comprou 12 ou mais maças, pelo preço de " + acimaDuzia + " centavos o preço total da compra é " + valorPagar + " reais.");

        }else {
            valorPagar = quantidadeMacaComprada * menosDuzia;
            System.out.println("Você comprou menos do que uma dúzia de maças, pelo preço de " + menosDuzia + " centavos o valor a ser pago é " + valorPagar + " reais.");
        }
    }
}
