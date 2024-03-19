package treino.dispositivo.smartband;

import treino.dispositivo.Dispositivo;

public class SmartBand extends Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anoLancamento;
    protected double preco;
    protected int estoque;
    protected String corDaPulseira;

    public SmartBand(String marca, String modelo, int anoLancamento, double preco, int estoque, String corDaPulseira){
        super(marca, modelo, anoLancamento, preco, estoque);
        this.corDaPulseira = corDaPulseira;
    }

    public String getCorDaPulseira() {
        return corDaPulseira;
    }

    public void setCorDaPulseira(String corDaPulseira) {
        this.corDaPulseira = corDaPulseira;
    }
}
