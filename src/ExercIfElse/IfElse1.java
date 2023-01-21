package ExercIfElse;

public class IfElse1 {
    public static void main(String[] args) {
//        Desafio 1: Crie um programa que recebe uma nota ( pela classe Scanner)
//        e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria.
//        A regra é a seguinte:
//        Nota 7 ou mais: passou direto
//        Entre 5 e 7: tem direito de fazer uma prova de recuperação
//        Abaixo de 5: reprovado direto

        Double nota = 4.99;
        if (nota >= 7){
            System.out.println("Passou direto.");
        }  if (nota >= 5) {
            System.out.println("Está de recuperação.");
        }else{
            System.out.println("Está reprovado.");
        }

    }
}
