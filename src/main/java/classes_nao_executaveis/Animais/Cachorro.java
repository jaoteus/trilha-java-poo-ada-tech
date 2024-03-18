package classes_nao_executaveis.Animais;

public class Cachorro {
    // variaveis staticas são da classe

    static int numerosCachorros; // só tem uma copia
    private String nome; // atributo nome
    private String cor;
    private int altura;
    private double peso; // irá receber ponto flutuante
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    // criando construtores: construtores facilitam a criação de objetos
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        numerosCachorros ++;
    }

    // construtor default
    public Cachorro() {
        numerosCachorros ++;
    }

    // açoes do objeto
    public void comer() {
    }

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "Pegou a bolinha";
    }

    public String interagir(String acao) {
//        if (acao.equalsIgnoreCase("carinho")) {
//            this.estadoDeEspirito = "feliz demais";
//        } else if (acao.equalsIgnoreCase("chute")) {
//            this.estadoDeEspirito = "putasso com você";
//        } else {
//            this.estadoDeEspirito = "tá de boa";
//        }

        // para ser mais performatico, utilize o switch case:
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz demais";
                break;
            case "chute":
                this.estadoDeEspirito = "putasso com você";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "tá de boa";
                break;
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                '}';
    }
// Getters e Setters: serve para acessar os atributos da classe.

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

    public int getAltura() {
        return altura;
    }

    public int getNumerosCachorros() {
        return numerosCachorros;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
}
