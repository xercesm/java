import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Item> items;
    private List<Schedule> schedules;
    private List<Gradebook> gradebooks;
    private List<Library> libraries;

    public School(){
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        items = new ArrayList<Item>();
        schedules = new ArrayList<Schedule>();
        gradebooks = new ArrayList<Gradebook>();
        libraries = new ArrayList<Library>();
    }
    public void addStudent(Student s){
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }
    public void addItem(Item i){
        items.add(i);
    }
    public void addSchedule(Schedule s){
        schedules.add(s);
    }
    public void addGradebook(Gradebook g){
        gradebooks.add(g);
    }
    public void addLibrary(Library l){
        libraries.add(l);
    }
    public void displayStudents(){
        System.out.println("Студенты: ");
        for (Student s : students){
            s.display();
            System.out.println();
        }
    }
    public void displayTeacher(){
        System.out.println("Преподаватели: ");
        for (Teacher t: teachers){
            t.display();
            System.out.println();
        }
    }
    public void displayItem(){
        System.out.println("Предметы: ");
        for (Item i : items){
            i.display();
            System.out.println();
        }
    }
    public void displaySchedule(){
        System.out.println("Расписание: ");
        for (Schedule s : schedules){
            s.display();
            System.out.println();
        }
    }
    public void displayGradebook(){
        System.out.println("Табель успеваемости: ");
        for (Gradebook g: gradebooks){
            g.display();
            System.out.println();
        }
    }
    public void displayLibrary(){
        System.out.println("Библиотека: ");
        for (Library l: libraries){
            l.display();
            System.out.println();
        }
    }
}
