package Classes;

import AbstractClasses.AView;

import java.util.Scanner;

public class View extends AView {
    Scanner scanner;

    public View(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getExpression() {

        System.out.println("Введите выражение с клавиатуры. Для выхода наберите: 'выход'.");
        return scanner.next();
    }

    @Override
    public void showResult(String result) {
        System.out.printf("Результат выражения: %s\n", result);
    }
}
