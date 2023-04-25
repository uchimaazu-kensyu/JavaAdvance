package oop2;

public class DiceTest {
    public static void main(String[] args){
        Dice dice = new Dice();

        System.out.println(dice.see());//一度も「振った」ことのないときは1を返す

        //Diceクラスのインスタンスを生成し、castメソッドとseeメソッドの動作を30回確認。
        for (var i =0; i<30; i++){
            System.out.println(dice.cast());
            System.out.println(dice.see());
        }

    }
}
