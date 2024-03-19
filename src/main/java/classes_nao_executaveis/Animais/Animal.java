package classes_nao_executaveis.Animais;

// aula de herança

public abstract class Animal {
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

    public abstract void soar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }
}
