package function;
import java.util.*;

public class LambdaPractice {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        Student user[] ={
                new Student("uchima",10),
                new Student("kakazu",20),
                new Student("sashida",30),
                new Student("hirata",40),
                new Student("matayoshi",50),
        };

        int totalScore = Arrays.stream(user)
                .mapToInt(Student::score)
                .sum();

        System.out.println("Total score: " + totalScore);
//        System.out.println(Arrays.stream(user).mapToInt((s -> s.score().sum))

    }


//    System.out.println(list.stream().mapToInt(s -> s.intValue()).sum())System.out.println(stu
}
