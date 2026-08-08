import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    imprimirTitulo();

    int opcaoEscolhida = -1;
    while(opcaoEscolhida != 0){
        imprimirOpcoesPrincipais();
        opcaoEscolhida = scanner.nextInt();

        switch (opcaoEscolhida){
            case 0:
                break;
            case 1:
                //chamar função de reserva;
                break;
            case 2:
                imprimirCardapio();
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }
    }

        System.out.println("Programa encerrado, espero que aproveite nosso jantar em breve!");
    }

    static void imprimirTitulo(){
        System.out.println("--------------------");
        System.out.println("|-CANTINA DA NONNA-|");
        System.out.println("--------------------");
    }
    static void imprimirOpcoesPrincipais(){
        System.out.println("O que deseja fazer ?");
        System.out.println("1- Reserva");
        System.out.println("2- Consultar Cardápio");
        System.out.println("0- Encerrar programa");
    }
    static void imprimirCardapio(){
        //List<String> categorias = new ArrayList<>();
       /* categorias.add("Massas");
        categorias.add("bebidas");
        categorias.add("Pizzas");
        categorias.add("Sobremesas");
        categorias.add("Aperitivos");*/

        //List<String> categorias = List.of("Massas","Bebidas","Pizzas","Sobremesas","Aperitivos");

        Map<String, List<String>> cardapio = new HashMap<>();
        cardapio.put("Massas: ", List.of("lasanha", "Spaguete", "Talharim", "Penne"));
        cardapio.put("Bebidas: ",List.of("Suco de laranja", "Refrigerantes", "Vodka", "Agua de coco") );

        for(String cardapioChaveAtual : cardapio.keySet() ) {
            System.out.println("*" + cardapioChaveAtual);
            List<String> categoriaAtual = cardapio.get(cardapioChaveAtual);
            for (int pos = 0; pos < categoriaAtual.size(); pos++){
                System.out.println("--" + categoriaAtual.get(pos));
            }
        }

        /*System.out.println(categorias.get(0));
        System.out.println(categorias.get(1));
        System.out.println(categorias.get(2));
        System.out.println(categorias.get(3));
        System.out.println(categorias.get(4));*/


    }
}
