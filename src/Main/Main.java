package Main;

import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

import Enum.EnumForma;
import Enum.EnumMaterial;
import Enum.EnumMedida;
import Enum.EnumMercadoria;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque(){};
        Scanner scanner1 = new Scanner(System.in);

        //Criações para testes
        
        estoque.abrirEstoque();
        estoque.listarProdutos();

        Produto mercadoria1 = new Mercadoria("Sks", 40, 5, EnumMercadoria.ROLAMENTO, 20.30);
        Produto mercadoria2 = new Mercadoria("SAS", 20.50, 10, EnumMercadoria.RETENTOR, 20.30);
        Estoque.listaDeProdutos.add(mercadoria1);
        Estoque.listaDeProdutos.add(mercadoria2);

        Produto materia_Prima1 = new Materia_Prima("Tarugo", 1.20, 4350, EnumMaterial.FERRO, EnumForma.SEXTAVADA, 50);
        Produto materia_Prima2 = new Materia_Prima("Tarugo", 0.90, 2000, EnumMaterial.ALUMINIO, EnumForma.TUBO, 25.2);
        Produto materia_Prima3 = new Materia_Prima("Tarugo", 1.50, 1565, EnumMaterial.BRONZE, EnumForma.REDONDO, 80.2);
        Estoque.listaDeProdutos.add(materia_Prima1);
        Estoque.listaDeProdutos.add(materia_Prima2);
        Estoque.listaDeProdutos.add(materia_Prima3);


        Produto consumivel1 = new Consumivel("Oléo", 14, 3, 2.5, EnumMedida.LITRO_L);
        Produto consumivel2 = new Consumivel("eletrodo", 3.50, 4, 5, EnumMedida.PESO_G);
        Produto consumivel3 = new Consumivel("Oléo", 12, 1, 3, EnumMedida.LITRO_L);
        Estoque.listaDeProdutos.add(consumivel1);
        Estoque.listaDeProdutos.add(consumivel2);
        Estoque.listaDeProdutos.add(consumivel3);

        estoque.listarProdutos();
        
        //==============================================================================================================

        
        int selecaoMenu;

        do {
            System.out.print("    Menu    \n");
            System.out.print("1 - Estoque\n");
            System.out.print("2 - Produtos\n");
            System.out.print("3 - Sair\n");
            System.out.print("⭢");
            selecaoMenu = scanner1.nextInt();

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
                        selecaoEstoque = scanner1.nextInt();

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
                                String nome = scanner1.next();
                                estoque.pesquisar(nome);
                                break;

                            case 5:
                                System.out.println("Produto: ");
                                String nomeProduto = scanner1.next();
                                System.out.println("Quatidade: ");
                                int quatidadeProduto = scanner1.nextInt();
                                Produto novoProduto = new Produto(nomeProduto, quatidadeProduto) {
                                };
                                estoque.acrescentarProduto(novoProduto, quatidadeProduto);
                                break;

                            case 6:
                                System.out.println("Nome do produta para retirada: ");
                                String nomeProd = scanner1.next();
                                System.out.println("Quatidade: ");
                                int quatidade = scanner1.nextInt();

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
                        selecaoProduto = scanner1.nextInt();

                        switch (selecaoProduto) {
                            case 1:
                                estoque.listarProdutos();
                                break;

                            case 2:
                                String nome = scanner1.next();
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
