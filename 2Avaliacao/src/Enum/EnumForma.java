package Enum;

public enum EnumForma {
    REDONDO("Redondo"),
    QUADRADO("Quadrado"),
    TUBO("Tubo"),
    CHAPA("Chapa"),
    SEXTAVADA("Sextavada");

    String formato;

    EnumForma(String formato){
        this.formato = formato;
    }
}
