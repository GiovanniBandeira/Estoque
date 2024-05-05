package Model;

import Contrato.*;

import java.util.ArrayList;

public class Estoque implements IOperarEstoque, IOperarLista {
    public ArrayList<Produto> listaDeProdutos;
    public boolean estadoEstoque = false;

    public Estoque(){}

    public Estoque(ArrayList<Produto> listaDeProdutos, boolean estadoEstoque) {
        this.listaDeProdutos = new ArrayList<>();
        this.estadoEstoque = estadoEstoque;
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

    public void criarProduto(Produto produto){
        if (estadoEstoque) {
            if (listaDeProdutos == null) {
                listaDeProdutos = new ArrayList<>();
            }
            listaDeProdutos.add(produto);
            System.out.println("Produto criado com sucesso!");
            System.out.println(produto);
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    public void excluirProduto(Produto produto){
        if (estadoEstoque) {
            if (listaDeProdutos == null) {
                listaDeProdutos = new ArrayList<>();
            }
            listaDeProdutos.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    //IOperarEstoque====================================================================================================

    public void pesquisar(String nome){
        Produto produtoPesquisado = null;
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

    public void acrescentarProduto(int quantidade){
        if (estadoEstoque) {

        }else {
            System.out.print("Estoque está fechado");
        }
    }

    public void retirarProduto(int quantidade){
        if (estadoEstoque) {
        }else {
            System.out.print("Estoque está fechado");
        }
    }

    public boolean abrirEstoque() {
        this.estadoEstoque = true;
        System.out.println("Estoque aberto");
        return true;
    }

    public boolean fecharEstoque() {
        this.estadoEstoque = false;
        System.out.println("Estoque fechado");
        return false;
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
