package classes_nao_executaveis.Lojas;

import classes_nao_executaveis.Animais.Animal;
import classes_nao_executaveis.Animais.Cachorro;
import classes_nao_executaveis.Animais.Gato;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoEspirito("tosado");
    }

    public void tosar(Gato gato){
        gato.setEstadoEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoEspirito("Saudade");
    }
}
