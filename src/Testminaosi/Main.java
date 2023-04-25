package Testminaosi;


    public class Main {
        public static void main(String[] args) {
            Testminaosi p1 = new Testminaosi("bob", 17);
            Testminaosi p2 = p1;

            p2.name = "chris";
            p2.age = 19;

            System.out.println(p1.name);
            System.out.println(p1.age);

        }
    }

