package treino.dispositivo;

public abstract class Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anoLancamento;
    protected double preco;
    protected int estoque;
    protected static int quantidadeDeDispositivos;
    protected static int quantidadeDeDispositivosVendidos;

    public Dispositivo(String marca, String modelo, int anoLancamento, double preco, int estoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.estoque = estoque;
        quantidadeDeDispositivos ++;
    }

    public void ligar(){
        System.out.println(this.modelo + " está ligando");
    }

    public void desligar(){
        System.out.println(this.modelo + " está desligando");
    }

    // Getters e Setters

    public static int getQuantidadeDeDispositivos() {
        return quantidadeDeDispositivos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public static void setQuantidadeDeDispositivosVendidos() {
        Dispositivo.quantidadeDeDispositivosVendidos ++;
    }

    public static int getQuantidadeDeDispositivosVendidos() {
        return quantidadeDeDispositivosVendidos;
    }
}