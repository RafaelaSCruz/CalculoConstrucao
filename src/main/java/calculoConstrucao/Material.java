package calculoConstrucao;

public class Material extends Executa {

    // Escolher peça (azulejo, madeira ou papel de parede)
    public static void escolherMaterial() {
        String material;
        System.out.println("ESCOLHA O TIPO DO MATERIAL: \n" +
                "1- Azulejo 15x15cm\n" +
                "2- Madeira Laminada 130x20cm\n" +
                "3- Papel de Parede 300x60cm\n" +
                "COLOQUE O NÚMERO DA OPÇÃO DESEJADA: ");
        material = valor.next();

//toDo: refazer projeto com metodos e funções na mesma classe.
    }
}
