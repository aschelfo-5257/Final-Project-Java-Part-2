import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PlayerInventory {
    private List<Item> items; // Using ArrayList for simplicity 
  
  public PlayerInventory() {
    this.items = new ArrayList<>(); // Player Inventory class is important to represent the store item for the ArrayList.
  }
  
  public void addItem(Item item) {
    items.add(item);
    System.out.println(item.getName() + " added to inventory.");
    // Add items for the management inventory system!
  }
  
  public void removeItem(Item item) {
    if (items.remove(item)) {
      System.out.println(item.getName() + " removed from inventory.")
    } else {
      for (Item item: items) {
        System.out.println("- " + item.getName());
      }
    // Remove items for the management inventory system  
    }
  }
    // Other methods for item management such as (equip, use, display, etc.)
  public void displayInventory() {
    System.out.println("Inventory:");
    if (items.isEmpty()) {
      System.out.println("Empty.");
    } else {
      for (Item item: items) {
        System.out.println("- " + item.getName());
      }
    }
  }
}

public class Item {
  private String name;
  private String price;
  private double quantity;
  private int value;

  public Item(String name, String description, double weight, int value) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
    }
  // Getters and setters omitted for brevity
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public int getValue() { return value; }
}

public class StoreInventory {
  private Map<String, Item> inventory = new Hashmap<>();

  // Add an item to the inventory
  public void addItem(Item item) {
    inventory.put(item.getName(), item);
  }

  // Buy an item (decrease quantity)
    public boolean buyItem(String itemName) {
        Item item = inventory.get(itemName);
        if (item != null && item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity() - 1);
            return true;
        }
        return false;
    }
  // Check item availability
    public int getItemQuantity(String itemName) {
        Item item = inventory.get(itemName);
        return (item != null) ? item.getQuantity() : 0;
    }
    // etc...
}
public class GameInventory {
  public static void main (String [] args) {
    ItemDatabase database = new ItemDatabase();
    PlayerInventory playerInventory = new PlayerInventory();

    Item sword = database.getItemByName("Sword");
    Item potion = database.getItemByName("Potion");

    playerInventory.addItem(sword);
    playerInventory.addItem(potion);
    playerInventory.displayInventory();

    playerInventory.removeItem(sword);
    playerInventory.displayInventory();
  }
}
