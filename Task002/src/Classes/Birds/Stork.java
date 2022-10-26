package Classes.Birds;

import Classes.Birds.Bird;

public class Stork extends Bird {
    public Stork(int height, double weight, String colorEyes, int altitude) {
        super(height, weight, colorEyes, altitude);

    }

    @Override
    public void fly(){
        {
            System.out.printf("Я лечу на %s метрах!", altitude);
        }
    }

    @Override
    public void voice() {
        System.out.println("Ко-ко-ко");
    }

    @Override
    public void showInfo() {
        System.out.println("\nКурица");
        System.out.printf("Цвет глаз: %s\n", this.colorEyes);
        System.out.printf("Высота: %s\n", this.height);
        System.out.printf("Вес: %.3d\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.altitude);
    }
}
