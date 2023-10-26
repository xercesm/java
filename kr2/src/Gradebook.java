
import java.util.Arrays;
import java.util.Map;


public class Gradebook extends Person implements SchoolMember {
    private String subject;
    private int[] grades;

    public Gradebook(String firstName, String lastName, int age, String subject, int[] grades){
        super(firstName, lastName, age);
        this.subject = subject;
        this.grades = grades;
    }

    @Override
    public void display() {
        System.out.printf("ТАБЕЛЬ УСПЕВАЕМОСТИ: \n Имя студента: %s \tФамилия студента: %s \t Возраст: %s \tПредмет: %s \tОценки: %s\n", super.getFirstName(),
                super.getLastName(), super.getAge(), subject, Arrays.toString(grades));
    }
}
