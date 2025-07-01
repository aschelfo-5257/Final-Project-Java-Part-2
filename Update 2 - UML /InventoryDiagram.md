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
