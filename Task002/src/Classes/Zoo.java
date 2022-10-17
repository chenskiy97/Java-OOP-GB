package Classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animals> zoo;

    public Zoo() {
        zoo = new ArrayList<>();
    }
    public void addZoo(Animals animal){
        zoo.add(animal);
    }

    public List<Animals> getZoo() {
        return zoo;
    }
}
