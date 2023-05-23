package view;

import controller.Order;
import controller.OrderClass;
import controller.ShoppingCartClass;
import model.Electronics;
import model.Laptop;
import model.Monitor;
import model.Smartphone;

public class ElectronicsShopSimulator {
    public static void main(String[] args) {
        ShoppingCartClass shoppingCart = new ShoppingCartClass();

        Electronics laptop1 = new Laptop("Lenovo", "ThinkPad16", 4199.99, "Intel Core i9 11th Generation", "Xe");
        Electronics laptop2 = new Laptop("Asus", "VivoBook14", 3499.99, "Intel Core i7 10th Generation", "RTX 3050");
        Electronics smartphone1 = new Smartphone("Xiaomi", "Redmi Note 12", 1999.99, 4500, 6.67);
        Electronics smartphone2 = new Smartphone("Apple", "14 Pro Max", 6199.99, 4500, 6.7);
        Electronics monitor1 = new Monitor("Samsung", "Odyssey Ark", 13599.99, 2160, 240);
        Electronics monitor2 = new Monitor("Asus", "ROG Swift", 7899.99, 2160, 165);

        shoppingCart.addItemToCart(laptop1);
        shoppingCart.addItemToCart(smartphone2);
        shoppingCart.addItemToCart(monitor1);

        Order order = new OrderClass(shoppingCart, "308 Negra Arroyo Lane, ABQ, New mexico");
        order.paymentMethod("cash on delivery");
        order.placeOrder(15);
    }
}
