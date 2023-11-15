
package apphotel001;

import java.util.ArrayList;
import java.util.Scanner;

public class AppHotel001 {

    public static void main(String[] args) {        
        int opc;
        Hotel CiancaInn;
        CiancaInn=new Hotel();
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Habitaciones");
            System.out.println("2. Clientes");  
            System.out.println("3. Reservaciones");
            System.out.println("9. Salir");
            opc=Opcion();
            switch(opc){
                case 1:MenuHabitaciones(CiancaInn);break;
                case 2:MenuClientes(CiancaInn);break;
                case 3:MenuReservaciones(CiancaInn);break;
            }
        }while(opc!=9);
    }
    
    public static void MenuReservaciones(Hotel H){
        int opc;
        do{
            System.out.println("Menu Reservaciones");
            System.out.println("1. Agregar reservacion: Selecciona que habitacion es requerida: t/ Suite, Grupa o Residencial");
            System.out.println("2. Listar Reservacion");
            System.out.println("3. Seleccionar reservación");
            System.out.println("4. Registrar reservación");
            System.out.println("9. Salir");
            opc=Opcion();
            switch(opc){
                case 1:AgregarReservacion(H);break;
                case 2:ListarReservaciones(H);break;
                case 3:SeleccionarReservacion(H);break;
                case 4:RegistrarReservacion(H);break;
            }
            
        }while(opc!=9);
    }
    
    public static void RegistrarReservacion(Hotel H){
        int opc;
        String HoraCheck;
        Reservacion R;
        R=SeleccionarReservacion(H);
        System.out.println("1. Registrar Entrada");
        System.out.println("2. Registrar Salida");
        opc=Opcion();
        System.out.println("Ingresa hora de registro");
        HoraCheck=Info();
        switch(opc){
            case 1:R.setCheckIn(true);
            R.setHoraCheckIn(HoraCheck);
            break;
            case 2:R.setCheckOut(true);
            R.setHoraCheckOut(HoraCheck);
            break;
        }
  
        
  
    }
    
    public static Reservacion SeleccionarReservacion(Hotel H){
        int index; 
        if (H.getNumReservaciones()>0){
            ListarReservaciones(H);
            System.out.println("Selecciona el indice de la reservación");
            index=Opcion();
            if ( (index>=0) && (index<H.getNumReservaciones()) ){
                return H.getReservacion(index);
            }
            else{
                System.out.println("Indice fuera de rango");
                return null;
            }
        }
        else{
            System.out.println("No hay reservaciones en el hotel");
            return null;
        }
    }
    
    public static void ListarReservaciones(Hotel H){
        int NumRes,i;
        NumRes=H.getNumReservaciones();
        System.out.println("Indice\tIDRes\tDia\tPer\tNombre\tIn\tOut");
        for(i=0;i<NumRes;i++){
            Reservacion Aux;
            Aux=H.getReservacion(i);
            Cliente Aux1;
            Aux1=Aux.getHuesped();
            System.out.println(i+"\t"+Aux.getIdReservacion()+"\t"+Aux.getNumDias()+"\t"+Aux.getNumPersonas()+"\t"+Aux1.getNombre()+"\t"+Aux.isCheckIn()+"\t"+Aux.isCheckOut());
        }
    }
    
    public static void AgregarReservacion(Hotel H){
        int IDRes,NumDias,NumPersonas;
        String Fecha;
        Habitacion Cuarto;
        Cliente Huesped;
        
        System.out.println("Id de la reserva");
        IDRes=Opcion();
        System.out.println("numero de dias");
        NumDias=Opcion();
        System.out.println("Numero de Personas");
        NumPersonas=Opcion();
        System.out.println("Ingrese la fecha");
        Fecha=Info();
        Cuarto=SeleccionarHabitacion(H);
        Huesped=SeleccionarClientes(H);
        
        if  ((Cuarto!=null) && (Huesped!=null)){
            Reservacion Aux;
            Aux=new Reservacion();
            Aux.setFechaRes(Fecha);
            Aux.setHuesped(Huesped);
            Aux.setNumDias(NumDias);
            Aux.setNumPersonas(NumPersonas);
            Aux.setHabitacion(Cuarto);
            Aux.setIdReservacion(IDRes);
            H.addReservaciones(Aux);
        }
    }
    
    public static void MenuClientes(Hotel H){
        int opc;
        do{
            System.out.println("Menu Cliente");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Selecionar Clientes");
            System.out.println("9. Regresar");
            opc=Opcion();
            switch(opc){
                case 1:AgregarCliente(H);break;
                case 2:ListarClientes(H);break;
                case 3:SeleccionarClientes(H);break;
            }
            
        }while(opc!=9);
    }
    
    public static Cliente SeleccionarClientes(Hotel H){
        int index;
        if (H.getNumClientes()>0){
            ListarClientes(H);
            System.out.println("Selecciona el indice del cliente");
            index=Opcion();
            if  ( (index>=0) && (index<H.getNumClientes()) ){
                return H.getCliente(index);
            }
            else{
                System.out.println("Indice fuera de rango");
                return null;
            }
        }
        else{
            System.out.println("No hay habitaciones en el hotel");
            return null;
        }
            
    }
    
    public static void ListarClientes(Hotel h){
        int NumClientes,i;
        Cliente Aux;
        NumClientes=h.getNumClientes();
        System.out.println("Id\t#Edad\t#Nombre");
        for(i=0;i<NumClientes;i++){
            Aux=h.getCliente(i);
            System.out.println(i+"\t"+Aux.getEdad()+"\t"+Aux.getNombre());
        }
    }
    
     public static void AgregarCliente(Hotel h){
        int Edad;
        String Nombre;
        System.out.println("Ingresa el nombre del cliente");
        Nombre=Info();
        System.out.println("Ingrese el Edad");
        Edad=Opcion();
        Cliente Aux;
        Aux=new Cliente();
        Aux.setNombre(Nombre);
        Aux.setEdad(Edad);
        h.addCliente(Aux);
    }
    
    public static void MenuHabitaciones(Hotel H){
        int opc;
        do{
            System.out.println("Menu Habitaciones");
            System.out.println("1. Agregar Habitacion");
            System.out.println("2. Listar Habitaciones");
            System.out.println("3. Selecionar Habitacion");
            System.out.println("4. Eliminar habitacion");
            System.out.println("9. Regresar");
            opc=Opcion();
            switch(opc){
                case 1:AgregarHabitacion(H);break;
                case 2:ListarHabitaciones(H);break;
                case 3:SeleccionarHabitacion(H);break;
                case 4:EliminarHabitacion(H);break;
            }
            
        }while(opc!=9);
    }
    
    public static void EliminarHabitacion(Hotel H){
        int opc;
        Habitacion R;
        R=SeleccionarHabitacion(H);
        if (R!=null)
            H.EliminarHabitacion(R);
    }
    
    public static void AgregarHabitacion(Hotel h){
        int NumCamas, IDHabitacion;
        System.out.println("Ingresa el número de habitacion");
        IDHabitacion=Opcion();
        System.out.println("Ingrese el número de camas");
        NumCamas=Opcion();
        Habitacion Aux;
        Aux=new Habitacion();
        Aux.setNumCamas(NumCamas);
        Aux.setIDHabitacion(IDHabitacion);
        h.addhabitacion(Aux);
    }
    
    public static void ListarHabitaciones(Hotel h){
        int NumHabitaciones,i;
        Habitacion Aux;
        NumHabitaciones=h.getNumHabitaciones();
        System.out.println("Id\t# Hab\t#Camas");
        for(i=0;i<NumHabitaciones;i++){
            Aux=h.gethabitacion(i);
            System.out.println(i+"\t"+Aux.getIDHabitacion()+"\t"+Aux.getNumCamas());
        }
    }
    
    public static Habitacion SeleccionarHabitacion(Hotel H){
        int index;
        if (H.getNumHabitaciones()>0){
            ListarHabitaciones(H);
            System.out.println("Selecciona el indice de la habitacion");
            index=Opcion();
            if  ( (index>=0) && (index<H.getNumHabitaciones()) ){
                return H.gethabitacion(index);
            }
            else{
                System.out.println("Indice fuera de rango");
                return null;
            }
        }
        else{
            System.out.println("No hay habitaciones en el hotel");
            return null;
        }
            
    }
    
    public static int Opcion(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextInt();
    }
    
    public static String Info(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
    }    
}
