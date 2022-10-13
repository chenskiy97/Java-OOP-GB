public class FoodProducts extends Product {
    String expirationDate;

    public FoodProducts(String name, Integer price, Integer quantity, String unitOfMeasure, String expirationDate) {
        super(name, price, quantity, unitOfMeasure);
        this.expirationDate = expirationDate;
    }
}
