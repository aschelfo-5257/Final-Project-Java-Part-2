public class InventoryItem {
    private String itemName;
    private String itemDescription;
    private double itemWeight;
    private int itemValue;
    private int itemQuantity; // Add quantity

    // Represents an inventory item with name, description, weight, value, and quantity.
    // Prevents negative numbers for weight, value, and quantity.
    public InventoryItem(String name, String description, double weight, int value, int quantity) {
        if (weight < 0 || value < 0 || quantity < 0)
            throw new IllegalArgumentException("Weight, value, and quantity must be non-negative");
        this.itemName = name;
        this.itemDescription = description;
        this.itemWeight = weight;
        this.itemValue = value;
        this.itemQuantity = quantity;
    }

    // All fields are accessed via getters to maintain encapsulation.
    public String getName() { return itemName; }
    public String getDescription() { return itemDescription; }
    public double getWeight() { return itemWeight; }
    public int getValue() { return itemValue; }
    public int getQuantity() { return itemQuantity; }

    public void setQuantity(int quantity) {
        // Quantity must not be negative.
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity must be non-negative");
        this.itemQuantity = quantity;
    }

    @Override
    public String toString() {
        return itemName + " (" + itemDescription + "), Weight: " + itemWeight + ", Value: " + itemValue + ", Quantity: " + itemQuantity;
    }
}

