package Classes;

public class Animals implements Actions {
    public int height;
    public int weight;
    public String colorEyes;

    public Animals(int height, int weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }
    public void showInfo(){
        System.out.printf("Рост: %d\nВес: %d\nЦвет глаз: %s", height, weight, colorEyes);
    }
    public void voice(){
        System.out.println("Издать звук");
    }
}
