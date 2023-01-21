package Aulas;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Integer valor1 = 0, valor2 =0, valor3 =0;
        Integer menorValor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor :");
        valor1 = scanner.nextInt();
        System.out.println("Informe o segundo valor :");
        valor2 = scanner.nextInt();
        System.out.println("Informe o terceiro valor :");
        valor3 = scanner.nextInt();
        
        if (valor1 < valor2 && valor1 < valor3){
            menorValor =  valor1;

        }if (valor2 < valor1 && valor2 < valor3){
            menorValor = valor2;

        }if (valor3 < valor2 && valor3 < valor1 ) {
            menorValor = valor3;
        }
        System.out.println("O menor valor é: " + menorValor);
    }
}
