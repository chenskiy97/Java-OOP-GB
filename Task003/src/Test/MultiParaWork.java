package Test;

public class MultiParaWork <E1,E2,E3>{
    public E1 value1;
    public E2 value2;
    public E3 value3;

    public MultiParaWork(E1 value1, E2 value2, E3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return String.format("E1 type: %s, E2 type: %s, E3 type: %s", value1, value2, value3);
    }
}
