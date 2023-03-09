import java.util.Scanner;

public class ArrayPartOne {

    public static void main(String[] args) {
//        String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };
//        // como alterar valor dentro do array
//        cardapio[3] = "frango";
//
//        System.out.println("Escolha o sabor");
//
//        for (int i = 0; i < cardapio.length; i++) {
//            System.out.println("[" + i + "] " + cardapio[i]);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o numero referente ao sabor: " );
//        Integer saborEscolhido = scanner.nextInt();
//
//        System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
//
//        scanner.close();

        //Não preciso declarar todos os itens de dentro do array
        String[] menu = new String[4];
        menu[0] = "Calabresa";
        menu[1] = "Atum";
        menu[2] = "Queijo";
        menu[3] = "Presunto";

        for (int i = 0; i < menu.length; i++) {
            System.out.println("[" + i + "] " + menu[i]);
        }

    }
}
