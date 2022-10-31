
import Classes.CalcFactory;
import Classes.Presenter;
import Classes.View;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(new Scanner(System.in)), new CalcFactory());
        presenter.run();
    }
}