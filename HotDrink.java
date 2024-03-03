package Domain;

import Service.VendingMachine;

public class HotDrink {
    @Override
    public String toString() {
        return "HotDrink{}";
    }

    public HotDrink(String tea, double v, int i) {
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        HotDrink tea = new HotDrink("Tea", 1.50, 70);
        HotDrink coffee = new HotDrink("Coffee", 2.00, 80);

        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);

        System.out.println("Available products:");
        vendingMachine.displayProducts();

        // Логика покупки продуктов
    }

}