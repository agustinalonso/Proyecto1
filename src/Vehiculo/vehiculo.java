package Vehiculo;

public abstract class vehiculo {
    private String modelo;
    private String marca;
    private String precio;

public  vehiculo(String modelo, String marca, String precio){
    this.marca=marca;
    this.modelo=modelo;
    this.precio=precio;
}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
