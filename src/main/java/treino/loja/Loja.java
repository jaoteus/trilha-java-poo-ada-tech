package treino.loja;

import treino.dispositivo.Dispositivo;

public class Loja {

    public void vender(Dispositivo dispositivo){
        System.out.println("Vendendo " + dispositivo.getModelo());
        Dispositivo.setQuantidadeDeDispositivosVendidos();
    }
}
