import Classes.Birds.Chicken;
import Classes.Birds.Stork;
import Classes.HomeAnimals.Cat;
import Classes.HomeAnimals.Dog;
import Classes.WildAnimals.Tiger;
import Classes.WildAnimals.Wolf;
import Classes.Zoo.AnimalParamCreator;
import Classes.Zoo.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    private static final Zoo zoo = new Zoo();
    private static final AnimalParamCreator apc = new AnimalParamCreator();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean isWork = true;


    private static int getOperation() throws IOException {
        System.out.println("Выберите действие:");
        System.out.println("Добавить живонтное в зоопарк, нажмите 1");
        System.out.println("Удалить животное из зоопарка, нажмите 2");
        System.out.println("Чтобы получить информацию из зоопарка, нажмите 3");
        System.out.println("Выйдите из зоопарка, нажмите 0");

        return Integer.parseInt(reader.readLine());
    }

    public static void getInfo() throws IOException {
        System.out.println("Чтобы показать информацию о животном, нажмите 1");
        System.out.println("Чтобы показать информацию обо всех животных, нажмите 2");
        System.out.println("Для воспроизведения крика животного нажмите 3");
        System.out.println("Чтобы воспроизвести крики всех животных, нажмите 4");

        switch (Integer.parseInt(reader.readLine())) {
            case (1) -> showInfo();
            case (2) -> showAllInfo();
            case (3) -> playCry();
            case (4) -> playAllCry();
        }
    }

    private static void addAnimal() throws IOException {
        System.out.println("Для добавления кошки нажмите 1");
        System.out.println("Для добавления собаки нажмите 2");
        System.out.println("Для добавления курицы нажмите 3");
        System.out.println("Для добавления аиста нажмите 4");
        System.out.println("Для добавления тигра нажмите 5");
        System.out.println("Для добавления волка нажмите 6");

        switch (Integer.parseInt(reader.readLine())) {
            case (1) -> addCat();
            case (2) -> addDog();
            case (3) -> addChicken();
            case (4) -> addStork();
            case (5) -> addTiger();
            case (6) -> addWolf();
        }
    }

    private static void addCat() throws IOException {
        zoo.addAnimal(apc.getIndex("кот"),
                new Cat(apc.getHeight("кот"),
                        apc.getWeight("кот"),
                        apc.getEyesColor("кот"),
                        apc.getName("кот"),
                        apc.getBreed("кот"),
                        apc.getVaccinations("кот"),
                        apc.getBirthday("кот"),
                        apc.getWoolPresence("кот")));
    }

    private static void addDog() throws IOException {
        zoo.addAnimal(apc.getIndex("собака"),
                new Dog(apc.getHeight("собака"),
                        apc.getWeight("собака"),
                        apc.getEyesColor("собака"),
                        apc.getName("собака"),
                        apc.getBreed("собака"),
                        apc.getVaccinations("собака"),
                        apc.getBirthday("собака"),
                        apc.getTraining("собака")));
    }

    private static void addChicken() throws IOException {
        zoo.addAnimal(apc.getIndex("курица"),
                new Chicken(apc.getHeight("курица"),
                        (int) apc.getWeight("курица"),
                        apc.getEyesColor("курица"),
                        0));
    }

    private static void addStork() throws IOException {
        zoo.addAnimal(apc.getIndex("аист"),
                new Stork(apc.getHeight("аист"),
                        (int) apc.getWeight("аист"),
                        apc.getEyesColor("аист"),
                        apc.getAltitude("аист")));
    }

    private static void addTiger() throws IOException {
        zoo.addAnimal(apc.getIndex("тигр"),
                new Tiger(apc.getHeight("тигр"),
                        apc.getWeight("тигр"),
                        apc.getEyesColor("тигр"),
                        apc.getHabitat("тигр"),
                        apc.getDateFinding("тигр")));
    }

    private static void addWolf() throws IOException {
        zoo.addAnimal(apc.getIndex("волк"),
                new Wolf(apc.getHeight("волк"),
                        apc.getWeight("волк"),
                        apc.getEyesColor("волк"),
                        apc.getHabitat("волк"),
                        apc.getDateFinding("волк"),
                        apc.getLeader("волк")));
    }


    public static void delAnimal() throws IOException {
        System.out.println("Введите индекс животного, чтобы удалить");
        zoo.delAnimal(Integer.parseInt(reader.readLine()));
    }

    public static void showInfo() throws IOException {
        System.out.println("Введите индекс животного, чтобы получить информацию");
        zoo.printInfo(Integer.parseInt(reader.readLine()));
    }

    public static void showAllInfo() throws IOException {
        System.out.println("Показать информацию обо всех животных в зоопарке");
        zoo.printAllInfo();
    }

    public static void playCry() throws IOException {
        System.out.println("Введите индекс животного, чтобы воспроизвести крик");
        zoo.playCry(Integer.parseInt(reader.readLine()));
    }

    public static void playAllCry() throws IOException {
        System.out.println("Воспроизвести крик всех животных в зоопарке");
        zoo.playAllVoice();
    }


    public static void main() throws IOException {
        System.out.println("Добро пожаловать!\n");
        while (isWork) {
            int operation = getOperation();
            switch (operation) {
                case (1) -> addAnimal();
                case (2) -> delAnimal();
                case (3) -> getInfo();
                case (0) -> isWork = false;
            }
        }
    }
}

