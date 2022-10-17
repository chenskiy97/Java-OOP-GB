package Classes;

public class Chicken extends Bird{
    public Chicken(int height, int weight, String colorEyes, float altitude) {
        super(height, weight, colorEyes, altitude);
    }

    @Override
    public String toString() {
        return  String.format("Курица%n%s",
                super.toString());
    }

    @Override
    public void voice() {
        System.out.println("Ко-ко-ко");
    }
}
