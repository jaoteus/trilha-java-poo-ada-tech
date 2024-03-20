package treino_2.empresa;

import treino_2.pessoa.Pessoa;
import treino_2.pessoa.administrador.Administrador;
import treino_2.pessoa.cliente.Cliente;

public class Empresa {
    protected String nomeDaEmpresa = "Motorola";

    public void setNomeDaEmpresa(Administrador nomeDoAdministrador, String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }


}
