package Classes;

public abstract class Bird extends Animals implements Fly{
    private float altitude;

    protected Bird (int height, int weight, String colorEyes, float altitude) {
        super(height, weight, colorEyes);
        this.altitude = altitude;
    }


    public void fly() {
        System.out.printf("Я лечу на %s метрах!", altitude);
    }


    @Override
    public String toString() {

        return String.format("%sВысота полёта %.1f",
                super.toString(), altitude);
    }
}
