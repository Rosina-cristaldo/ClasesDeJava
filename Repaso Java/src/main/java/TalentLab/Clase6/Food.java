package TalentLab.Clase6;

public class Food extends Product{
    int pesoGramos;

    public Food(String name, double price, int pesoGramos) {
        super(name, price);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public void showInfo(){
        System.out.println("El peso es: " + this.pesoGramos);

    }
}
