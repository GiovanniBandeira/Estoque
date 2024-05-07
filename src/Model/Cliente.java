package Model;

import Contrato.IOperarVendas;

 public class Cliente extends Pessoa implements IOperarVendas{
    public String endereco;
    public String email;
    public String contato;

    public Cliente(String cpf, String nome, Data dataNascimento, String endereco, String email, String contato) {
        super(cpf, nome, dataNascimento);
        this.endereco = endereco;
        this.email = email;
        this.contato = contato;
    }

    public void vender(String nome, double preco, int quantidade){
        if (Estoque.estadoEstoque){
            for (Produto produto : Estoque.listaDeProdutos) {
                if (produto.getNome().equalsIgnoreCase(nome)){
                    if (preco <= produto.quantidadeEmEstoque) {
                        if (produto.getPreco() <= preco){
                            produto.quantidadeEmEstoque -= quantidade;
                            System.out.println(produto);
                            System.out.println("Venda realizada com sucesso!");
                            break;
                        }else {
                            System.out.println("Você colocou valor menor do necessario!\n");
                            break;
                        }
                    }else {
                        System.out.println("Quantidade insuficiente em estoque\n");
                        break;
                    }

                } else {
                    System.out.println("Produto não encontrado\n");
                    break;
                }
            }
        } else {
            System.out.println("Estoque está fechado\n");
        }
    }
}
