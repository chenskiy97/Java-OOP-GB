import Model.Company;
import Model.People;

import Presenter.*;
import View.*;


public class Main {
    public static void main(String[] args) {
        People people1 = new People("Денис", 31);
        Company company1 = new Company("ООО Нефтяник", "Пушкина 1", people1);
        People people2 = new People("Иван", 34);
        People people3 = new People("Петр", 38);
        company1.hiring(people2, "Инженер", 200);
        company1.hiring(people3, "Слесарь", 50);

        Presenter.start(company1);


    }
}