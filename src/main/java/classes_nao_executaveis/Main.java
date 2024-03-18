package classes_nao_executaveis;

import classes_nao_executaveis.Animais.Cachorro;
import classes_nao_executaveis.Animais.Gato;
import classes_nao_executaveis.Animais.Passaro;

public class Main {
    // uma classe descreve como um objeto vai ser

    public static void main(String[] args) {
        Gato gato1 = new Gato("puppy", "Marrom", 10, 1.7);
        Cachorro cachorro1 = new Cachorro("puppy", "Marrom", 10, 1.7, 5);
        Passaro passaro1 = new Passaro("nino", "amarelo", 5, 0.3);

        gato1.soar();
        cachorro1.soar();
        passaro1.soar();

        System.out.println("--------------------------");

        gato1.comer();
        cachorro1.comer();
        passaro1.comer();

        System.out.println("--------------------------");

        gato1.dormir();
        cachorro1.dormir();
        passaro1.dormir();
    }
}
