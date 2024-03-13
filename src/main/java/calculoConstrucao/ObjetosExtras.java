package calculoConstrucao;

public class ObjetosExtras extends Executa {
    // Existem portas. janelas ou alguma área que não pode ser coberta com o material? Se sim, qual a medida (largura e comprimento)
    String opcao = new String();
    static double larguraObjeto;
    static double comprimentoObjeto;
    static double areaObjeto;

    public void somarObjetos() {

        do {
            System.out.println("Existem portas, janelas, interruptor ou algum objeto que não deve ser coberto com o material? Escreva 'S' para sim e 'N' para não");
            opcao = valor.next().toUpperCase();

            if (opcao.equals("S")) {
                System.out.println("Insira a largura do objeto em centímetros: ");
                larguraObjeto = valor.nextDouble();

                System.out.println("Insira o comprimento do objeto em centímetros: ");
                comprimentoObjeto = valor.nextDouble();

                areaObjeto += (larguraObjeto * comprimentoObjeto) / 100;
                int objeto = 1;

                System.out.println("Area do objeto " + objeto + " é " + areaObjeto);

            } else if (opcao.equals("N")) {
                System.out.println("Não há objetos para serem calculados");

            } else {
                System.out.println("Opção inválida, escolha novamente.");
            }

        } while (opcao.equals("S"));
        System.out.println("Prossiga.");
    }

}
