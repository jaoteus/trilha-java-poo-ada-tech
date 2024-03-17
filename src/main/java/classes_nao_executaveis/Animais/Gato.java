package classes_nao_executaveis.Animais;

public class Gato {
    public String cor;
    public String nome;
    public double tamanho;
    public int idade;

    public void miar(){
        System.out.println("miau miau");
    }

    public String pegarRato(int quantidadeDeRato){
        String string;
        if (quantidadeDeRato == 1){
            string = "Pegou " + quantidadeDeRato + " rato";
        } else if (quantidadeDeRato == 0){
            string = "Pegou nenhum rato";
        } else {
            string = "Pegou " + quantidadeDeRato + " ratos";
        }
        return string;
    }

    public void pularNoTelhado(){
        System.out.println("O gato está pulando no telhado");
    }
}
