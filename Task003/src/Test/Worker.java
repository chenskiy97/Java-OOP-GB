package Test;

public class Worker {
    private int id;

    public String firstName;
    public String lastName;
    public int age;
    public int salery;

    public Worker(int id, String firstName, String lastName, int age, int salery){
        this.age = age;
        this.id = id;
        this.firstName = firstName;
        this.salery = salery;
        this.lastName = lastName;
    }

    public String fullName(){
         return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %d",id, firstName, lastName, age, salery);
    }
}
