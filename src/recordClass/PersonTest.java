package recordClass;

public class PersonTest {
    public static void main(String[] args) {
        Person[] add ={
                new Person("比嘉","higa",24),
                new Person("内間","uchima",20),
                new Person("石川","ishikawa",10),
                new Person("嘉数","kakazu",5),
                new Person("平田","hirata",80)

        };

        System.out.print(add[0].name());
    }
}
