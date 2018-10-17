package Reserva;

import Vehiculo.vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class reserva_cliente {

   private LocalDate inicioReserva;
   private LocalDate finReserva;
   private double precioTotal;
   private double precioUnitario;
   private int ID;



    private List<vehiculo> vehiculoList;


    public reserva_cliente(){

        vehiculoList=new ArrayList<>();
        inicioReserva= LocalDate.of(2018,10,17);
        finReserva= LocalDate.of(2018,10,20);
        precioTotal=400000;
        ID=2;
        inicioReserva.toString();
        finReserva.toString();


    }

    public LocalDate getInicioReserva() {
        return inicioReserva;
    }

    public void setInicioReserva(LocalDate inicioReserva) {
        this.inicioReserva = inicioReserva;
    }

    public LocalDate getFinReserva() {
        return finReserva;
    }

    public void setFinReserva(LocalDate finReserva) {
        this.finReserva = finReserva;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public void addVehiculo( vehiculo Vehiculo){
        vehiculoList.add(Vehiculo);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public String toString() {
        return "reserva_cliente{" +
                "inicioReserva=" + inicioReserva +
                ", finReserva=" + finReserva +
                ", precioTotal=" + precioTotal +
                ", precioUnitario=" + precioUnitario +
                ", ID=" + ID +
                ", vehiculoList=" + vehiculoList +
                '}';
    }
}
