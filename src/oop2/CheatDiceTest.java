package oop2;

public class CheatDiceTest {

    public static void main(String[] args){
        CheatDice cdice = new CheatDice();


        //Diceクラスのインスタンスを生成し、castメソッドとseeメソッドの動作を30回確認。
        for (var i =0; i<30; i++){
            System.out.println( Dice.timesCounter + "回目");
            System.out.println(cdice.cast());


        }

    }

}
