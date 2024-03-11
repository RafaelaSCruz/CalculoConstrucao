
// 1-Pacote
package calculoConstrucao;
// 2-Referências às bibiliotecas

import java.util.Scanner;

// 3-Classes
public class Medidas {
    // 3.1-Atributos
    // 3.2-Métodos e Funções
    static Scanner valor = new Scanner(System.in);
    static String opcao;
    static String material;
    static double largura;
    static double comprimento;
    static double larguraObjeto;
    static double comprimentoObjeto;
    static double areaBase;
    static double areaObjeto;
    static double areaMaterial;
    static double quantidadeTotal = areaBase - (areaObjeto++) / areaMaterial;
    static int quantidade;

    public static void main(String[] args) {
        valor = new Scanner(System.in);

        System.out.println("Esse sistema foi feito para calcular o material necessário para o seu ambiente,escolha entre as opções abaixo e coloque as informações referentes ao seu espaço.");

        // Inserir largura
        System.out.println("Insira a largura: no formato X,Y ");
        largura = valor.nextDouble();

        // Inserir comprimento
        System.out.println("Insira o comprimento: no formato X,Y ");
        comprimento = valor.nextDouble();
        areaBase = comprimento * largura;

        objetosExtras();
        escolherMaterial();
        calcularQuantidade();
        finalizarCalculo();
    }


    // Existem portas. janelas ou alguma área que não pode ser coberta com o material? Se sim, qual a medida (largura e comprimento)
    static void objetosExtras() {

        do {
            System.out.println("Existem portas, janelas, interruptor ou algum objeto que não deve ser coberto com o material? Escreva 'S' para sim e 'N' para não");
            opcao = valor.next().toUpperCase();

            if (opcao.equals("S")) {
                System.out.println("Insira a largura do objeto em centímetros: ");
                larguraObjeto = valor.nextDouble();

                System.out.println("Insira o comprimento do objeto em centímetros: ");
                comprimentoObjeto = valor.nextDouble();

                areaObjeto = (larguraObjeto * comprimentoObjeto) / 100;
                int objeto = 1;

                System.out.println("Area do objeto " + (objeto++) + " é " + areaObjeto);

            } else if (opcao.equals("N")) {
                System.out.println("Não há objetos para serem calculados");

            } else {
                System.out.println("Opção inválida, escolha novamente.");

            }


        } while (opcao.equals("S"));
        quantidadeTotal = areaBase - areaObjeto;
        System.out.println("Prossiga.");
    }

    // Escolher peça (azulejo, madeira ou papel de parede)
    public static void escolherMaterial() {
        System.out.println("ESCOLHA O TIPO DO MATERIAL: \n" +
                "1- Azulejo 15x15cm\n" +
                "2- Madeira Laminada 130x20cm\n" +
                "3- Papel de Parede 300x60cm\n" +
                "COLOQUE O NÚMERO DA OPÇÃO DESEJADA: ");
        material = valor.next();


    }

    // Calcular a quantidade
    public static void calcularQuantidade() {

        double ladoA;
        double ladoB;


        switch (material) {
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
        }
    }

    public static void finalizarCalculo() {


        do {
            System.out.println("Gostaria de escolher outro material? Escreva 'S' para sim e 'N' para não");
            opcao = valor.next().toUpperCase();

            if (opcao.equals("S")) {
                escolherMaterial();

            } else if (opcao.equals("N")) {
                System.out.println("Obrigado pela preferência!");

            } else {
                System.out.println("Opção inválida, escreva novamente.");
            }

        } while (opcao.equals("S"));
        System.out.println("Obrigado pela preferência!");
    }
}




