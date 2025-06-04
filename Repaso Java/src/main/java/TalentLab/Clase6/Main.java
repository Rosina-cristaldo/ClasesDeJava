package TalentLab.Clase6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Superclase
        Product product = new Product("Producto", 20);
        product.showInfo();

        //Subclase
        Drink drink = new Drink("Bebida", 20, 100);
        drink.showInfo();

        //Subclase
        Food food = new Food("Comida", 20, 50);
        food.showInfo();

        ArrayList<Product> products = new ArrayList<>();

        products.add(product);
        products.add(drink);
        products.add(food);


    }
}
