package classes_nao_executaveis;

import classes_nao_executaveis.Animais.Animal;
import classes_nao_executaveis.Animais.Cachorro;
import classes_nao_executaveis.Animais.Gato;
import classes_nao_executaveis.Animais.Passaro;
import classes_nao_executaveis.Lojas.Petshop;

import java.lang.StringBuilder;

public class Main {
    // uma classe descreve como um objeto vai ser
    private static StringBuilder nome = new StringBuilder("Mateus");

    public static void main(String[] args) {

        Gato gato1 = new Gato("puppy", "Marrom", 10, 1.7);

        // classe de referencia: Animal
        // classe verdadeira: Gato
        Animal gato2 = new Gato("Feliz", "Marrom", 10, 1.7);


        System.out.println(gato2.getAltura());
        gato2.soar();
    }
}
