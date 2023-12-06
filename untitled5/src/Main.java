import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {
    private JPanel panel1;
    private JButton студентButton;
    private JButton преподавательButton;
    private JButton инвентарьButton;
    private JButton расписаниеButton;
    private JButton табельУспеваемостиButton;
    private JButton библиотекаButton;

    public Main() {
        студентButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                Student st = new Student("Ольга ", "Оранская", 17, 5);
                school.addStudent(st);
                st.display();

                String message = "Студент: " + st.getFirstName() + st.getLastName() + "\n" +
                        "Возраст: " + st.getAge() + "\n" +
                        "Успеваемость: " + st.getGradeLevel();

                JOptionPane.showMessageDialog(null, message);
            }
        });

        преподавательButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                Teacher tea = new Teacher("Анастасия Алексеевна ", "Кошкина", 34,"Разработка программных модулей");
                school.addTeacher(tea);
                tea.display();

                String message = "Преподаватель: " + tea.getFirstName() + tea.getLastName() + "\n" +
                        "Возраст: " + tea.getAge() + "\n" +
                        "Предмет: " + tea.getSubject();

                JOptionPane.showMessageDialog(null, message);
            }
        });

        инвентарьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                Item it = new Item("Компьютер", 17);
                school.addItem(it);
                it.display();

                String message = "Инвентарь: " + it.getItemName() + "\n" +
                        "Количество: " + it.getQuantity();

                JOptionPane.showMessageDialog(null, message);
            }
        });

        расписаниеButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                String[] classes = {"Системное программирование", "Тестирование программных модулей", "Основы философии"};
                Schedule sc1 = new Schedule("Понедельник", classes);
                school.addSchedule(sc1);
                sc1.display();

                String message = "Расписание: " + sc1.getDay() + "\n" +
                        "Предметы: " + Arrays.toString(sc1.getClasses());

                JOptionPane.showMessageDialog(null, message);
            }
        });

        табельУспеваемостиButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                int[] grades = {2, 2, 3, 2};
                Gradebook grade = new Gradebook("Олеся", "Белая", 17, "Системное программирование", grades);
                school.addGradebook(grade);
                grade.display();

                String message = "Табель успеваемости: " + grade.getFirstName() + " " + grade.getLastName() + "\n" +
                        "Возраст: " + grade.getAge() + "\n" +
                        "Предмет: " + grade.getSubject() + "\n" +
                        "Оценки: " + Arrays.toString(grade.getGrades());

                JOptionPane.showMessageDialog(null, message);
            }
        });

        библиотекаButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School();
                Library lib = new Library("Джава для чайников", "Еременко Данил Сергеевич", 1);
                school.addLibrary(lib);
                lib.display();

                String message = "Книга: " + lib.getTitle() + "\n" +
                        "Автор: " + lib.getAuthor() + "\n" +
                        "Количество: " + lib.getNumCopies();

                JOptionPane.showMessageDialog(null, message);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}