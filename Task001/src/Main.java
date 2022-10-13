
public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk("Молоко", 96,2,"Литр","20122022",3);
        Drinks lemonade = new Lemonade("Лемонад", 150,3,"Миллилитр", 1);
        Bread bread = new Bread("Хлеб", 58,2,"Грамм","13102022","Пшеничная");
        Eggs eggs = new Eggs("Яйца", 119,2,"Штук", "29102022",10);
        Masks mask = new Masks("Маска", 25,1, "Штук",20);
        ToiletPaper toiletPaper = new ToiletPaper("Мягкий Знак", 19,1, "Штук",24,2);
        Diapers diapers = new Diapers("Памперс",300,1,"Штук", 0,"Да",
                20, 3,10,"Впитывающий");
        Nipple nipple = new Nipple("Соска",200,1,"Штук", 0,"Да");

        Program.allPrint(milk);
        Program.allPrint(lemonade);
        Program.allPrint(bread);
        Program.allPrint(eggs);
        Program.allPrint(mask);
        Program.allPrint(toiletPaper);
        Program.allPrint(diapers);
        Program.allPrint(nipple);
    }
}
