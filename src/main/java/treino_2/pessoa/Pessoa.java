package treino_2.pessoa;

import treino_2.pessoa.administrador.Administrador;
import treino_2.pessoa.cliente.Cliente;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected String idade;
    protected String senha;
    protected String numero;

    public Pessoa(String nome, String email, String idade, String senha, String numero){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
