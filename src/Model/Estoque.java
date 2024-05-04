package Model;

import Contrato.*;

public class Estoque implements IEstadoDoEstoque, IListarProdutos, IPesquisa {
    public Produto[] listaDeProdutos;
    public double tamanho;
    public boolean estadoEstoque = false;

    public Estoque(){}

    public Estoque(Produto[] listaDeProdutos, double tamanho, boolean abrirEstoque){
        this.listaDeProdutos = listaDeProdutos;
        this.tamanho = 0;
    }

    public void listarProdutos(){
        if (estadoEstoque){
            for (int i = 0 ;i < this.listaDeProdutos.length; i++) {
                System.out.println(this.listaDeProdutos[i]);
            }
        } else {
            System.out.println("Estoque está fechado");
        }
    }

    public String pesquisar(String nome){
         if (estadoEstoque) {
            for (int i = 0; i < listaDeProdutos.length; i++) {
                if (nome.equals(listaDeProdutos[i].nome)){
                    nome = String.format(listaDeProdutos[i].toString());
                }
            }
        }
        return nome;
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
}
