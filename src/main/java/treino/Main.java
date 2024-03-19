package treino;

import treino.dispositivo.Dispositivo;
import treino.dispositivo.laptop.Laptop;
import treino.dispositivo.smartband.SmartBand;
import treino.dispositivo.smartphone.Smartphone;
import treino.dispositivo.pendrive.PenDrive;

public class Main {
    public static void main(String[] args) {
        Laptop laptop =
                new Laptop("Dell", "Inspiron 5510", 2022, 4450.0, 34, true);
        Smartphone smartphone =
                new Smartphone("Motorola", "G52", "Branco", 2022, 1345.0, 45);
        SmartBand smartBand =
                new SmartBand("Xiaomi", "Mi Band 5", 2018, 450.0, 234, "Preto");
        PenDrive penDrive =
                new PenDrive("San Disk", "Cruzer Blade", 2023, 34.0, 67, 32);


        // testando
        penDrive.ligar();
        penDrive.desligar();

        System.out.println(laptop.getEstoque());

        System.out.println(penDrive.getAnoLancamento());
        System.out.println(penDrive.getCapacidadeDeArmazenamento());
        System.out.println(Dispositivo.getQuantidadeDeDispositivos());

    }
}
