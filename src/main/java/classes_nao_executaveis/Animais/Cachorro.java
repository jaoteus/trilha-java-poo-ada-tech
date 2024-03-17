package classes_nao_executaveis.Animais;

public class Cachorro {
    public String nome; // atributo nome
    public String cor;
    public int altura;
    public double peso; // irá receber ponto flutuante
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    // açoes do objeto
    public void comer(){}

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Pegou a bolinha";
    }

    public String interagir(String acao){
        if (acao.equalsIgnoreCase("carinho")) {
            this.estadoDeEspirito = "feliz demais";
        } else if (acao.equalsIgnoreCase("chute")) {
            this.estadoDeEspirito = "putasso com você";
        } else {
            this.estadoDeEspirito = "tá de boa";
        }
        return estadoDeEspirito;
    }
}
