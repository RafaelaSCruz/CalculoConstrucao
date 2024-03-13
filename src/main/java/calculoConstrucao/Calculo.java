package calculoConstrucao;

public class Calculo extends Material {
    static String opcao = new String();
    static Base calculoBase = new Base();
    static ObjetosExtras calculoObjetos = new ObjetosExtras();
    double quantidadeTotal=

    public static void calcularQuantidade() {
        double ladoA;
        double ladoB;
        double areaMaterial;
        double quantidade;

        switch (Material.escolherMaterial()) {
            case "1":
                System.out.println("Você escolheu a opção 1- Azulejo 15x15cm\n");
                ladoA = 15;
                ladoB = 15;
                areaMaterial = (ladoA * ladoB) / 100;
                quantidade = (int) Math.ceil(quantidadeTotal);
                System.out.println("A quantidade de material necessário para o seu ambiente é de " + quantidade + " peças.");
                break;

            case "2":
                System.out.println("Você escolheu a opção 2- Madeira Laminada 130x20cm\n");
                ladoA = 130;
                ladoB = 20;
                areaMaterial = (ladoA * ladoB) / 100;
                quantidade = (int) Math.ceil(quantidadeTotal);
                System.out.println("A quantidade de material necessário para o seu ambiente é de " + quantidade + " peças.");
                break;

            case "3":
                System.out.println("Você escolheu a opção 3- Papel de Parede 300x60cm\n");
                ladoA = 300;
                ladoB = 60;
                areaMaterial = (ladoA * ladoB) / 100;
                quantidade = (int) Math.ceil(quantidadeTotal);
                System.out.println("A quantidade de material necessário para o seu ambiente é de " + quantidade + " peças.");
                break;
            default:
                System.out.println("Opção inválida, escreva novamente.");
                escolherMaterial();

        do {
            System.out.println("Gostaria de escolher outro material? Escreva 'S' para sim e 'N' para não");
            opcao = valor.next().toUpperCase();

            if (opcao.equals("S")) {
                escolherMaterial();
                calcularQuantidade();
            } else if (opcao.equals("N")) {
                System.out.println("Obrigado pela preferência!");

            } else {
                System.out.println("Opção inválida, escreva novamente.");
            }

        } while (opcao.equals("S"));
        System.out.println("Obrigado pela preferência!");
    }
}

}

