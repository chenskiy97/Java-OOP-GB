package Classes;

import Classes.Interface.Actions;

public class Animals implements Actions {
    public int height;
    public double weight;
    public String colorEyes;

    public Animals(int height, double weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }
    public void showInfo(){
        System.out.printf("Рост: %d\nВес: %f\nЦвет глаз: %s", height, weight, colorEyes);
    }
    public void voice(){
        System.out.println("Издать звук");
    }
}
