package Model;

import java.util.Date;
import java.text.SimpleDateFormat;

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
        Date dataTempoAtual = new Date();
        new SimpleDateFormat("dd/MM/yyyy").format(dataTempoAtual);
        //SimpleDateFormat: Classe que é usada para formatar e analisar datas em várias representações de string
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

