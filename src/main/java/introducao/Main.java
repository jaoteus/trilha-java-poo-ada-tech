package introducao;

class Main {
    // a JVM irá procurar pelo método main
    public static void main(String[] args){ // metodo main deve ser estático e publico
        // não irá retornar nenhum valor (void) e o nome DEVE ser main e deve receber como parametro um array de String
        // ou varargs
        System.out.println("Hello World");

        // tipos primitivos
//        byte varByte = 130; NÃO IRÁ FUNCIONAR, byte é apenas -128...127
        byte varByte = 120;
        varByte = 127;
        System.out.println(varByte);

        // short -32768...32767
        // char 0... 65535
        // int -2b...2b
        // long -9t...9t

        int varInt = 1324324;
        System.out.println(varInt);

    }
}
