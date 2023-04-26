package collection;
import java.util.*;

public class ListPractice {
    public static void main (String[] args){

        var sc = new Scanner(System.in);
        var input = sc.nextLine();
        List<String> nameList = new ArrayList<>();

        while (!input.equals("exit")){
            nameList.add(input);
            input = sc.nextLine();
        }

        System.out.println("最初に入力された人:"+nameList.get((0)));
        System.out.println("最後に入力された人:"+nameList.get((nameList.size()-1)));
        System.out.println("名前で並び替えます");
        Collections.sort(nameList);
        for(var e :nameList  ){
            System.out.println(e);
        }


    }
}
