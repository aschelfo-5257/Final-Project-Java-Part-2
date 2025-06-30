import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PlayerInventory {
    private static final Logger logger = Logger.getLogger(PlayerInventory.class.getName());
    private final List<Item> items;
    private final int capacity; // Inventory limit

    public PlayerInventory() {
        this(20); // Default capacity
    }

    public PlayerInventory(int capacity) { // Capacity is important for player inventory pick up and remove items.
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean addItem(Item item) { // The reason you need to add a warning is to prevent adding more inventory.
        if (item == null) {
            logger.warning("Cannot add null item to inventory.");
            return false;
        }
        if (items.size() >= capacity) { // When the inventory is full, you cannot add more capacity unless you remove items.
            logger.info("Inventory is full. Cannot add: " + item.getName());
            return false;
        }
        if (items.contains(item)) { // The item is already in the inventory.
            logger.info(item.getName() + " is already in the inventory.");
            return false;
        }
        items.add(item); // Added to inventory
        logger.info(item.getName() + " added to inventory.");
        return true;
    }

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
                // If Item has more details, display them here
                logger.info("- " + item.getName());
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getItemCount() {
        return items.size();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items); // Defensive copy
        // Defensive copying in getItems() to prevent external modification.
    }
}
/* 
Note: Ensure that the Item class appropriately overrides equals() and hashCode(). This is critical for removeItem and preventing/managing duplicates. Before adding, make sure there are no duplicates and there is enough capacity. 
*/
