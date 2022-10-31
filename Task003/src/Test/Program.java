package Test;


public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(14, "Dmit", "Galon", 23, 15);
        System.out.println(w);
        ParWarker<Integer> pw = new ParWarker<>(23, "Steve", "Bronson", 29, 34);
        ParWarker<String> pw1 = new ParWarker<>("urd", "Victor", "Popov", 32, 34);
        System.out.println(pw);
        System.out.println(pw1);

        MultiParaWork<Integer, String, String> mpw = new MultiParaWork<>(1990, "asd", "qwe");
        System.out.println(mpw);
    }


}
 