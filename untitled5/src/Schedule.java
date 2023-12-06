import java.util.Arrays;


public class Schedule {
    private String day;
    private String[] classes;

    public Schedule(String day, String[] classes) {
        this.day = day;
        this.classes = classes;
    }

    public void display(){
        System.out.printf("РАСПИСАНИЕ \n День: %s \tПары: %s\n", day, Arrays.toString(classes));
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return ("5 декабря");
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public String[] getClasses() {
        return new String[]{"Системное программирование", "Тестирование программных модулей", "Основы философии"};
    }
}