package Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class Que19Solution<T> {
    private List<T> elements;

    public Que19Solution() {
        elements = new ArrayList<>();
    }

    // Method to add an element to the list
    public void addElement(T ele) {
        elements.add(ele);
    }

    // Method to get an element from the list by index
    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    // Method to display the list contents
    public void displayList() {
        System.out.println("List Contents:");
        for (T i : elements) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Create a CustomList of integers
        Que19Solution<Integer> integerList = new Que19Solution<>();
        integerList.addElement(10);
        integerList.addElement(20);
        integerList.addElement(30);

        // Display the integer list
        System.out.println("Integer List:");
        integerList.displayList();

        // Create a CustomList of strings
        Que19Solution<String> stringList = new Que19Solution<>();
        stringList.addElement("java");
        stringList.addElement("spring");
        stringList.addElement("hibernate");

        // Display the string list
        System.out.println("\nString List:");
        stringList.displayList();
    }
}
