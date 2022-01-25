package LAB4;

import java.util.List;

public class Order {
    private int orderId;
    private String shopperName;
    private String shopperEmail;
    private List<Content> contents;
    private boolean orderCompleted;

    public Order(int orderId, String shopperName, String shopperEmail, List<Content> contents, boolean orderCompleted) {
        this.orderId = orderId;
        this.shopperName = shopperName;
        this.shopperEmail = shopperEmail;
        this.contents = contents;
        this.orderCompleted = orderCompleted;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\norderId=" + orderId +
                "\nshopperName='" + shopperName + '\'' +
                "\nshopperEmail='" + shopperEmail + '\'' +
                "\ncontents=" + contents +
                "\norderCompleted=" + orderCompleted +
                '}';
    }
}
