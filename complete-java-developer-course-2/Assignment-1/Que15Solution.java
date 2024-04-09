package Assignment_1;

import java.util.*;

public class Que15Solution {
    private Map<Integer, Student> students;

    public Que15Solution() {
        students = new HashMap<>();
    }

    // Method to add a student record
    public void addStudent(int id, String name, int age, String grade) {
        Student student = new Student(name, age, grade);
        students.put(id, student);
        System.out.println("Student record added successfully.");
    }

    // Method to display all student records
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("Student Records:");
        for (Map.Entry<Integer, Student> i : students.entrySet()) {
            System.out.println("ID: " + i.getKey() + ", " + i.getValue());
        }
    }

    // Method to update a student record
    public void updateStudent(int id, String name, int age, String grade) {
        if (students.containsKey(id)) {
            Student student = students.get(id);
            student.setName(name);
            student.setAge(age);
            student.setGrade(grade);
            System.out.println("Student record updated successfully.");
        } else {
            System.out.println("Student record with ID " + id + " not found.");
        }
    }

    // Method to remove a student record
    public void removeStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student record with ID " + id + " removed successfully.");
        } else {
            System.out.println("Student record with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Que15Solution studentDetails = new Que15Solution();

        while (true) {
            System.out.println("\nStudent Management System using HashMap:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine();
                    studentDetails.addStudent(id, name, age, grade);
                    break;
                
                case 2:
                    studentDetails.displayStudents();
                    break;
                
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter updated name: ");
                    String updatedName = sc.nextLine();
                    System.out.print("Enter updated age: ");
                    int updatedAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter updated grade: ");
                    String updatedGrade = sc.nextLine();
                    studentDetails.updateStudent(updateId, updatedName, updatedAge, updatedGrade);
                    break;
               
                case 4:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = sc.nextInt();
                    studentDetails.removeStudent(removeId);
                    break;
                
                case 5:
                    System.out.println("Exiting from the Student Managaement System.....");
                    sc.close();
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}


class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
