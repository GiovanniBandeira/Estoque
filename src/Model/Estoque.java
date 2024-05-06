package Model;

import Contrato.*;

import java.util.ArrayList;

abstract public class Estoque implements IOperarEstoque, IOperarLista {
    public static ArrayList<Produto> listaDeProdutos;
    public static boolean estadoEstoque = false;

    public Estoque(){}

    public Estoque(ArrayList<Produto> listaDeProdutos, boolean estadoEstoque) {
        Estoque.listaDeProdutos = new ArrayList<>();
        Estoque.estadoEstoque = estadoEstoque;
    }

    //IOperarLista====================================================================================================

    public void listarProdutos(){
        if (estadoEstoque) {
            System.out.println("Lista de Produtos:");
            for (Produto listaDeProduto : listaDeProdutos) {
                System.out.println(listaDeProduto);
            }
        }else {
            System.out.print("Estoque está fechado");
        }
    }

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

    public void excluirProduto(String nome){
        if (estadoEstoque) {
            if (listaDeProdutos == null) {
                listaDeProdutos = new ArrayList<>();
            }
            listaDeProdutos.remove(nome);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    //IOperarEstoque====================================================================================================


    public boolean abrirEstoque() {
        Estoque.estadoEstoque = true;
        System.out.println("Estoque aberto");
        return true;
    }

    public boolean fecharEstoque() {
        Estoque.estadoEstoque = false;
        System.out.println("Estoque fechado");
        return false;
    }

    public void pesquisar(String nome){
        if (estadoEstoque) {
            for (Produto produto : listaDeProdutos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(produto);
                    return;
                }
            }
            System.out.print("Produto não encontrado");
        } else {
            System.out.print("Estoque está fechado");
        }
    }

    public void acrescentarProduto(Produto nome, int quantidade){
        if (estadoEstoque) {
            for (Produto produto : listaDeProdutos){
                if (nome.getNome().equals(nome.getNome())) {
                    nome.quantidadeEmEstoque += quantidade;
                    System.out.println("Quantidade inserida no estoque: " + quantidade);
                    break;  
                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        } else {
            System.out.print("Estoque está fechado");
        }
    }

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
            System.out.print("Estoque está fechado");
        }
    }


    //==================================================================================================================

    @Override
    public String toString() {
        String estoqueEstado;
        if (estadoEstoque) {
            estoqueEstado = "Estoque aberto";
        } else {
            estoqueEstado = "Estoque fechado";
        }
        return estoqueEstado;
    }
}
