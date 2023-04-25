package oop2;

public class Main {

    public static void main(String[] args){

        var tri = new Triangle(10,5);
        System.out.println(tri.calculateArea());
        var rect = new Rectangle(10,5);
        System.out.println(rect.calculateArea());



        var user = new User("内間","okinawa","19990702");
        var user2 = new User("内間","okinawa","19990702");

        System.out.println(user);
        System.out.println(user.equals(user2));


    }




}
