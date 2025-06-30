public class Item {
    private String name;
    private String description;
    private double weight;
    private int value;
    private int quantity; // Add quantity

    public Item(String name, String description, double weight, int value, int quantity) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public int getValue() { return value; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
