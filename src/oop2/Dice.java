package oop2;
import java.util.Random;

public class Dice {
    int num;

    public int cast(){

        Random rand = new  Random();
        num = rand.nextInt(6)+1;
        return num;
    }

    public int see(){
        int last;
        last= num;
        if(last ==0){
            return 1;
        }else{
            return last;
        }

    }



}
