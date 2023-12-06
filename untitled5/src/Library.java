import java.util.Scanner;

public class Library {
    private String title;
    private String author;
    private int numCopies;

    public Library(String title, String author, int numCopies) {
        this.title = title;
        this.author = author;
        this.numCopies = numCopies;
    }

    public void display(){
        System.out.printf("БИБЛИОТЕКА: \n Название книги: %s \tАвтор: %s \tКоличество копий: %s\n", title, author, numCopies);

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return ("Джава для чайников");
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return ("Ерёменко Даниил Сергеевич");
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public int getNumCopies() {
        return 1;
    }
}