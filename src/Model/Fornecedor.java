package Model;

import java.util.ArrayList;

import Contrato.IOperarCompras;

abstract public class Fornecedor extends Empresa implements IOperarCompras{
    
    public String endereco;
    public String email;
    public String contato;


    public Fornecedor(String endereco, String email, String contato, String cnpj, String nome, Data dataCriacao) {
        super(cnpj, nome, dataCriacao);
        this.endereco = endereco;
        this.email = email;
        this.contato = contato;
    }

    public String ligarParaFornecedor(){
        return "Ligando para o fornecedor";
    }

    public void comprarProduto(String nome, double preco, int quantidade){
        if (Estoque.estadoEstoque){
            Produto produto = new Produto(nome, preco, quantidade){};
            if (Estoque.listaDeProdutos == null) {
                Estoque.listaDeProdutos = new ArrayList<>();
            }
            Estoque.listaDeProdutos.add(produto);
            System.out.println("Produto criado com sucesso!");
            System.out.println(produto);
        } else {
            System.out.println("Estoque está fechado\n");
            
        }
    }
}
