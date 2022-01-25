package LAB4;

public class Content {
    private int productId;
    private String productName;
    private int quantity;

    public Content(int productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nContent{" +
                "\nproductId=" + productId +
                "\nproductName='" + productName + '\'' +
                "\nquantity=" + quantity +
                '}';
    }
}
