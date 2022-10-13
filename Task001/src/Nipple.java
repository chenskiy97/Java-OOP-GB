public class Nipple extends ChildrensProducts {
    public Nipple(String name, Integer price, Integer quantity, String unitOfMeasure,
                  Integer minAges, String hypoallergenic) {
        super(name, price, quantity, unitOfMeasure, minAges, hypoallergenic);
    }

    @Override
    public String toString() {
        return String.format("Товар: %s\nЦена: %d\nКол-во: %d\nЕд. измирения: %s\n" +
                        "Мин. Возвраст: %d\nГипераллергенный: %s\n",
                name, price, quantity, unitOfMeasure, minAges, hypoallergenic);
    }
}
