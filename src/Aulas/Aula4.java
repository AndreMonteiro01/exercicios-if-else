package Aulas;

public class Aula4 {
    public static void main(String[] args) {
        //Fazer a validacao se o numero 10 esta entre 0 e 20
        //sempre que eu colar entre a gente usa apenas > 0 e < 20
        // caso o 10 esteja entre 0 e 20, printar no console "numero x esta entre 0 e 20"
        // caso nao esteja entre 0 e 20, printar no console "numero x nao esta entre 0 e 20"

//
//        Integer x= 10;
//
//        if (x > 0 && x < 20){
//            System.out.println("O número " + x + " está entre 0 e 20." );
//        }else{
//            System.out.println("O número " + x +  " não está entre 0 e 20.");
//        }
//
//        //Fazer a validacao se o numero 21 esta entre 0 e 20
//        //sempre que eu colar entre a gente usa apenas > 0 e < 20
//        // caso o 10 esteja entre 0 e 20, printar no conso
//        Integer y= 21;
//
//        if (y > 0 && y < 20){
//            System.out.println("O número " + y + " está entre 0 e 20." );
//        }else{
//            System.out.println("O número " + y +  " não está entre 0 e 20.");
//        }
        //0. Escreva um programa que receba o raio de uma circunferência e mostre o
        // diâmetro, comprimento e área desta.
        //"O diametro do raio x é X, o comprimento é Y e a area é Z"
//        x = raio
//        X = diametro
//        Y = comprimento
//        Z = area
//        diametro = raio * 2;
//        comprimento = diametro *  pi;
//        Math.pow(raio, 2);

        Integer raio= 20;
        Integer diametro= 0;
        Double comprimentro= 0.0;
        Double area=0.0;
        final Double pi= 3.14;
        final Integer Exponencial= 0;

        diametro= raio * 2;
        comprimentro= diametro * pi;
        area= pi * Math.pow(raio,Exponencial);

        System.out.println("O raio é de " + raio + " e o diâmentro é " + diametro + " o comprimento é " + comprimentro + " e a área é " + area);
    }
}
