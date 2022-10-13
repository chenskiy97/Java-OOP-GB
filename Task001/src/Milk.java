public class Milk extends FoodProducts {
    Integer percentageOfFatContent;

    public Milk(String name, Integer price,
                Integer quantity, String unitOfMeasure,
                String expirationDate, Integer percentageOfFatContent) {
        super(name, price, quantity, unitOfMeasure, expirationDate);
        this.percentageOfFatContent = percentageOfFatContent;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена: %d\nКол-во: %d\n" +
                        "Ед. измирения: %s\nПроцент жирности: %d\nСрок годности до: %s\n",
                name, price, quantity, unitOfMeasure, percentageOfFatContent, expirationDate);
    }
}
