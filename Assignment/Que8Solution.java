import java.util.ArrayList;
import java.util.List;

 class Person {
   
    private String name;
    private int age;
    private String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setter methods
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be null or empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID cannot be null or empty.");
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Person object
 

      Person person = new Person("John Doe", 30, "123456789");
      
        // Displaying person information
        person.displayInfo();

        // Modifying attributes
        person.setName("Jane Smith");
        person.setAge(25);
        person.setId("987654321");

        // Displaying modified information
        person.displayInfo();


        
    }
}
