package Classes.HomeAnimals;

import Classes.Animals;

public class FeaturesHomeAnimals extends Animals {
    public String name;
    public String breed;
    public boolean vaccinations;
    public String dateOfBirth;

    public FeaturesHomeAnimals(int height, double weight, String colorEyes, String name, String breed, boolean vaccinations, String dateOfBirth) {
        super(height, weight, colorEyes);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.dateOfBirth = dateOfBirth;
    }

    public void laska() {
        System.out.println("Проявляет ласку");
    }
}
