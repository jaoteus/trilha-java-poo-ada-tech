package treino.dispositivo.pendrive;

import treino.dispositivo.Dispositivo;

public class PenDrive extends Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anoLancamento;
    protected double preco;
    protected int estoque;
    protected int capacidadeDeArmazenamento;

    public PenDrive(String marca, String modelo, int anoLancamento, double preco, int estoque, int capacidadeDeArmazenamento){
        super(marca, modelo, anoLancamento, preco, estoque);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public void ligar(){
        System.out.println("você não pode ligar um pen drive bro!");
    }

    @Override
    public void desligar(){
        System.out.println("Se você não pode ligar, também não pode desligar um pen drive bro!");
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }
}
