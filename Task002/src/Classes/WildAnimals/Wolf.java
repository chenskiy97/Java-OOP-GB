package Classes.WildAnimals;

public class Wolf extends FeaturesWildAnimals{
    boolean lieder;

    public Wolf(int height, double weight, String colorEyes, String habitat, String dateOfLocation, boolean lieder) {
        super(height, weight, colorEyes, habitat, dateOfLocation);
        this.lieder = lieder;
    }

    public boolean getLieder() {
        return lieder;
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s\nСреда обитания: %s\nДата нахождения: %s\nЛидер: %s\n\n"
                , height, weight, colorEyes, habitat, dateOfLocation, lieder);
    }

    @Override
    public String toString() {
        return "В этой клетеке сидит Волк";
    }
}