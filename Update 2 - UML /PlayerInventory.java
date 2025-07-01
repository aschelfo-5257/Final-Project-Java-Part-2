import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

// Temporary stub for Item class to resolve compilation error
class Item {
    private String name;
    public Item(String name) { this.name = name; }
    public String getName() { return name; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return name != null ? name.equals(item.name) : item.name == null;
        }
    
    
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

/**
 * PlayerInventory manages a collection of Item objects with a fixed capacity.
 * <p>
 * Note: Ensure that the Item class appropriately overrides equals() and hashCode().
 * This is critical for removeItem and preventing/managing duplicates.
 * Before adding, make sure there are no duplicates and there is enough capacity.
 * </p>
 */
public class PlayerInventory {
    private static final Logger logger = Logger.getLogger(PlayerInventory.class.getName());
    private final Set<Item> items;
    private final int capacity; // Inventory limit


    public PlayerInventory() {
        this(20); // Default capacity
    }

    public PlayerInventory(int capacity) { // Set inventory capacity
        this.items = new HashSet<>();
        this.capacity = capacity;
    }

    public boolean addItem(Item item) { // Adds an item to the inventory if possible.
        if (item == null) {
            logger.warning("Cannot add null item to inventory.");
            return false;
        }
        if (items.size() >= capacity) { // When the inventory is full, you cannot add more capacity unless you remove items.
            logger.info("Inventory is full. Cannot add: " + item.getName());
            return false;
        }
        if (!items.add(item)) { // The item is already in the inventory.
            logger.info(item.getName() + " is already in the inventory.");
            return false;
        }
        logger.info(item.getName() + " added to inventory.");
        return true;
    }
    // Removes an item from the inventory and logs the action.
    public boolean removeItem(Item item) { // You will need to add a logger for output, which is a more flexible inventory.
        if (item == null) {
            logger.warning("Cannot remove null item from inventory.");
            return false;
        }
        if (items.remove(item)) { // Removed from inventory
            logger.info(item.getName() + " removed from inventory.");
            return true;
        } else { // Cannot found in inventory
            logger.info(item.getName() + " not found in inventory.");
            return false;
        }
    }

    public void displayInventory() {
        logger.info("Inventory:");
        if (items.isEmpty()) {
            logger.info("Empty.");
        } else {
            for (Item item : items) {
                logger.info("- " + item.getName());
            }
        }
    }
    
