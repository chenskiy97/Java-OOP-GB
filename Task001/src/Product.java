public class Product {
    String name;
    Integer price;
    Integer quantity;
    String unitOfMeasure;

    public Product(String name, Integer price, Integer quantity, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return String.format("%s\n%d\n%d\n%s", name, price, quantity, unitOfMeasure);
    }
}
