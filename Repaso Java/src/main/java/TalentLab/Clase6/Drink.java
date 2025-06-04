package TalentLab.Clase6;

public class Drink extends Product{
    private int volumenML;
    public Drink(String name, double price, int volumenML){
        super(name, price);
        this.volumenML = volumenML;

    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Volumen: " + this.volumenML);

    }

}
