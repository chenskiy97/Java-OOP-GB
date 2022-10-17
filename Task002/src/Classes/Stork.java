package Classes;

public class Stork extends Bird{
    public Stork(int height, int weight, String colorEyes, float altitude) {

        super(height, weight, colorEyes, altitude);

    }

    @Override
    public String toString() {
        return  String.format("Аист%n%s",
                super.toString());
    }

    @Override
    public void voice() {
        System.out.println("Скрежит аиста");
    }
}
