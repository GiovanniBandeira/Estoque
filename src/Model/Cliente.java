package Model;

public class Cliente extends Pessoa{
    public String endereco;
    public String email;
    public String contato;

    public Cliente(String cpf, String nome, Data dataNascimento, String endereco, String email, String contato) {
        super(cpf, nome, dataNascimento);
        this.endereco = endereco;
        this.email = email;
        this.contato = contato;
    }

    public void vender(Produto produto, int quantidade, double valor){
        if (Estoque.estadoEstoque){
            for (Produto listaDeProduto : Estoque.listaDeProdutos) {
                if (produto.getNome().equals(produto.getNome())){
                    if (quantidade <= produto.quantidadeEmEstoque) {
                        if (produto.getPreco() <= valor){
                            System.out.println("Venda realizada com sucesso!");
                            break;
                        }else {
                            System.out.println("Você colocou valor menor do necessario!");
                        }
                    }else {
                        System.out.println("Quantidade insuficiente em estoque");
                    }

                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        } else {
            System.out.println("Estoque está fechado");
        }
    }
}
