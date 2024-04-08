
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

  class ArrayListVsLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Retrieve element");
            System.out.println("4. Compare and display time taken");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add:");
                    int element = scanner.nextInt();

                    long arrayListStartTime = System.nanoTime();
                    arrayList.add(element);
                    long arrayListEndTime = System.nanoTime();
                    System.out.println("Time taken to add to ArrayList: " + (arrayListEndTime - arrayListStartTime) + " nanoseconds");

                    long linkedListStartTime = System.nanoTime();
                    linkedList.add(element);
                    long linkedListEndTime = System.nanoTime();
                    System.out.println("Time taken to add to LinkedList: " + (linkedListEndTime - linkedListStartTime) + " nanoseconds");
                    break;
                case 2:
                    System.out.println("Enter index to remove:");
                    int index = scanner.nextInt();

                    if (index >= 0 && index < arrayList.size()) {
                        long arrayListRemoveStartTime = System.nanoTime();
                        arrayList.remove(index);
                        long arrayListRemoveEndTime = System.nanoTime();
                        System.out.println("Time taken to remove from ArrayList: " + (arrayListRemoveEndTime - arrayListRemoveStartTime) + " nanoseconds");
                    } else {
                        System.out.println("Invalid index for ArrayList");
                    }

                    if (index >= 0 && index < linkedList.size()) {
                        long linkedListRemoveStartTime = System.nanoTime();
                        linkedList.remove(index);
                        long linkedListRemoveEndTime = System.nanoTime();
                        System.out.println("Time taken to remove from LinkedList: " + (linkedListRemoveEndTime - linkedListRemoveStartTime) + " nanoseconds");
                    } else {
                        System.out.println("Invalid index for LinkedList");
                    }
                    break;
                case 3:
                    System.out.println("Enter index to retrieve:");
                    int retrieveIndex = scanner.nextInt();

                    if (retrieveIndex >= 0 && retrieveIndex < arrayList.size()) {
                        long arrayListRetrieveStartTime = System.nanoTime();
                        int arrayListElement = arrayList.get(retrieveIndex);
                        long arrayListRetrieveEndTime = System.nanoTime();
                        System.out.println("Element retrieved from ArrayList: " + arrayListElement);
                        System.out.println("Time taken to retrieve from ArrayList: " + (arrayListRetrieveEndTime - arrayListRetrieveStartTime) + " nanoseconds");
                    } else {
                        System.out.println("Invalid index for ArrayList");
                    }

                    if (retrieveIndex >= 0 && retrieveIndex < linkedList.size()) {
                        long linkedListRetrieveStartTime = System.nanoTime();
                        int linkedListElement = linkedList.get(retrieveIndex);
                        long linkedListRetrieveEndTime = System.nanoTime();
                        System.out.println("Element retrieved from LinkedList: " + linkedListElement);
                        System.out.println("Time taken to retrieve from LinkedList: " + (linkedListRetrieveEndTime - linkedListRetrieveStartTime) + " nanoseconds");
                    } else {
                        System.out.println("Invalid index for LinkedList");
                    }
                    break;
                case 4:
                    System.out.println("ArrayList size: " + arrayList.size());
                    System.out.println("LinkedList size: " + linkedList.size());
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

 

/*
 Observation

 time taken to add in Arraylist
 1) It is fast as compare to linkedlist
 2) When we add elment getter than capacity of arraylist then 
 it will create new arraylist with double size and copy all the elements from old arraylist to new arraylist in this scenario
    time taken to add element will be more than time ac compare to linkedlist

time taken to remove  in Arraylist
1) It is slow as compare to linkedlist
2) When we remove element from arraylist then ist will shift all the elements to left side to fill the gap
    time taken to remove element will be more than time ac compare to linkedlist 


time taken to retrieve  in Arraylist
1) It is fast as compare to linkedlist 
2) When we retrieve element from arraylist then it will directly access the element using index
    time taken to retrieve element will be less than time ac compare to linkedlist

 */