package calculoConstrucao;// 1- pacote
// 2-Referências às bibiliotecas

import java.util.Scanner;

// 3-Classes
public class SistemaCompleto {

    // 3.1-Atributos

    static Scanner entrada = new Scanner(System.in);

    // 3.2-Métodos e Funções
    public static void main(String[] args) {  //primeiro método 'main' padrão

        // mensagem de saudação e explicação do sistema
        System.out.print("Esse sistema foi feito para calcular a quantidade de revestimento necessario para a sua parede, piso ou superficie.\n" +
                "Por favor siga os passos abaixo:\n");

        if (medidasSuperficie() > objetos()){
            escolherRevestimento();
            calcularQuantidade(); // realiza o cáculo da quantidade de peças do revestimento escolhido
        } else {
            System.out.println("Erro: A área dos objetos é maior do que a área da superfície.\n" +
                    "Verifique suas medidas.");
        }


    }

    public static double medidasSuperficie() { // receber informações das medidas do embiente
        double largura;
        double comprimento;


        System.out.println("Escreva a LARGURA em METROS da sua superficie no formato 00,00");
        largura = entrada.nextDouble(); // recebe informação 'largura' do usuário

        System.out.println("Escreva a COMPRIMENTO em METROS da sua superficie no formato 00,00");
        comprimento = entrada.nextDouble(); // recebe informação 'comprimento' do usuário

        return comprimento * largura; // retorna a área de acordo com as medidas do usuário
    }

    public static double objetos() {// receber informações dos objetos que não devem ser cobertos pelo revestimento
        String objeto;
        double larguraObjeto;
        double comprimentoObjeto;
        double areaTotalObjetos = 0;
        double areaObjeto;


        do {
            System.out.println("Existe algum elemento (porta, janela, interruptor etc) que não deve ser coberto pelo revestimento?\n" +
                    "Considere 's' para SIM e 'n' para NÃO");
            objeto = entrada.next().toLowerCase(); // recebe resposta do usuário

            if (objeto.equals("s")) {
                System.out.println("Digite a LARGURA em CENTIMETROS do elemento:");
                larguraObjeto = entrada.nextDouble();

                System.out.println("Digite o COMPRIMENTO em CENTIMETROS do elemento:");
                comprimentoObjeto = entrada.nextDouble();

                areaObjeto = (larguraObjeto * comprimentoObjeto);
                areaTotalObjetos += areaObjeto /10000;
            } else if (!objeto.equals("n")) {
                System.out.println("OPÇÃO INVALIDA! Digite 's' para SIM ou 'n' para NÃO.");
            }

        } while (objeto.equals("s"));
        return areaTotalObjetos;

    }

    public static double escolherRevestimento() { // escolher a opção de revestimento

        String revestimento;
        double larguraRevestimento = 0;
        double comprimentoRevestimento = 0;

        System.out.println("Escolha o seu revestimento de acordo com as letras abaixo:\n\n" +
                "(A) Azulejo branco e preto. 15x15cm\n" +
                "(B) Laminado marrom claro. 130x20cm\n" +
                "(C) Papel de parede cimento queimado. 300x60cm\n" +
                "(D) Porcelanato off-white. 60x60cm");

        revestimento = entrada.next().toUpperCase();

        switch (revestimento) {
            case "A":
                larguraRevestimento = 15;
                comprimentoRevestimento = 15;
                break;
            case "B":
                larguraRevestimento = 130;
                comprimentoRevestimento = 20;
                break;
            case "C":
                larguraRevestimento = 300;
                comprimentoRevestimento = 60;
                break;
            case "D":
                larguraRevestimento = 60;
                comprimentoRevestimento = 60;
                break;
            default:
                System.out.println("OPÇÃO INVALIDA, ESCOLHA NOVAMENTE!");
                //escolherRevestimento();
                break;

        }
        return (larguraRevestimento * comprimentoRevestimento) / 100;
    }


    public static void calcularQuantidade() {// realizar o cálculo
        double calculoTotal;
        String opcao;
        double areaSuperficie = medidasSuperficie();
        double areaTotalObjetos = objetos();
        double opcaoRevestimento = escolherRevestimento();

        calculoTotal = (areaSuperficie - areaTotalObjetos) / opcaoRevestimento;

        System.out.println("A quantidade de revestimento necessário para o seu ambiente de " + areaSuperficie + "m² é de " + calculoTotal + "peças.\n");
        System.out.println("Se deseja escolher outro revestimento digite 'R'\n" +
                "Se deseja realizar um novo cálculo digite 'N'\n" +
                "Se deseja finalizar seu atendimento digite 'E'\n");

        opcao = entrada.next().toUpperCase();

            switch (opcao) {
                case "R":
                    escolherRevestimento(); // voltar para escolha de opções
                    break;
                case "N":
                   break; // Não fazer nada aqui para evitar repetir os métodos de entrada

                case "E":
                    System.out.println("Finalizamos seu atendimento! Obrigado por utilizar o sistema.");
                    return; // Encerra o método
                default:
                    System.out.println("OPÇÃO INVALIDA, ESCOLHA NOVAMENTE!");
                    break;
            }
    }


// perguntar se deseja realizar novo cálculo
// finalizar

}

