import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {
    private List<Item> items;

    public PlayerInventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            for (Item i : items) {
                System.out.println("- " + i.getName());
            }
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
