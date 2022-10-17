package Classes.WildAnimals;

public class Wolf extends FeaturesWildAnimals{
    String lieder;

    public Wolf(int height, int weight, String colorEyes, String habitat, String dateOfLocation, String lider) {
        super(height, weight, colorEyes, habitat, dateOfLocation);
        this.lieder = lider;
    }

    public String getLieder() {
        return lieder;
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s\nСреда обитания: %s\nДата нахождения: %s\n\n"
                , height, weight, colorEyes, habitat, dateOfLocation);
    }

    @Override
    public String toString() {
        return "В этой клетеке сидит Волк";
    }
}