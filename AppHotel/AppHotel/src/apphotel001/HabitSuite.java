package apphotel001;

import java.util.ArrayList;
import java.util.List;

public class HabitSuite extends Habitacion{
    
    private List<String> Servicio;
    private ArrayList<Object> Servicios;

    public HabitSuite(List<String> Servicio, ArrayList<Object> Servicios) {
        this.Servicio = Servicio;
        this.Servicios = Servicios;
    }

}
