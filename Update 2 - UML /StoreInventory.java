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

    // In Item class
    private final AtomicInteger quantity = new AtomicInteger();
    
    // In StoreInventory
    public boolean buyItem(String itemName) {
        Item item = inventory.get(itemName);
        if (item != null) {
            int prev;
            do {
                prev = item.getQuantity();
                if (prev == 0) return false;
            } while (!item.getQuantityAtomic().compareAndSet(prev, prev - 1));
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
