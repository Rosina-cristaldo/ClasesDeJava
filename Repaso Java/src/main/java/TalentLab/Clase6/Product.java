package TalentLab.Clase6;

public class Product {
    protected String name;
    private double price;
    public Product(){};

    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }

    public void showInfo(){
        System.out.println("Nombre del producto: " + this.name);
    }

}
