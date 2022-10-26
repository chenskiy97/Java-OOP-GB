package Classes.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalParamCreator {
    private BufferedReader reader;

    public AnimalParamCreator() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getName(String type) throws IOException {
        System.out.printf("Введите имя (%s).\n", type);
        return reader.readLine();
    }

    public String getBreed(String type) throws IOException {
        System.out.printf("Введите породу (%s).\n", type);
        return reader.readLine();
    }

    public String getBirthday(String type) throws IOException {
        System.out.printf("Введите дату рождения (%s).\n", type);
        return reader.readLine();
    }

    public String getWoolColor(String type) throws IOException {
        System.out.printf("Введите цвет шерсти (%s).\n", type);
        return reader.readLine();
    }

    public String getEyesColor(String type) throws IOException {
        System.out.printf("Введите цвет глаз (%s).\n", type);
        return reader.readLine();
    }

    public String getHabitat(String type) throws IOException {
        System.out.printf("Введите среду обитания (%s).\n", type);
        return reader.readLine();
    }

    public String getDateFinding(String type) throws IOException {
        System.out.printf("Введите даты нахождения (%s).\n", type);
        return reader.readLine();
    }

    public int getHeight(String type) throws IOException {
            System.out.printf("Введите рост (%s).\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue) {
            result = Integer.parseInt(reader.readLine());
            if (result > 0) isTrue = true;
            else
                System.out.printf("Рост должн быть больше нуля.\nВведите рост (%s).\n", type);
        }
        return result;
    }

    public double getWeight(String type) throws IOException {
        System.out.printf("Введите вес (%s).\n", type);
        boolean isTrue = false;
        double result = 0;
        while (!isTrue) {
            result = Double.parseDouble(reader.readLine());
            if (result > 0) isTrue = true;
            else
                System.out.printf("Вес должн быть больше нуля.\nВведите вес (%s)\n", type);
        }
        return result;
    }

    public boolean getVaccinations(String type) throws IOException {
        System.out.printf("Введите статус вакцинации (%s) (true/false)?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue) {
            tmp = reader.readLine();
            if (tmp.equals("true") || tmp.equals("false")) {
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            } else
                System.out.printf("Статус вакцинации должен быть true или false.\nВведите статус вакцинации (%s) (true/false)?\n", type);
        }
        return result;
    }

    public boolean getTraining(String type) throws IOException {
        System.out.printf("Введите статус тренировки (%s) (true/false)?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue) {
            tmp = reader.readLine();
            if (tmp.equals("true") || tmp.equals("false")) {
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            } else
                System.out.printf("Статус тренировки должен быть true или false.\nВведите статус тренировки (%s) (true/false)?\n", type);
        }
        return result;
    }

    public boolean getLeader(String type) throws IOException {
        System.out.printf("Введите статус лидерства (%s) (true/false).\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue) {
            tmp = reader.readLine();
            if (tmp.equals("true") || tmp.equals("false")) {
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            } else
                System.out.printf("Статус лидерства должен быть true или false.\nВведите статус лидерства (%s) (true/false).\n", type);
        }
        return result;
    }

    public boolean getWoolPresence(String type) throws IOException {
        System.out.printf("Введите наличие шерсти (%s) (true/false).\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue) {
            tmp = reader.readLine();
            if (tmp.equals("true") || tmp.equals("false")) {
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            } else
                System.out.printf("Статус наличия шерсти должен быть true или false.\nВведите наличие шерсти (%s) (true/false).\n", type);
        }
        return result;
    }

    public int getIndex(String type) throws IOException {
        System.out.printf("Введите иесто в зоопарке (%s).\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue) {
            result = Integer.parseInt(reader.readLine());
            if (result >= 0) isTrue = true;
            else
                System.out.printf("Место в зоопарке должно быть равно или больше нуля.\nВведите иесто в зоопарке (%s).\n", type);
        }
        return result;
    }

    public int getAltitude(String type) throws IOException {
        System.out.printf("Введите высоту полета (%s).\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue) {
            result = Integer.parseInt(reader.readLine());
            if (result > 0) isTrue = true;
            else
                System.out.printf("Высота полета должна быть больше нуля.\nВведите высоту полета (%s).\n", type);
        }
        return result;
    }
}