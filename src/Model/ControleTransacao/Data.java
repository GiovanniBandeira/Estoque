package Model.ControleTransacao;

import Enum.*;

public class Data {
    public int dia;
    public EnumMes mes;
    public int ano;

    Data(int dia, EnumMes mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void dataAtual(){

    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

