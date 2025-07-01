import java.util.Map;
import java.util.HashMap;

// Simple Item class definition
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

public class ItemDatabase {
    private Map<String, Item> items = new HashMap<>();

    public ItemDatabase() {
        // Sample items added for demonstration purposes
        items.put("Sword", new Item("Sword"));
        items.put("Shield", new Item("Shield"));
    }

    /**
     * Retrieves an Item from the database by its name.
     *
     * @param name the name of the item to retrieve
     * @return the Item object if found, or null if not found
     */
    public Item getItemByName(String name) {
        return items.get(name);
    }

    public static void main(String[] args) {
        ItemDatabase db = new ItemDatabase();
        Item item = db.getItemByName("Sword");
        System.out.println("Retrieved item: " + item);
    }
}
