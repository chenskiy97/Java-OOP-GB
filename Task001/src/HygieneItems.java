public class HygieneItems extends Product{
    Integer quantityInThePackage;

    public HygieneItems(String name, Integer price, Integer quantity, String unitOfMeasure, Integer quantityInThePackage) {
        super(name, price, quantity, unitOfMeasure);
        this.quantityInThePackage = quantityInThePackage;
    }
}
