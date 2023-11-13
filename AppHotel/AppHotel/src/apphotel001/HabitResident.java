package apphotel001;

public class HabitResident extends Habitacion{
    
    private String InfoHuesped;

    public HabitResident(String InfoHuesped) {
        this.InfoHuesped = "";
    }
    
    public void RegHuesped (String Informacion){
    InfoHuesped = Informacion;
    }
    
    public String getInfoHuesped (){
        return InfoHuesped;
    }
}
