package Classes.WildAnimals;

public class Tiger extends FeaturesWildAnimals{
    public Tiger(int height, int weight, String colorEyes, String habitat, String dateOfLocation) {
        super(height, weight, colorEyes, habitat, dateOfLocation);
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s\nСреда обитания: %s\nЛидер: %s\n\n"
                , height, weight, colorEyes, habitat, dateOfLocation);
    }

    @Override
    public String toString() {
        return "В этой клетеке сидит Тигр";
    }
}
