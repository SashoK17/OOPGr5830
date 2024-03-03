package Domain;

import Service.VendingMachine;
import java.util.Objects;

public class homeWork {
    /**
     * @param args
     */
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(null, null, null, null);
    
        HotDrink tea = new HotDrink("Tea", 1.50, 70);



    public homeWork() {
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof homeWork)) {
            return false;
        }
        homeWork homeWork = (homeWork) o;
        return Objects.equals(this, homeWork);
    }

    @Override
    public Int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }
        HotDrink coffee = new HotDrink("Coffee", 2.00, 80);
    
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);
    
        System.out.println("Available products:");
        vendingMachine.displayProducts();
    
        // Логика покупки продуктов
    }
    
}
