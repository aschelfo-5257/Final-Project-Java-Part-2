import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ItemDatabase {
    private Map<String, Item> items = new ConcurrentHashMap<>();
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
