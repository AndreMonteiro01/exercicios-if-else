package Aulas;

public class Aula3 {
    public static void main(String[] args){
        //System.out.println();//sout, preenche automatico.
        // Operadores lógicos == vai comparar se dois valores é () -> iguais
        // != Se os valores são diferentes
        // > Sinal de maior fazer a validação q o da esquerda é maio do q da direita
        // < Sinal de menor fazer a validação q o da direita  é menor do q da esquerda

        //Integer valor1 = 10;
        //Integer valor2 = 20;

        //System.out.println(valor1 == valor2);
        //System.out.println(valor1 != valor2);
        //System.out.println(valor1 > valor2);
        //System.out.println(valor1 < valor2);
        //System.out.println(valor1 >= valor2);
        //System.out.println(valor1 <= valor2);

//        Operadores && e ||
//        Integer valor= 1;
//        System.out.println(valor > 1 && valor <= 5);
//        System.out.println(valor > 1 || valor <= 5);

//        Double valor1 = 2.2;
//        Double valor2 = 2.22;

        //Valor será FALSE pq valor1 e valor são diferentes
        //System.out.println(valor1 == valor2 );

        //O resultado é TRUE pq o operador relacional é DIFERENTE
        // e os valores são diferentes.
        //System.out.println(valor1 != valor2);

        //O resultado é FALSE pq o valor1 é menor do q o valor2
        //o operador relacional é de MAIOR.
        //System.out.println(valor1 > valor2);

        //O resultado será TRUE pq o valor1 é MENOR do q o valor2, o
        //operador relacional é de MENOR.
        //System.out.println(valor1 < valor2);

        //O resultado é FALSE pq os valores são diferentes e valor1 é menor
        // do q o valor2, o operador relacional é de maior ou igual.
        //para ser verdadeiro teria q trocar os valores.
        //System.out.println(valor1 >= valor2);

        //O resultado é TRUE pq valor1 é menor q valor2 e
        //o operador relacional está direcionado para o valor2
        //que é maior do q o valor1.
        //System.out.println(valor1 <= valor2);

//  Operadores lógicos
//        100, esta entre 10 , 101
//        100 esta entre 99 e 100
//        100 é maior que 100 e menor que 101
        Integer valor= 100;

        //O resultado é TRUE pq o valoré maior que 10 e menor do q 101.
        System.out.println(valor >= 10 && valor <= 101);

        //O resultado é TRUE pq valor é maior q 99 e valor é igual a 100.
        System.out.println(valor >= 99 && valor <= 100);

        //O resultado é TRUE pq valor é igual a 100 evalor é menor do q 101.
        System.out.println(valor > 100 && valor < 101);

    }
}
