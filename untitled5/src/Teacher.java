import java.util.Scanner;

class Teacher extends Person implements SchoolMember {
    private String subject;
    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void display() {
        System.out.printf("ПРЕПОДАВАТЕЛЬ: \n Имя студента: %s \tФамилия студента: %s \tВозраст: %s \tПредмет: %s\n",super.getFirstName(), super.getLastName(), super.getAge(), subject);

    }
}