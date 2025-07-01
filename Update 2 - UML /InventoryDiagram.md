## Game Inventory

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
## Inventory-Related Classes (UML Diagram - Text Representation)

    +-------------------+        +------------------+
    |  PlayerInventory  |<>----->|      Item        |
    +-------------------+        +------------------+
    | - items: Set<Item>|        | - name: String   |
    | - capacity: int   |        +------------------+
    |-------------------|        | +getName()       |
    | +addItem(Item)    |        | +equals(), etc.  |
    | +removeItem(Item) |        +------------------+
    | +displayInventory()|
    +-------------------+
    
    +-------------------+        +------------------------+
    |  StoreInventory   |<>----->| StoreInventory.Item    |
    +-------------------+        +------------------------+
    | - inventory: Map  |        | - name: String         |
    |                   |        | - quantity: int        |
    | +addItem(Item)    |        | +getName()             |
    | +buyItem(String)  |        | +getQuantity()         |
    | +getItemQuantity()|        +------------------------+
    +-------------------+
    
    +------------------+
    |  InventoryItem   |
    +------------------+
    | - itemName       |
    | - itemDesc       |
    | - itemWeight     |
    | - itemValue      |
    | - itemQuantity   |
    +------------------+
    | +getName()       |
    | +getQuantity()   |
    | +setQuantity()   |
    +------------------+
