package Model;

public class Fornecedor extends Empresa{
    
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

    public void comprarProduto(Produto produto, double preco, int quantidade){
        if (Estoque.estadoEstoque){
            Estoque.criarProduto(produto, preco, quantidade);

        } else {
            
        }
    }
}
