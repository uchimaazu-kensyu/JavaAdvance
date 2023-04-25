package oop2;

public class CheatDice extends Dice {


    public int main(){
        if(timesCounter % 6 != 0 ){
            timesCounter++;
            return cast();
        }else {
            timesCounter++;
            num=6;
            return num;
        }
    }



}
