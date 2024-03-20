package treino_2.Main;

import treino_2.empresa.Empresa;
import treino_2.pessoa.Pessoa;
import treino_2.pessoa.administrador.Administrador;
import treino_2.pessoa.cliente.Cliente;
import treino_2.pessoa.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Pessoa cliente1 = new Cliente("Mateus", "", "20", "54354654tfd", "902384392843");
        Pessoa cliente2 = new Cliente("Lucas", "", "22", "dfsaer45gn", "0987263244343");
        Pessoa funciobario1 = new Funcionario("Jose", "", "45", "3432refbvcbvcbv", "98642453");
        Administrador administrador1 =
                new Administrador("Lana", "", "18", "r454t54gfbvc", "819843543");

        empresa.setNomeDaEmpresa(administrador1, "Motorola");
        System.out.println(empresa.getNomeDaEmpresa());

    }
}
