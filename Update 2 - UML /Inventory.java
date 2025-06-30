public class Inventory {
    private String itemName;
    private String itemDescription;
    private double itemWeight;
    private int itemValue;
    private int itemQuantity; // Add quantity
    // Represents an inventory with name, description, weight, value, and quantity.
    // Set the IllegalArgumentException to prevent negative numbers.
    public Inventory(String name, String description, double weight, int value, int quantity) {
        if (weight < 0 || value < 0 || quantity < 0)
            throw new IllegalArgumentException("Weight, value, and quantity must be non-negative");
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
        this.quantity = quantity;
    }
    // All public value items must be getters for properties.
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public int getValue() { return value; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        // The Quantity must not have a negative.
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity must be non-negative");
        this.quantity = quantity;
    }

    @Override
    public String toString() {
    return name + " (" + description + "), Weight: " + weight + ", Value: " + value + ", Quantity: " + quantity;
}
}
