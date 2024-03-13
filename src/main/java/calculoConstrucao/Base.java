package calculoConstrucao;

import java.util.Scanner;

public class Base {

    public void areaBase(){
        double largura;
        double comprimento;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse sistema foi feito para calcular o material necessário para o seu ambiente,escolha entre as opções abaixo e coloque as informações referentes ao seu espaço.");

        // Inserir largura
        System.out.println("Insira a largura: no formato X,Y ");
        largura = scanner.nextDouble();

        // Inserir comprimento
        System.out.println("Insira o comprimento: no formato X,Y ");
        comprimento = scanner.nextDouble();
        double areaBase = comprimento * largura;
        System.out.println("A área do ambiente informado é "+ areaBase);
    }
}
