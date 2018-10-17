package Vehiculo;

public class utilitario extends vehiculo {

    private String caja;

    public utilitario(String modelo, String marca, String precio, String caja) {
        super(modelo, marca, precio);
        setCaja(caja);
    }
    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }



    public String toString() {
        return "utilitario{" +
                "caja='" + caja + '\'' +
                '}';
    }
}

