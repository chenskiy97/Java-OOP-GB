public class Drinks extends Product{
    Integer volume;

    public Drinks(String name, Integer price, Integer quantity, String unitOfMeasure, Integer volume) {
        super(name, price, quantity, unitOfMeasure);
        this.volume = volume;
    }
}
