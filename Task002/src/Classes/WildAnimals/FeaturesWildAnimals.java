package Classes.WildAnimals;

import Classes.Animals;

public class FeaturesWildAnimals extends Animals {
    String habitat; // Место обитания
    String dateOfLocation; // Дата находждения

    public FeaturesWildAnimals(int height, int weight, String colorEyes, String habitat, String dateOfLocation) {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
}
