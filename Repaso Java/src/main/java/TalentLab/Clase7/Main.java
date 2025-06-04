package TalentLab.Clase7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deductibles p1 = new OrganicProducts();
        Deductibles p2 = new PromoProducts();


        p1.calculateDiscounts();

        ArrayList<Deductibles> productosEnPromocion = new ArrayList<>();

        productosEnPromocion.add(p2);

        //logica principal del proyecto
        for (Deductibles deductibles : productosEnPromocion){
            deductibles.calculateDiscounts();

        }
    }
}
