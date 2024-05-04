package Main;

import Model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Produto bronze = new Produto(001, "Bronze", 150, 1000){};

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
                        System.out.print("5 - Sair\n");
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
                                break;
                            case 4:
                                break;
                        }
                    }
                    while (selecaoEstoque != 5);
                    break;
                case 2:
                    int selecaoProduto;
                    do {
                        System.out.print("   Estoque   \n");
                        System.out.print("1 - Listar pordutos\n");
                        System.out.print("2 - Procurar porduto\n");
                        System.out.print("3 - Sair\n");
                        System.out.print("⭢");
                        selecaoProduto = scanner.nextInt();

                        switch (selecaoProduto) {
                            case 1:
                                estoque.listarProdutos();
                                break;
                            case 2:
                                estoque.pesquisar("Bronze");
                                break;
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
