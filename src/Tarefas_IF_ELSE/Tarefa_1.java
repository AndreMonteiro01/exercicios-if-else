package Tarefas_IF_ELSE;

import java.util.Scanner;

public class Tarefa_1 {
    public static void main(String[] args) {
        //https://professor.luzerna.ifc.edu.br/marcelo-cendron/wp-content/uploads/sites/40/2017/02/lista-exercicios-if-else.pdf
        //1. Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
        //informados	valores	iguais)	e	escrever	o	maior	deles

        //Variáveis.
        Double valor1 = 0.0;
        Double valor2 = 0.0;
        Double maiorNumero = 0.0;
        Scanner scanner = new Scanner(System.in);

        //Valores de entrada.
        System.out.println("Infome o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextDouble();

        //Lógica.
        if (valor1 > valor2 && valor2 < valor1){
            maiorNumero = valor1;
        }else {
            maiorNumero = valor2;
        }
        //Saída.
        System.out.println("O maior valor informado é: " + maiorNumero);
    }
}
