package apphotel001;

public class HabitGrupal extends Habitacion {
    private int NumCamas;

    public HabitGrupal(int NumCamas) {
        this.NumCamas = NumCamas;
    }
   
    public void ConfCamas(int NumCamas){
    this.NumCamas = NumCamas;
    }
    
    public int getNumCamas(){
    return NumCamas;
    }
}
