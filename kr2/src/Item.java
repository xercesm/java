import java.util.Scanner;

public class Item{
    private String itemName;
    private int quantity;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }


    public void display(){
        System.out.printf("ИНВЕНТАРЬ: \n Название инвентаря: %s \tКоличество: %s\n", itemName, quantity);

    }
}