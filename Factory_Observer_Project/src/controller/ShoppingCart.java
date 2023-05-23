package controller;

import model.Electronics;

public interface ShoppingCart {
    void addItemToCart(Electronics electronics);
    void removeItemFromCart(Electronics electronics);
    Double cartTotal(Integer coupon);
}
