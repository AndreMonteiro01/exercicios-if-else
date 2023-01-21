package Aulas;

public class Aula5 {
    public static void main(String[] args) {
//        1. Faça um programa que receba três inteiros e diga qual deles
//         é o maior e qual o menor. Consegue criar mais de uma solução?
        Integer numero1 = 10;
        Integer numero2 = 20;
        Integer numero3 = 30;
        Integer numeroMaior = 0;
        Integer numeroMenor = 0;

        //  20     >   10   = True    30    >    20 = True
        if(numero2 > numero1 && numero3 > numero2){
            numeroMaior = numero3;

        }else if(numero3 < numero1 && numero1 > numero2 ){

        }else{
            numeroMenor = numero1;
        }
        System.out.println("O número maior é " + numeroMaior + " e o número menor " + numeroMenor);

        //o  da divisao voces trocam pelo %, que ele devolve o resto da divisao ai se
        // teve resto é impar se nao é par (no exercicios 2)
        Double valor = 21.0;
        Double reusltado = 0.0;


           if (valor % 2 != 0){
               System.out.println("O Número " + valor + " é ímpar");
           }else {
               System.out.println("O número " + valor + " é par" );
           }
    }
}
