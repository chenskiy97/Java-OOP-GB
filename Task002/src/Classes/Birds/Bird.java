package Classes.Birds;

import Classes.Animals;
import Classes.Interface.Fly;

public abstract class Bird extends Animals implements Fly {
    public int altitude;

    protected Bird (int height, double weight, String colorEyes, int altitude) {
        super(height, weight, colorEyes);
        this.altitude = altitude;
    }



}
