package Vehiculo;

public class sedan extends vehiculo {

    private String baul;

    public sedan(String modelo, String marca, String precio, boolean baul) {
        super(modelo, marca, precio);


    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    @Override
    public String toString() {
        return "sedan{" +
                "baul='" + baul + '\'' +
                '}';
    }
}
