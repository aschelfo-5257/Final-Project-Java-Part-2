## Game Inventory Class Diagram

Based on the provided GameInventory.java file, this diagram represents for class and its immediate relationships as implied by the main method.

    +-------------------+
    |   GameInventory   |
    +-------------------+
    | <<static>> main() |
    +-------------------+
            |
            | uses
            v
    +-------------------+
    |   ItemDatabase    |
    +-------------------+
    | +getItemByName()  |
    +-------------------+
            |
            |
            v
    +-------------------+
    |      Item         |
    +-------------------+
    |                   |
    +-------------------+
    
    +-------------------------+
    |   PlayerInventory       |
    +-------------------------+
    | +addItem(Item)          |
    | +removeItem(Item)       |
    | +displayInventory()     |
    +-------------------------+
---
## Inventory Item Class Diagram

The constructor of InventoryItem ensures that weight, value, and quantity cannot be negative. All fields (itemName, itemDescription, itemWeight, itemValue, itemQuantity) are private. Only itemQuantity is mutable after the object is created, and even then, only through a setter method that enforces the non-negative rule.

    +--------------------+
    |  InventoryItem     |
    +--------------------+
    | - itemName: String |
    | - itemDescription: String |
    | - itemWeight: double      |
    | - itemValue: int          |
    | - itemQuantity: int       |
    +--------------------+
    | + InventoryItem(name: String, description: String, weight: double, value: int, quantity: int) |
    | + getName(): String         |
    | + getDescription(): String  |
    | + getWeight(): double       |
    | + getValue(): int           |
    | + getQuantity(): int        |
    | + setQuantity(quantity: int): void |
    | + toString(): String        |
    +---------------------+
---
## Item Database Class Diagram

Item class has a private String field name, a constructor, and a toString() method. The ItemDatabase class has a private Map<String, Item> field called items, a constructor, an getItemByName(String) method, and a main method. ItemDatabase uses the Item class by storing Item objects in its items map.

    +----------------+           +------------------+
    |    Item        |           |  ItemDatabase    |
    +----------------+           +------------------+
    | - name: String |           | - items: Map<String, Item> |
    +----------------+           +------------------+
    | + Item(name: String)       | + ItemDatabase()           |
    | + toString(): String       | + getItemByName(name: String): Item |
    +----------------+           | + main(args: String[]): void        |
                                 +------------------+
    
    Relationship:
    ItemDatabase "has a" collection of Item objects (composition/aggregation via Map)
---
## Player Inventory Class Diagram

PlayerInventory has a Set of Item objects, with an association (composition/aggregation) to Item. The item has fields and methods for name handling and equality. The inventory is designed to prevent duplicate items by using a Set<Item> collection. This means each item can only exist once in a player's inventory.

    +---------------------+
    |     PlayerInventory |
    +---------------------+
    | - items: Set<Item>  |
    | - capacity: int     |
    +---------------------+
    | + PlayerInventory()         |
    | + PlayerInventory(int)      |
    | + addItem(item: Item): boolean      |
    | + removeItem(item: Item): boolean   |
    | + displayInventory(): void          |
    +---------------------+
    
    +----------+
    |   Item   |
    +----------+
    | - name: String      |
    +----------+
    | + Item(name: String)           |
    | + getName(): String            |
    | + equals(obj: Object): boolean |
    | + hashCode(): int              |
    +----------+
    
    Relationship:
    PlayerInventory 1 ---- 0..* Item
    (items: Set<Item>)
---
## Store Inventory

StoreInventory contains a Map of String to Item. StoreInventory has the methods: addItem, buyItem, and getItemQuantity. Item is an inner class of StoreInventory, with fields name and quantity, a constructor, and getter methods.

    +---------------------+
    |   StoreInventory    |
    +---------------------+
    | - inventory: Map<String, Item> |
    +---------------------+
    | + addItem(item: Item): void    |
    | + buyItem(itemName: String): boolean |
    | + getItemQuantity(itemName: String): int |
    +---------------------+
               |
               | contains
               v
    +---------------------+
    |      Item           |
    +---------------------+
    | - name: String      |
    | - quantity: int     |
    +---------------------+
    | + Item(name: String, quantity: int) |
    | + getName(): String                 |
    | + getQuantity(): int                |
    +---------------------+
