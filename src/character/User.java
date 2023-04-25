package character;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + this.name + ", age:" + this.age;
    }

    @Override
    public boolean equals(Object o) {
        var user = (User)o;
        if(user.name.equals(this.name) && user.age == this.age) {
            return true;
        }
        return false;
    }
}
