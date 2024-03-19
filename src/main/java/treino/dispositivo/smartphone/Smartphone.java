package treino.dispositivo.smartphone;

import treino.dispositivo.Dispositivo;
public class Smartphone extends Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anoLancamento;
    protected double preco;
    protected int estoque;
    protected String cor;
    public Smartphone(String marca, String modelo, String cor, int anoLancamento, double preco, int estoque){
        super(marca, modelo, anoLancamento, preco, estoque);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
