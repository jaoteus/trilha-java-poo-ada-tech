package classes_nao_executaveis.Animais;

public class Cachorro extends Animal{
    protected int alturaDoRabo;

    public Cachorro(String nome, String cor, int altura, double peso, int alturaDoRabo){
        super(nome, cor, altura, peso);
        this.alturaDoRabo = alturaDoRabo;
    }

    @Override
    public void dormir() {
        System.out.println("cachorro dormindo");
    }

    @Override
    public void soar(){
        System.out.println("AU AU");
    }

    @Override
    public void comer(){
        System.out.println("cachorro comendo");
    }
}