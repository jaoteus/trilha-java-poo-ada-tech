package classes_nao_executaveis;

import classes_nao_executaveis.Animais.Cachorro;
import classes_nao_executaveis.Animais.Gato;

public class Main {
    // uma classe descreve como um objeto vai ser

    public static void main(String[] args) {

        // criando um objeto

        Cachorro cachorro1 =
                new Cachorro(); // padrão

        Cachorro cachorro2 =
                new Cachorro("Puppy", "Marrom", 25, 5.7, 5);

        Cachorro cachorro3 =
                new Cachorro("Rex", "Marrom", 25, 5.7, 5);

        System.out.println(cachorro1.getNumerosCachorros());

        // pode ver que eles possuem endereço de memoria diferentes, mesmo que tenha os mesmos atributos:
        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());

        System.out.println("-------------------");
        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());
    }
}
