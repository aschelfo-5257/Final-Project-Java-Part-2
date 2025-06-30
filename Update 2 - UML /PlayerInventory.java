import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {
    private final List<Item> items;

    public PlayerInventory() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (item == null) return false;
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
        return true;
    }

    public void removeItem(Item item) {
        if (item == null) {
            System.out.println("Cannot remove null item from inventory.");
            return;
        }
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        if (items.isEmpty()) {
            System.out.println("Empty.");
        } else {
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }
}
