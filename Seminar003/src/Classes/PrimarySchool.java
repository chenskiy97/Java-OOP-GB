package Classes;

import Interface.IPlaying;
import Interface.IStudying;

public class PrimarySchool implements IStudying, IPlaying {

    @Override
    public void study(){
        System.out.println("Я люблю учиться");
    }

    @Override
    public void play(){
        System.out.println("Я играю в игрушки");
    }
}
