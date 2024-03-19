package treino.dispositivo.laptop;

import treino.dispositivo.Dispositivo;

public class Laptop extends Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anoLancamento;
    protected double preco;
    protected int estoque;
    protected boolean temTecladoRGB;

    public Laptop(String marca, String modelo, int anoLancamento, double preco, int estoque, boolean temTecladoRGB) {
        super(marca, modelo, anoLancamento, preco, estoque);
        this.temTecladoRGB = temTecladoRGB;
    }

    public boolean isTecladoRGB(){
        return temTecladoRGB;
    }

    public void setTemTecladoRGB(boolean temTecladoRGB) {
        this.temTecladoRGB = temTecladoRGB;
    }

    //    @Override
//    public void ligar(){
//        System.out.println("esse " + super.modelo + " está ligando");
//    }
}
