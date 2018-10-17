package com.company;

import Reserva.Cliente;
import Reserva.reserva_cliente;
import Vehiculo.utilitario;
import Vehiculo.vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        reserva_cliente reserva=new reserva_cliente();

        List<Cliente> listaReserva=new ArrayList<>();
        List<vehiculo>  vehiculoList= new ArrayList<>();


        listaReserva.add(new Cliente("40.302.106","Agustin","Alonso","bragado 5215","121212121"));
        vehiculoList.add(new utilitario("208","Peugeot", "$500.000","SI"));

        System.out.print(listaReserva);
        System.out.print(vehiculoList);
        System.out.print(reserva);

 }

}
