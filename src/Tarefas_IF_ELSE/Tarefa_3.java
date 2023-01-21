package Tarefas_IF_ELSE;

import java.util.Scanner;

public class Tarefa_3 {
    public static void main(String[] args) {
//        3. Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida
//        pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as
//        seguintes	mensagens:
//        ACESSO	PERMITIDO	caso	a	senha	seja	válida.
//                ACESSO	NEGADO	caso	a	senha	seja	inválida

        //Variáveis.
        Integer senha = 1234;
        Scanner scanner = new Scanner(System.in);

        //Entrada.
        System.out.println("Digite a senha: ");
        senha = scanner.nextInt();

        //Lógica e saída.
        if (senha == 1234){
            System.out.println("Acesso permitido. ");
        }else {
            System.out.println("Acesso negado");
        }

    }
}
