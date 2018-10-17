package Reserva;


import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private String DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private List<reserva_cliente> listaReserva;



    public Cliente(String DNI, String nombre, String apellido, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        listaReserva=new ArrayList<>();

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<reserva_cliente> getListaReserva() {
        return listaReserva;
    }
    public void addReserva( reserva_cliente reservaCliente){
        listaReserva.add(reservaCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listaReserva=" + listaReserva +
                '}'+"\n";
    }






}

