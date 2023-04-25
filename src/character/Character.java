package character;

public class Character {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getStatus() {
        return "name:" + name + ", hp:" + hp;
    }

    public void attack() {
        System.out.println("パンチ");
    }
}
