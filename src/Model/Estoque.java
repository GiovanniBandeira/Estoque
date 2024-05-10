package Model;

import Contrato.*;

import java.util.ArrayList;

public class Estoque implements IOperarEstoque, IOperarLista {
    public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    //Erlom
    //Produto[] prod;
    //public static boolean estadoEstoque = false;
    //==========


    public Estoque(){}
    /* 
    public Estoque(int tamanho){
        this.prod = new Produto[tamanho];
    }
   
    public void inserirNoVetor(Produto produto){
        for (int i = 0; i < prod.length; i++){
            if (prod[i] == null){
                this.prod[i] = produto;
                break;
            }
        }
    }
    */

    Estoque.estadoEstoque = estadoEstoque;
    public Estoque(ArrayList<Produto> listaDeProdutos, boolean estadoEstoque) {
        Estoque.listaDeProdutos = new ArrayList<>();


    //IOperarLista====================================================================================================

    @Override
    public void listarProdutos(){
        if (estadoEstoque) {
            if (listaDeProdutos != null) {
                System.out.println("Lista de Produtos:");
                for (Produto listaDeProduto : listaDeProdutos) {
                    System.out.println(listaDeProduto);
                }
            } else {
                System.out.println("Lista de produtos vazia\n");
            }
        }else {
            System.out.print("Estoque está fechado");
        }
    }

    @Override
    public void criarProduto(String nome, double preco, int quantidade){
        if (estadoEstoque) {
            Produto produtoNovo = new Produto(nome, preco, quantidade){};
            if (listaDeProdutos == null) {
                listaDeProdutos = new ArrayList<>();
            }
            listaDeProdutos.add(produtoNovo);
            System.out.println("Produto criado com sucesso!");
            System.out.println(produtoNovo);
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    @Override
    public void excluirProduto(String nome){
        if (estadoEstoque) {
            if (listaDeProdutos == null) {
                listaDeProdutos = new ArrayList<>();
            }
            for (Produto produto : listaDeProdutos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(produto);
                    listaDeProdutos.remove(produto);
                    System.out.println("Produto removido com sucesso!");
                }
            }
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    //IOperarEstoque====================================================================================================

    @Override
    public boolean abrirEstoque() {
        Estoque.estadoEstoque = true;
        System.out.println("Estoque aberto");
        return true;
    }

    @Override
    public boolean fecharEstoque() {
        Estoque.estadoEstoque = false;
        System.out.println("Estoque fechado");
        return false;
    }

    @Override
    public void pesquisar(String nome){
        if (estadoEstoque) {
            for (Produto produto : listaDeProdutos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(produto);
                } 
            }
        } else {
            System.out.print("Estoque está fechado\n");
        }
    }

    @Override
    public void acrescentarProduto(Produto nome, int quantidade){
        if (estadoEstoque) {
            for (Produto produto : listaDeProdutos){
                if (produto.getNome().equals(nome.getNome())) {
                    produto.quantidadeEmEstoque += quantidade;
                    System.out.println("Produto: " + produto);
                    System.out.println("Quantidade inserida no estoque: " + quantidade);
                    break;
                }
            }
        } else {
            System.out.print("Estoque está fechado\n");
        }
    }

    @Override
    public void retirarProduto(String nome, int quantidade){
        if (estadoEstoque) {
            for (Produto produto : listaDeProdutos){
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    if (quantidade <= produto.quantidadeEmEstoque) {
                        produto.quantidadeEmEstoque -= quantidade;
                        System.out.println("Quantidade retirada do estoque: " + quantidade);
                        break;
                    } else {
                        System.out.println("Quantidade insuficiente em estoque");
                        break;
                    }
                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        }else {
            System.out.print("Estoque está fechado\n");
        }
    }


    //==================================================================================================================

    @Override
    public String toString() {
        String estoqueEstado;
        if (estadoEstoque) {
            estoqueEstado = "Estoque aberto";
        } else {
            estoqueEstado = "Estoque fechado\n";
        }
        return estoqueEstado;
    }
}