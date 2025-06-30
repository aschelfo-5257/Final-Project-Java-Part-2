public class GameInventory {
    public static void main(String[] args) {
        ItemDatabase database = new ItemDatabase();
        PlayerInventory playerInventory = new PlayerInventory();

        Item sword = database.getItemByName("Sword");
        Item potion = database.getItemByName("Potion");
        // Represents the player class that manages or stores game items in the inventory (Does not show in the snippet.)
        playerInventory.addItem(sword); // Items added sword to the PlayerInventory.
        playerInventory.addItem(potion); // Items added potion to the PlayerInventory.
        playerInventory.displayInventory(); // The player's inventory has to be displayed.

        playerInventory.removeItem(sword);
        playerInventory.displayInventory();
    }
}
/* Important Note: In Update 2 - UML dictionary, all of the class files needed to be separated from the game system to run the compiled file smoothly.

    Named the separate file:
    - GameInventory.java
    - Item.java
    - PlayerInventory.java
    - StoreInventory.java
*/
