package oop2;

public class Circle  implements Shape {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int calculateArea(){
        var answer = (int)(radius*radius*3.14);
        return answer;
    }

}
