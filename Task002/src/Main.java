import Classes.HomeAnimals.Cat;
import Classes.HomeAnimals.Dog;
import Classes.WildAnimals.Tiger;
import Classes.WildAnimals.Wolf;
import Classes.Zoo;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10,3, "Голубой", "Барсик", "Сиамский","да","22.05.2008","Есть");
        Dog dog1 = new Dog(20, 4,"Коричневый","Шарик","Дворняга","no","21.02.2020","No");
        Wolf wolf1 = new Wolf(10, 5, "Черный", "Лес", "12.02.1432", "Нет");
        Tiger tiger1 = new Tiger(30, 10, "Желтый", "Лес", "12.02.1892");

        wolf1.showInfo();

        cat1.voice();
        dog1.voice();

        Zoo zoo = new Zoo();
        zoo.addZoo(tiger1);
        zoo.addZoo(wolf1);

        System.out.println(zoo.getZoo().get(0));
    }
}
