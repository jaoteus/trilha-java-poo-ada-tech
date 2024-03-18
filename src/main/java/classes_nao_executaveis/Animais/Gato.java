package classes_nao_executaveis.Animais;


public class Gato extends Animal{

    public Gato(String nome, String cor, int altura, double peso){
        super(nome, cor, altura, peso);
    }

    @Override
    public void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public void comer(){
        System.out.println("gato comendo");
    }

    @Override
    public void dormir(){
        System.out.println("gato dormindo");
    }
}