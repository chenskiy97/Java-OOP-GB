package Classes;

import Interface.IPlaying;
import Interface.IStudying;

public class SecondarySchool implements IStudying, IPlaying {
    @Override
    public void study(){
        System.out.println("Я ненавижу уроки");
    }

    @Override
    public void play(){
        System.out.println("Я играю в маинкрафт");
    }

    public void skip(){
        System.out.println("Я прогуливаю уроки");
    }
}
