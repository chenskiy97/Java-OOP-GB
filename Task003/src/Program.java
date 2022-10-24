import Classe.ReadingFromFile;
import Classe.MyObject;
import Classe.WritingToFile;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException, ClassNotFoundException {
        WritingToFile wf = new WritingToFile();
        ReadingFromFile reader = new ReadingFromFile();

        MyObject person1 = new MyObject("Vladislav", "Chenskiy", 172, 78);
        String str = "Homework is done";
        int num = 4;

        wf.writeToFile(person1);
        wf.writeToFile(str);
        wf.writeToFile(num);
        reader.printFile();

        MyObject myObject = reader.getElementFromFile(MyObject.class.getSimpleName());
        System.out.println("Recovered file myObject contains next fields");
        System.out.printf("name = %s\nsurname = %s\nheight = %d\nweight = %d\n", myObject.getName(),
                myObject.getSurname(),
                myObject.getHeight(),
                myObject.getWeight());

        String s = reader.getElementFromFile(String.class.getSimpleName());
        System.out.printf("%s\n", s);

        int number = reader.getElementFromFile(int.class.getSimpleName());
        System.out.printf("%d\n", number);
    }
}
