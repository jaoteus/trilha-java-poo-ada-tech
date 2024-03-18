package classes_nao_executaveis.Animais;

public class Passaro extends Animal{

    public Passaro(String nome, String cor, int altura, double peso){
        super(nome, cor, altura, peso);
    }

    @Override
    public void comer(){
        System.out.println("passáro comendo");
    }

    @Override
    public void soar(){
        System.out.println("PIU PIU");
    }

    @Override
    public void dormir(){
        System.out.println("passáro dormindo");
    }
}