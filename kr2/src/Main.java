
public class Main {
    public static void main(String[] args){
        School school = new School();
        Student olya = new Student("Ольга ", "Оранская", 17, 5);
        school.addStudent(olya);
        olya.display();

        Teacher koshkina = new Teacher("Анастасия Алексеевна ", "Кошкина", 34,"Разработка программных модулей");
        school.addTeacher(koshkina);
        koshkina.display();

        Item komp = new Item("Компьютер", 17);
        school.addItem(komp);
        komp.display();

        String[] classes = {"Системное программирование", "Тестирование программных модулей", "Основы философии"};
        Schedule sc1 = new Schedule("Понедельник", classes);
        school.addSchedule(sc1);
        sc1.display();

        int[] grades = {2, 2, 3, 2};
        Gradebook grade = new Gradebook("Олеся", "Белая", 17, "Системное программирование", grades);
        school.addGradebook(grade);
        grade.display();

        Library lib = new Library("Джава для чайников", "Еременко Данил Сергеевич", 1);
        school.addLibrary(lib);
        lib.display();
    }
}