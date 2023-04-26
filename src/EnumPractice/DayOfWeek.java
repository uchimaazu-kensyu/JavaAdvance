package EnumPractice;
import java.util.Calendar;

public enum DayOfWeek {
    Sunday("日曜日"),Monday("月曜日"),Tuesday("火曜日"),Wednesday("水曜日"),Thursday("木曜日"),Friday("金曜日"),Saturday("土曜日");

    private final String label;

    DayOfWeek(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }



    public static DayOfWeek getDayOfWeek(int year,int month,int day){
        var cal = Calendar.getInstance();
        DayOfWeek answer;
        cal.set(year,month,day);
        switch (cal.get(Calendar.DAY_OF_WEEK)){
            case 1 : answer = Monday;
            break;
            case 2 : answer = Tuesday;
            break;
            case 3 : answer = Wednesday;
            break;
            case 4 : answer = Thursday;
            break;
            case 5 : answer = Friday;
            break;
            case 6 : answer = Saturday;
            break;
            default: answer = Sunday;
        }
        return answer;
    }

}
