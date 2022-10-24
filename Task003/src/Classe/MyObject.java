package Classe;

public class MyObject {
    private final String name;
    private final String surname;
    private final int height;
    private final int weight;

    public MyObject(String name, String surname, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
