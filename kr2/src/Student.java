

public class Student extends Person implements SchoolMember {
    private int gradeLevel;

    public Student(String firstName, String lastName, int age, int gradeLevel) {
        super(firstName, lastName, age);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void display() {
        System.out.printf("СТУДЕНТ: \n Имя студента: %s \tФамилия студента: %s \tВозраст: %s \tУспеваемость: %s\n",super.getFirstName(), super.getLastName(), super.getAge(), gradeLevel);

    }
}


