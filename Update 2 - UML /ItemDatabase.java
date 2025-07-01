public class ItemDatabase {
    // Needed a method to retrieve an item by name
    public Item getItemByName(String name) {
        // For demonstration, return a new Item with the given name
        return new Item(name);
    }

    // Main method to make the class runnable
    public static void main(String[] args) {
        ItemDatabase db = new ItemDatabase();
        Item item = db.getItemByName("Sword");
        System.out.println("Retrieved item: " + item);
    }
}

// Sample Item class for demonstration
class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
