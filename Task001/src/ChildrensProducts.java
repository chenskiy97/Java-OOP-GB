public class ChildrensProducts extends Product {
    Integer minAges;
    String hypoallergenic;

    public ChildrensProducts(String name, Integer price, Integer quantity,
                             String unitOfMeasure, Integer minAges, String hypoallergenic) {
        super(name, price, quantity, unitOfMeasure);
        this.minAges = minAges;
        this.hypoallergenic = hypoallergenic;
    }
}
