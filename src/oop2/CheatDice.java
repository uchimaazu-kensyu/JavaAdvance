package oop2;

public class CheatDice extends Dice {


    @Override
    public int cast(){
        if(timesCounter % 6 != 0 ){
            timesCounter++;
            return super.cast();
        }else {
            timesCounter++;
            num=6;
            return num;
        }
    }



}
