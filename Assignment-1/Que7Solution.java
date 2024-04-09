package Assignment_1;

public class Product {
	private String name;
    private double price;
    private int quantity;

    // Constructor with all attributes
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Constructor with name and price only
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // Default quantity is set to 1
        this.quantity = 1;
    }

    // Constructor with name only
    public Product(String name) {
        this.name = name;
        // Default price and quantity are set to 0
        this.price = 0.0;
        this.quantity = 0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total value of products
    public double getTotalValue() {
        return price * quantity;
    }

    // toString method to represent Product object as a string
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
