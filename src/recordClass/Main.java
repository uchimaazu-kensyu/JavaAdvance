package recordClass;

public class Main {
    public static void main(String[] args) {
        Person[] users = {
                new Person("ito", "tokyo", 23),
                new Person("yamazaki", "osaka", 27),
                new Person("kuroki", "hukuoka", 30)
        };
        System.out.println(users[0].name());

    }
}
