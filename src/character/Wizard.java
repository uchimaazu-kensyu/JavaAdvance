package character;

// Characterを継承したクラス
public class Wizard extends Character {
    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    // オーバーライド（メソッドの上書き）
    @Override
    public String getStatus() {
        return super.getStatus() + ", mp:" + this.mp;
    }

    public void magic() {
        System.out.println("もやす");
    }
}