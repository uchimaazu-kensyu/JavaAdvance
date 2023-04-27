package function;
import java.util.function.*;

public class FunctionObjectPractice {
    public static void main(String[] args) {

        Predicate <Integer> isEven = (Integer a) -> {
            return a%2 ==0;
        };

        Function<String,StringBuilder> rev = (String str) -> {
            StringBuilder sb = new StringBuilder();
            return sb.append(str);
        };

        BiFunction<String,String,String[]> split = (String str,String spl) ->{
            String[] strings = str.split(spl) ;
            for (String stri : strings) {
                System.out.println(stri);
            }
            return strings;
        };

        UnaryOperator<Integer> dub =(Integer a) -> {
            var result =0;
            for(var i =0; i<10;i++){
                result += 2 * a;
            }
            return  result;
        };

        BiFunction<String,Integer,String> combine = (String str,Integer times) ->{
            String result=str;
            for (var i =0 ;i<times ;i++) {
                result.concat(str);
            }
            return result;
        };






        isEven.test(55);
        String strings[] =split.apply("apple,orange,melon",",");











//        Reverse reverse =FunctionObjectPractice::reverse;
//        IsEven isEven =FunctionObjectPractice::isEven;

//        System.out.println(isEven(11));
//        System.out.println(isEven.test(8));

    }
//    public static StringBuilder reverse(String str){
//        StringBuilder sb = new StringBuilder();
//        return sb.append(str);
//    }

//    public static boolean isEven(int a){
//         if(a % 2 == 0){
//             return true;
//         }else {
//             return false;
//         }
//    }








}
