package Classes.HomeAnimals;

import Classes.Interface.Actions;

public class Cat extends FeaturesHomeAnimals implements Actions {
    boolean presenceOfWool;

    public Cat(int height, double weight, String colorEyes, String name, String breed, boolean vaccinations, String dateOfBirth, boolean presenceOfWool) {
        super(height, weight, colorEyes, name, breed, vaccinations, dateOfBirth);
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public void voice() {
        System.out.println("Мяу, мяу");
    }

    @Override
    public void showInfo() {
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s\nКличка: %s\nПорода: %s\nПривит: %s\nДата рождения: %s\nШерсть: %s\n\n"
                , height, weight, colorEyes, name, breed, vaccinations, dateOfBirth, presenceOfWool);
    }

    @Override
    public String toString() {
        return String.format("В этой клетеке сидит кошка %s", name);
    }
}
