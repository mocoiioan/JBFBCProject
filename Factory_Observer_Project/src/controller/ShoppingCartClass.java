package controller;

import model.Electronics;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClass implements ShoppingCart{

    private List<Electronics> electronicsList;

    public ShoppingCartClass() {
        electronicsList = new ArrayList<>();
    }

    @Override
    public void addItemToCart(Electronics electronics) {
        electronicsList.add(electronics);
    }

    @Override
    public void removeItemFromCart(Electronics electronics) {
        electronicsList.remove(electronics);
    }

    @Override
    public Double cartTotal(Integer coupon) {
        Double value = 0.0;
        for(Electronics e : electronicsList){
            value+=e.getPrice();
        }
        return value - coupon*value/100;
    }
}
