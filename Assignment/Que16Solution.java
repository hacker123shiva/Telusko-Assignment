import java.util.HashMap;
import java.util.Scanner;

class ContactList {
    private HashMap<String, Contact> contacts;

    public ContactList() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.put(name.toLowerCase(), contact);
    }

    public Contact getContact(String name) {
        return contacts.get(name.toLowerCase());
    }

    public void removeContact(String name) {
        contacts.remove(name.toLowerCase());
    }
 

   
        public static void main(String[] args) {
            ContactList contactList = new ContactList();
            Scanner sc = new Scanner(System.in);
    
            boolean exit = false;
    
            while (!exit) {
                System.out.println("Choose an option:");
                System.out.println("1. Add Contact");
                System.out.println("2. Remove Contact");
                System.out.println("3. Search Contact");
                System.out.println("4. Exit");
    
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline
    
                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter phone number:");
                        String phoneNumber = sc.nextLine();
                        System.out.println("Enter email:");
                        String email = sc.nextLine();
                        contactList.addContact(name, phoneNumber, email);
                        System.out.println("Contact added successfully.");
                        break;
                    case 2:
                        System.out.println("Enter the name of the contact you want to remove:");
                        String removeName = sc.nextLine();
                        contactList.removeContact(removeName);
                        System.out.println("Contact removed.");
                        break;
                    case 3:
                        System.out.println("Enter the name of the contact you want to search:");
                        String searchName = sc.nextLine();
                        Contact contact = contactList.getContact(searchName);
                        if (contact != null) {
                            System.out.println("Name: " + contact.getName());
                            System.out.println("Phone Number: " + contact.getPhoneNumber());
                            System.out.println("Email: " + contact.getEmail());
                        } else {
                            System.out.println("Contact not found");
                        }
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Please enter a valid choice (1-4).");
                }
            }
            sc.close();
        }
    }
    

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name.toLowerCase();
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}


 