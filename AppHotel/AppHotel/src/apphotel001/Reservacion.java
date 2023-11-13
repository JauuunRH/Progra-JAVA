
package apphotel001;

public class Reservacion {
    int IdReservacion;
    Cliente Huesped;
    String FechaRes;
    int NumDias;
    int NumPersonas;
    Habitacion Cuarto;
    boolean CheckIn;
    boolean CheckOut;
    String HoraCheckIn;
    String HoraCheckOut;

    public Habitacion getHabitacion() {
        return Cuarto;
    }

    public void setHabitacion(Habitacion Cuarto) {
        this.Cuarto = Cuarto;
    }

    public int getIdReservacion() {
        return IdReservacion;
    }

    public void setIdReservacion(int IdReservacion) {
        this.IdReservacion = IdReservacion;
    }

    public Cliente getHuesped() {
        return Huesped;
    }

    public void setHuesped(Cliente Huesped) {
        this.Huesped = Huesped;
    }

    public String getFechaRes() {
        return FechaRes;
    }

    public void setFechaRes(String FechaRes) {
        this.FechaRes = FechaRes;
    }

    public int getNumDias() {
        return NumDias;
    }

    public void setNumDias(int NumDias) {
        this.NumDias = NumDias;
    }

    public int getNumPersonas() {
        return NumPersonas;
    }

    public void setNumPersonas(int NumPersonas) {
        this.NumPersonas = NumPersonas;
    }

    public boolean isCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(boolean CheckIn) {
        this.CheckIn = CheckIn;
    }

    public boolean isCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(boolean CheckOut) {
        this.CheckOut = CheckOut;
    }

    public String getHoraCheckIn() {
        return HoraCheckIn;
    }

    public void setHoraCheckIn(String HoraCheckIn) {
        this.HoraCheckIn = HoraCheckIn;
    }

    public String getHoraCheckOut() {
        return HoraCheckOut;
    }

    public void setHoraCheckOut(String HoraCheckOut) {
        this.HoraCheckOut = HoraCheckOut;
    }
    
}
