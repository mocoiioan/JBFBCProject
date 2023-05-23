package controller;

import java.text.DecimalFormat;

public class OrderClass implements Order{

    private ShoppingCartClass shoppingCart;
    private String address;

    public OrderClass(ShoppingCartClass shoppingCart, String address) {
        this.shoppingCart = shoppingCart;
        this.address = address;
    }

    @Override
    public void paymentMethod(String method) {
        System.out.println("Payment made with " + method);
    }

    @Override
    public void placeOrder(Integer coupon) {
        Double value = shoppingCart.cartTotal(coupon);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedValue = decimalFormat.format(value);
        System.out.println("controller.Order for " + formattedValue + " dollars has just been placed to address " + address);
        status("controller.Order was placed successfully");
    }

    @Override
    public void status(String status) {
        System.out.println(status);
    }
}
