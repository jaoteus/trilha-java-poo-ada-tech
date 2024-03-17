package classes_nao_executaveis;

import classes_nao_executaveis.Animais.Cachorro;

public class Main {
    // uma classe descreve como um objeto vai ser

    public static void main(String[] args) {

        // criando um objeto
        Cachorro cachorro1;
        cachorro1 = new Cachorro();
        // pode-se criar desta maneira tambem: Cachorro cachorro1 = new Cachorro();

        // definindo os atributos do objeto
        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25;
        cachorro1.tamanhoDoRabo = 5;
        cachorro1.peso = 5.7;

        // System.out.println(cachorro1); // irá mostra o endereço do objeto na memória da JVM

        cachorro1.latir();// imprimi AU AU

        System.out.println(cachorro1.pegar());

        // interagindo com o cachorro
        System.out.println("O cachorro está " + cachorro1.interagir("chute"));
    }
}
