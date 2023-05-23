package controller;

public interface Order {
    void paymentMethod(String method);
    void placeOrder(Integer coupon);
    void status(String status);
}
