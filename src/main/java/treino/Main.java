package treino;

import treino.dispositivo.Dispositivo;
import treino.dispositivo.laptop.Laptop;
import treino.dispositivo.smartband.SmartBand;
import treino.dispositivo.smartphone.Smartphone;
import treino.dispositivo.pendrive.PenDrive;
import treino.loja.Loja;

public class Main {
    public static void main(String[] args) {
        Dispositivo laptop =
                new Laptop("Dell", "Inspiron 5510", 2022, 4450.0, 34, true);
        Dispositivo smartphone =
                new Smartphone("Motorola", "G52", "Branco", 2022, 1345.0, 45);
        Dispositivo smartBand =
                new SmartBand("Xiaomi", "Mi Band 5", 2018, 450.0, 234, "Preto");
        Dispositivo penDrive =
                new PenDrive("San Disk", "Cruzer Blade", 2023, 34.0, 67, 32);

        Loja loja = new Loja();

        // testando
        penDrive.ligar();
        penDrive.desligar();

        System.out.println(laptop.getEstoque());

        System.out.println(penDrive.getAnoLancamento());
        System.out.println(((PenDrive) penDrive).getCapacidadeDeArmazenamento());
        System.out.println(Dispositivo.getQuantidadeDeDispositivos());

        loja.vender(smartphone);
        loja.vender(smartBand);
        loja.vender(laptop);
        loja.vender(laptop);
        System.out.println(Dispositivo.getQuantidadeDeDispositivosVendidos());
    }
}
