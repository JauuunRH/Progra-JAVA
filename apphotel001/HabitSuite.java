package apphotel001;

import java.util.ArrayList;
import java.util.List;

public class HabitSuite extends Habitacion{
    
    private ArrayList<HabitSuite> Servicios;

    public HabitSuite(ArrayList<HabitSuite> Servicios) {
        this.Servicios = Servicios; 
    }

    public ArrayList<HabitSuite> getServicios() {
        return Servicios;
    }

    public void setServicios(ArrayList<HabitSuite> Servicios) {
        this.Servicios = Servicios;
    }
    
    

}
