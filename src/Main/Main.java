package Main;

import Model.*;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {


        //Criações para testes
        Estoque estoque = new Estoque();
        Produto bronze = new Produto( "Bronze", 150, 8000){};
        Produto aco = new Produto( "aço", 300,562){};


        estoque.listarProdutos();
        estoque.criarProduto(bronze);
        estoque.listarProdutos();


        estoque.abrirEstoque();
        estoque.criarProduto(bronze);
        estoque.listarProdutos();
        estoque.criarProduto(aco);
        estoque.listarProdutos();
        estoque.pesquisar("aluminio");
        estoque.pesquisar("Bronze");

        //==============================================================================================================

        Scanner scanner = new Scanner(System.in);
        int selecaoMenu;

        do {
            System.out.print("    Menu    \n");
            System.out.print("1 - Estoque\n");
            System.out.print("2 - Produtos\n");
            System.out.print("3 - Sair\n");
            System.out.print("⭢");
            selecaoMenu = scanner.nextInt();

            switch (selecaoMenu) {
                case 1:
                    int selecaoEstoque;
                    do {
                        System.out.print("   Estoque   \n");
                        System.out.print("1 - Abrir estoque\n");
                        System.out.print("2 - Fechar estoque\n");
                        System.out.print("3 - Listar pordutos\n");
                        System.out.print("4 - Pesquisar\n");
                        System.out.print("5 - Entrada de produto\n");
                        System.out.print("6 - Saída de produto\n");
                        System.out.print("7 - Sair\n");
                        System.out.print("⭢");
                        selecaoEstoque = scanner.nextInt();

                        switch (selecaoEstoque){
                            case 1:
                                estoque.abrirEstoque();
                                break;

                            case 2:
                                estoque.fecharEstoque();
                                break;

                            case 3:
                                estoque.listarProdutos();
                                break;

                            case 4:
                                System.out.println("Pesquise: ");
                                String nome = scanner.next();
                                estoque.pesquisar(nome);
                                break;

                            case 5:
                                System.out.println("Produto: ");
                                String nomeProduto = scanner.next();
                                System.out.println("Quatidade: ");
                                int quatidadeProduto = scanner.nextInt();
                                Produto novoProduto = new Produto(nomeProduto, quatidadeProduto) {
                                };
                                estoque.acrescentarProduto(novoProduto, quatidadeProduto);
                                break;

                            case 6:
                                System.out.println("Nome do produta para retirada: ");
                                String nomeProd = scanner.next();
                                System.out.println("Quatidade: ");
                                int quatidade = scanner.nextInt();

                                estoque.retirarProduto(nomeProd, quatidade);
                                break;

                            default:
                                System.out.println("Seleçaõ inválida");
                        }
                    }
                    while (selecaoEstoque != 7);
                    break;

                case 2:
                    int selecaoProduto;
                    do {
                        System.out.print("   Produtos   \n");
                        System.out.print("1 - Listar pordutos\n");
                        System.out.print("2 - Procurar porduto\n");
                        System.out.print("3 - Criar produto\n");
                        System.out.print("4 - Excluir produto\n");
                        System.out.print("5 - Sair\n");
                        System.out.print("⭢");
                        selecaoProduto = scanner.nextInt();

                        switch (selecaoProduto) {
                            case 1:
                                estoque.listarProdutos();
                                break;

                            case 2:
                                String nome = scanner.next();
                                estoque.pesquisar(nome);
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Seleçaõ inválida");
                        }
                    }
                    while (selecaoProduto != 3);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Seleçaõ inválida");
            }
        }
        while (selecaoMenu != 3);
    }
}
