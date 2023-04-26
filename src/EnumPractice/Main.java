package EnumPractice;

public class Main {
    public static void main(String[] args){
        DayOfWeek dayOfWeek = DayOfWeek.getDayOfWeek(1999, 7, 3);
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek.Sunday.getLabel());
    }
}
