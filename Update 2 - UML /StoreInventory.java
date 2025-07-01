import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * StoreInventory manages items in a thread-safe manner using ConcurrentHashMap.
 * 
 * Important Note: Use ConcurrentHashMap instead of HashMap. This is appropriate for thread-safe operations.
 * If Item is mutable beyond quantity, ensure all modifications are safe.
 */
public class StoreInventory {
    private final Map<String, Item> inventory = new ConcurrentHashMap<>();

    /**
     * Adds an item to the inventory.
     * @param item The item to add; must not be null.
     * @throws IllegalArgumentException if the item or its name is null.
     */
    public void addItem(Item item) {
        if (item == null || item.getName() == null) {
            throw new IllegalArgumentException("Item and item name must not be null.");
        }
        inventory.put(item.getName(), item);
    }

public boolean buyItem(String itemName) { 
    Item item = inventory.get(itemName);
    if (item != null) {
        synchronized (item) {
            if (item.quantity > 0) {
                item.quantity--;
                return true;
            }
        }
    }
    return false;
    // The buyItem method decreases the item quantity in a thread-safe manner.
}
    public int getItemQuantity(String itemName) {
        Item item = inventory.get(itemName);
        return (item != null) ? item.getQuantity() : 0;
    }
    public class Item {
        private String name;
        private int quantity;

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }
    }}
