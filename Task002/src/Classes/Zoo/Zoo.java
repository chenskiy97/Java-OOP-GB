package Classes.Zoo;


import Classes.Animals;

public class Zoo {
    private Animals[] zoo;

    public Zoo(){
        this.zoo = new Animals[10];
    }

    public void addAnimal(int index, Animals animal){
        if(index < 0) index = 0;

        int size = (this.zoo.length-1 >= index)? this.zoo.length+1: index+1;
        Animals[] tmp = new Animals[size];

        for (int i = 0; i < tmp.length; i++) {
            if(i<index){
                tmp[i] = this.zoo[i];
            } else if (i == index) {
                tmp[i] = animal;
            }else
                tmp[i] = this.zoo[i-1];
        }
        this.zoo = tmp;
    }

    public void addAnimal(Animals animal){
        this.addAnimal(0,animal);
    }

    public void delAnimal(int index){
        if(index > this.zoo.length-1){
            System.out.println("Index out of bonds");
            return;
        }
        Animals[] tmp = new Animals[this.zoo.length-1];

        for (int i = 0; i < this.zoo.length; i++) {
            if(i<index)
                tmp[i] = zoo[i];
            else if (i>index)
                tmp[i-1] = zoo[i];
        }
        this.zoo = tmp;
    }

    public void printInfo(int index){
        this.zoo[index].showInfo();
    }

    public void playCry(int index){
        this.zoo[index].voice();
    }

    public void printAllInfo(){
        for (int i = 0; i < this.zoo.length; i++) {
            if(this.zoo[i] != null) {
                this.zoo[i].showInfo();
                System.out.println();
            }
        }
        System.out.println();
    }

    public void playAllVoice(){
        for (int i = 0; i < this.zoo.length; i++) {
            if(this.zoo[i] != null) {
                this.zoo[i].voice();
                System.out.println();
            }
        }
        System.out.println();
    }
}
