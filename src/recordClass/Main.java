package recordClass;

public class Main {
    public static void main(String[] args) {
        Person.Users[] users = {
                new Person.Users("ito", "tokyo", 23),
                new Person.Users("yamazaki", "osaka", 27),
                new Person.Users("kuroki", "hukuoka", 30)
        };
        System.out.println(users[0].name());

    }
}
