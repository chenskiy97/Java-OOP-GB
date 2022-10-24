package Classes;

import Interface.IStudying;

public class HighScool implements IStudying {

    @Override
    public void study(){
        System.out.println("Я должен учиться");
    }

    public void smoke(){
        System.out.println("Я курю");
    }

}
