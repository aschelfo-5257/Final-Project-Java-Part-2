public class GameInventory {
    public static void main(String[] args) {
        ItemDatabase database = new ItemDatabase();
        // Represents the item database that contains all items available in the game.
        PlayerInventory playerInventory = new PlayerInventory();

        Item sword = database.getItemByName("Sword");
        Item potion = database.getItemByName("Potion");
        // Represents the player class that manages or stores game items in the inventory (Does not show in the snippet.)
        if (sword != null) playerInventory.addItem(sword); // Items added sword to the PlayerInventory.
        if (potion != null) playerInventory.addItem(potion); // Items added potion to the PlayerInventory.

        if (sword != null) playerInventory.removeItem(sword); // Removes the “Sword” from the inventory and displays the inventory again.
        if (potion != null) playerInventory.removeItem(potion); // Removes the “Potion” from the inventory and displays the inventory again.
        playerInventory.displayInventory(); // The player's inventory has to be displayed.
    }
}
/* Important Note: In Update 2 - UML dictionary, all of the class files should be separated for compilation. Make sure each class (GameInventory, Item, PlayerInventory, StoreInventory) is in its own file and named accordingly.

    Named the separate file:
    - GameInventory.java
    - Inventory.java
    - PlayerInventory.java
    - StoreInventory.java
*/
