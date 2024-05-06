package Model;

import Enum.*;

public class Materia_Prima extends Produto {
    public EnumMaterial material;
    public EnumForma forma;
    public double diametro;

    public Materia_Prima(String nome, double preco, int quantidadeEmEstoque, EnumMaterial material, EnumForma forma, double diametro){
        super(nome, preco, quantidadeEmEstoque);
        this.material = material;
        this.forma = forma;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Materia_Prima" + '\n' +
                "Nome= " + nome + " " + material + " " + forma + " " + diametro + "mm" + '\n' +
                "Preco= " + preco + '\n' +
                "Quantidade em estoque= " + quantidadeEmEstoque + "\n";
    }
}
