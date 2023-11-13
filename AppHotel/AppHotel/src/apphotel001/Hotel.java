package apphotel001;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Habitacion> Habitaciones;
    private ArrayList<Cliente> Clientes;
    private ArrayList<Reservacion> Reservaciones;

    Hotel() {
        Habitaciones = new ArrayList();
        Clientes = new ArrayList();
        Reservaciones = new ArrayList();
    }

    public void addhabitacion(Habitacion H) {
        Habitaciones.add(H);
    }

    public int getNumHabitaciones() {
        return Habitaciones.size();
    }

    public Habitacion gethabitacion(int index) {
        return Habitaciones.get(index);
    }

    public void addCliente(Cliente H) {
        Clientes.add(H);
    }

    public int getNumClientes() {
        return Clientes.size();
    }

    public Cliente getCliente(int index) {
        return Clientes.get(index);
    }

    public boolean ElimnarHabitacion(int index) {
        if ((index >= 0) && (index < Habitaciones.size())) {
            Habitaciones.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean EliminarHabitacion(Habitacion H) {
        boolean Flag;
        Flag = Habitaciones.remove(H);
        return Flag;

    }

    public void addReservaciones(Reservacion R) {
        Reservaciones.add(R);
    }

    public int getNumReservaciones() {
        return Reservaciones.size();
    }

    public Reservacion getReservacion(int index) {
        return Reservaciones.get(index);
    }
}
