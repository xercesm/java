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
}
