package oop2;

public class ShapeTest {

//    Shape[] areas;
    public static void main(String[] args){

        Shape[] areas = {
                new Triangle(10,4),
                new Triangle(4,3),
                new Circle(10),
                new Circle(15),
                new Rectangle(10,20),
                new Rectangle(12,5)
        };
        
//        var tri = new Triangle(10,4);
////        var tri2 = new Triangle(4,3);
//        var rect = new Rectangle(7,11);
//        var cir = new Circle(10);


//        Shape[] areas = {tri,rect,cir};


        var total = getTotalArea(areas);
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
