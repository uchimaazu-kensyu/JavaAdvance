package oop2;

public class ShapeTest {

//    Shape[] areas;
    public static void main(String[] args){
        
        var tri = new Triangle(10,4);
        var rect = new Rectangle(7,11);
        var cir = new Circle(10);

        Shape[] areas = {tri,rect,cir};
        var total =getTotalArea(areas);
        System.out.println(total);
        
        
    }

    public static int getTotalArea(Shape[] areas){
        int total=0 ;
        for(int e=0 ; e< areas.length;e++){
            var area =areas[e].calculateArea();
            total += area;
        }
        return total;
    }
}
