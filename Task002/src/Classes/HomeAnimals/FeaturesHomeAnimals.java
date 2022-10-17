package Classes.HomeAnimals;

import Classes.Animals;

public class FeaturesHomeAnimals extends Animals {
    String name;
    String breed;
    public String vaccinations;
    String dateOfBirth;

    public FeaturesHomeAnimals(int height, int weight, String colorEyes, String name, String breed, String vaccinations, String dateOfBirth) {
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
