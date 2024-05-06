package Enum;

public enum EnumForma {
    Redondo("Redondo"),
    Quadrado("Quadrado"),
    Tubo("Tubo"),
    Chapa("Chapa"),
    Sextavada("Sextavada");

    String formato;

    EnumForma(String formato){
        this.formato = formato;
    }
}
