import java.util.HashMap;
import java.util.Map;

public class StoreInventory {
    private Map<String, Item> inventory = new HashMap<>();

    public void addItem(Item item) {
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
