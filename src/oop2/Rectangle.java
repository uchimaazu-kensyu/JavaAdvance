package oop2;

public class Rectangle implements Shape {
    int height;
    int width;

    public Rectangle(int height, int width){
        this.height= height;
        this.width=width;

    }

    @Override
    public int calculateArea(){
        return (height*width);

    }

}
