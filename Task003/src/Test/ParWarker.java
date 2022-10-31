package Test;

public class ParWarker<E> {
    private E id;

    public String firstName;
    public String lastName;
    public int age;
    public int salery;

    public ParWarker(E id, String firstName, String lastName, int age, int salery) {
        this.age = age;
        this.id = id;
        this.firstName = firstName;
        this.salery = salery;
        this.lastName = lastName;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", id, firstName, lastName, age, salery);
    }
}
