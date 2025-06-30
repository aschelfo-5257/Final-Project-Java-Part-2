import java.util.ConcurrentHashMap;
import java.util.Map;

public class StoreInventory {
    private final Map<String, Item> inventory = new ConcurrentHashMap<>();

    public void addItem(Item item) {
        if (item == null || item.getName() == null) {
            throw new IllegalArgumentException("Item and item name must not be null.");
        }
        inventory.put(item.getName(), item);
    }

    public boolean buyItem(String itemName) {
        Item item = inventory.get(itemName);
        if (item != null && item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity() - 1);
            return true;
        }
        return false;
    }

    public int getItemQuantity(String itemName) {
        Item item = inventory.get(itemName);
        return (item != null) ? item.getQuantity() : 0;
    }
}
// Important Note: Use ConcurrentHashMap instead of HashMap.
