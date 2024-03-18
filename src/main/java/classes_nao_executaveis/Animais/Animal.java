package classes_nao_executaveis.Animais;

// aula de herança

public class Animal {
    protected String nome;
    protected String cor;
    protected double altura;
    protected double peso;
    protected String estadoEspirito;


    public Animal(String nome, String cor, int altura, double peso){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }


    public void comer(){}

    public void dormir(){}

    public void soar(){}
}
