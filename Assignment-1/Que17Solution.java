package Assignment_1;

import java.util.List;

public class Que17Solution{

    // Method to display the contents of a list of any type using wildcard
    public static void displayList(List<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
       
    	// Create lists of different types
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("red", "blue", "orange","green");
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);

        // Display contents of lists using the displayListContents method
        System.out.println("Contents of Integer List:");
        displayList(integerList);

        System.out.println("\nContents of String List:");
        displayList(stringList);

        System.out.println("\nContents of Double List:");
        displayList(doubleList);
    }
}
