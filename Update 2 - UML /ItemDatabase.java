import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ItemDatabase {
    private Map<String, Item> items = new ConcurrentHashMap<>();

    public ItemDatabase() {
        // Example initialization
        items.put("Sword", new Item("Sword"));
        items.put("Shield", new Item("Shield"));
    }

    public Item getItemByName(String name) {
        return items.get(name);
    }

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
