public class ItemDatabase {
    // Needed a method to retrieve an item by name
    public Item getItemByName(String name) {
        // For demonstration, return a new Item with the given name
        return new Item(name);
    }
}
